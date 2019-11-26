package jsonschema2scala.generator

import java.io.{File, PrintWriter}

import jsonschema2scala.parser.model.{JsonSchema, JsonSchemaProperty}

import scala.collection.mutable

object CaseClassGenerator extends ScalaGenerator {

  protected val attributesTag: String    = "@attributes@"
  protected val attributeNameTag: String = "@attributeName@"
  protected val attributeTypeTag: String = "@attributeType@"
  protected val extendsTag: String       = "@extends@"

  val attributeTemplateReq: String = s"""$attributeNameTag: $attributeTypeTag"""
  val attributeTemplateOpt: String = s"""$attributeNameTag: Option[$attributeTypeTag]"""
  val template: String =
    s"""$packageTag
       |
       |$importsTag
       |
       |case class $classNameTag(
       |$attributesTag
       |)$extendsTag
       |""".stripMargin

  def generateAll(jsonSchemas: List[JsonSchema], packages: List[String] = List.empty): Option[String] = {

    @scala.annotation.tailrec
    def iter(schemas: List[JsonSchema], previous: Map[String, JsonSchema], acc: mutable.StringBuilder): Option[String] =
      schemas match {
        case Nil => if (acc.isEmpty) None else Option(acc.toString())
        case h :: t =>
          val r = generate(h, packages, previous)
          r match {
            case Some(o) => iter(t, previous + (toClassName(h.title.getOrElse("")) -> h), acc.append(o))
            case None    => iter(t, previous, acc)
          }
      }

    iter(jsonSchemas, Map.empty, StringBuilder.newBuilder)
  }

  def generate(jsonSchema: JsonSchema,
               packages: List[String] = List.empty,
               previous: Map[String, JsonSchema] = Map.empty): Option[String] = {

    jsonSchema.title.map(title => {
      val imports: mutable.HashSet[String]              = mutable.HashSet.empty
      val innerClasses: mutable.HashMap[String, String] = mutable.HashMap.empty
      val className: String                             = toClassNameFromTitle(title)

      def attributeTemplate(name: String, isOverride: Boolean): String = {
        val temp = if (jsonSchema.required.contains(name)) attributeTemplateReq else attributeTemplateOpt
        (if (isOverride) "  override val " else "  ") + temp
      }

      val extend: Option[String] = jsonSchema.allOf.map(_.flatMap(_.`$ref`.map(toRefName))).flatMap(_.headOption)

      val inheritedProperties: List[JsonSchemaProperty] = extend match {
        case Some(e) =>
          previous.get(e) match {
            case Some(s) => s.properties.map(_.copy(isOverride = true))
            case None    => List.empty
          }
        case None => List.empty
      }

      val jsonSchemaProperties: List[JsonSchemaProperty] = inheritedProperties ++ jsonSchema.properties

      val attributes: String = jsonSchemaProperties
        .map(p => {
          (p.name, p.`type`, p.`$ref`) match {
            case (Some(name), Some(t), None) =>
              val attributeName: String = toAttributeName(name)
              val attributeType: String = t match {
                case "string" if p.format.contains("date-time") =>
                  imports.add("import java.time.LocalDateTime")
                  "LocalDateTime"
                case "string" if p.enum.isDefined =>
                  if (p.isOverride) {
                    toClassName(extend.getOrElse(className), name)
                  } else {
                    val enumClassName = toClassName(className, name)
                    EnumGenerator
                      .generate(p.copy(name = Option(enumClassName)), packages)
                      .foreach(innerClasses.put(enumClassName, _))
                    enumClassName
                  }
                case "array" =>
                  (p.property, p.schema) match {
                    case (Some(pp), None) =>
                      (pp.`type`, pp.format) match {
                        case (Some("string"), Some("date-time")) =>
                          imports.add("import java.time.LocalDateTime")
                          "List[LocalDateTime]"
                        case (Some(tt), None) => s"List[${toClassName(tt)}]"
                        case _                => "Nothing"
                      }
                    case (Some(_), Some(schema)) =>
                      val classNameFromAttributeName =
                        if (attributeName.last == 's') attributeName.init else attributeName
                      val innerSchemaClassName = toClassName(className, classNameFromAttributeName)
                      generate(schema.copy(title = Option(innerSchemaClassName)), packages)
                        .foreach(innerClasses.put(innerSchemaClassName, _))
                      s"List[$innerSchemaClassName]"
                    case _ => s"Any // unexpected" //TODO
                  }
                case other => toClassName(other)
              }
              attributeTemplate(name, p.isOverride)
                .replace(attributeNameTag, attributeName)
                .replace(attributeTypeTag, attributeType)
            case (Some(name), None, Some(ref)) =>
              val attributeName = toAttributeName(name)
              val attributeType = toRefName(ref)
              attributeTemplate(name, p.isOverride)
                .replace(attributeNameTag, attributeName)
                .replace(attributeTypeTag, attributeType)
            case _ => "  //"
          }
        })
        .mkString("", ",\n", "")

      val filledInTemplate = template
        .replacePackages(packages)
        .replaceImports(imports.toSeq)
        .replace(classNameTag, className)
        .replace(attributesTag, attributes)
        .replace(extendsTag,
                 extend
                   .map(e => {
                     s" extends $e" + inheritedProperties
                       .map(p => toAttributeName(p.name.getOrElse("")))
                       .mkString("(", " ,", ")")
                   })
                   .getOrElse(""))

      val path = new File(".").getCanonicalPath
      val pw   = new PrintWriter(new File(path + s"/$className.scala"))
      pw.write(filledInTemplate)
      pw.close()

      innerClasses.foreach(tuple => {
        val (enumName, fileContent) = tuple
        val pw                      = new PrintWriter(new File(path + s"/$enumName.scala"))
        pw.write(fileContent)
        pw.close()
      })

      innerClasses.values.mkString("\n\n") ++ filledInTemplate
    })
  }
}
