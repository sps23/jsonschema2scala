package jsonschema2scala.generator

import java.io.{File, PrintWriter}

import jsonschema2scala.parser.model.JsonSchema

import scala.collection.mutable

object CaseClassGenerator extends ScalaGenerator {

  protected val attributesTag: String    = "@attributes@"
  protected val attributeNameTag: String = "@attributeName@"
  protected val attributeTypeTag: String = "@attributeType@"

  val attributeTemplate: String = s"""  $attributeNameTag: $attributeTypeTag"""
  val template: String =
    s"""$packageTag
       |
       |$importsTag
       |
       |case class $classNameTag(
       |$attributesTag
       |)
       |""".stripMargin

  def generate(jsonSchema: JsonSchema, packages: List[String] = List.empty): Option[String] = {

    jsonSchema.title.map(title => {
      val imports: mutable.HashSet[String]              = mutable.HashSet.empty
      val innerClasses: mutable.HashMap[String, String] = mutable.HashMap.empty
      val className: String                             = toClassName(title)
      val attributes: String = jsonSchema.properties
        .map(p => {
          (p.name, p.`type`, p.`$ref`) match {
            case (Some(name), Some(t), None) =>
              val attributeName: String = toAttributeName(name)
              val attributeType: String = t match {
                case "string" if p.format.contains("date-time") =>
                  imports.add("import java.time.LocalDateTime")
                  "LocalDateTime"
                case "string" if p.enum.isDefined =>
                  val enumClassName = toClassName(className + "_" + name)
                  innerClasses.put(enumClassName,
                                   EnumGenerator
                                     .generate(p.copy(name = Option(enumClassName)), packages)
                                     .getOrElse(""))
                  enumClassName
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
                    case (None, Some(s)) => s"AnyVal // $s" //TODO
                    case _               => s"Any // unexpected" //TODO
                  }
                case other => toClassName(other)
              }
              attributeTemplate
                .replace(attributeNameTag, attributeName)
                .replace(attributeTypeTag, attributeType)
            case (Some(name), None, Some(ref)) =>
              val attributeName = toAttributeName(name)
              val attributeType = toRefName(ref)
              attributeTemplate
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
