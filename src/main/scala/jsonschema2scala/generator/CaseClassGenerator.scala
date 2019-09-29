package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchema

object CaseClassGenerator extends ScalaGenerator {

  protected val importsTag: String       = "@imports@"
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
      val imports: StringBuilder = StringBuilder.newBuilder
      val enums: StringBuilder   = StringBuilder.newBuilder
      val className: String      = toClassName(title)
      val attributes: String = jsonSchema.properties
        .map(p => {
          (p.name, p.`type`, p.`$ref`) match {
            case (Some(name), Some(t), None) =>
              val attributeName = toAttributeName(name)
              val attributeType = t match {
                case "string" if p.format.contains("date-time") =>
                  imports.append("import java.time.LocalDateTime\n")
                  "LocalDateTime"
                case "string" if p.enum.isDefined =>
                  val enumClassName = toClassName(className + "_" + name)
                  enums.append(EnumGenerator.generate(p.copy(name = Option(enumClassName))).getOrElse(""))
                  enumClassName
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
        .replace(importsTag, imports.toString())
        .replace(enumsTag, enums.toString())
    })
  }
}
