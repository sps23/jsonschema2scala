package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchema

import scala.collection.mutable

object CaseClassGenerator extends ScalaGenerator {

  protected val attributesTag: String    = "@attributes@"
  protected val attributeNameTag: String = "@attributeName@"
  protected val attributeTypeTag: String = "@attributeType@"

  val attributeTemplate: String = s"""  $attributeNameTag: $attributeTypeTag"""
  val template: String =
    s"""
       |$importsTag
       |$enumsTag
       |
       |case class $classNameTag(
       |$attributesTag
       |)
       |""".stripMargin

  def generate(jsonSchema: JsonSchema): Option[String] = {

    jsonSchema.title.map(title => {
      val imports: mutable.HashSet[String] = mutable.HashSet.empty
//      val imports: StringBuilder     = StringBuilder.newBuilder
      val enums: StringBuilder = StringBuilder.newBuilder
      val className: String    = toClassName(title)
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
                  EnumGenerator.imports.foreach(imports.add)
                  enums.append(
                    EnumGenerator.generate(p.copy(name = Option(enumClassName)), includeImports = false).getOrElse(""))
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
                    case (None, Some(schema)) => "AnyVal" //TODO
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

      template
        .replace(classNameTag, className)
        .replace(attributesTag, attributes)
        .replace(importsTag, imports.mkString("\n"))
        .replace(enumsTag, enums.toString())
    })
  }
}
