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
          (p.name, p.`type`, p.`$ref`, p.property) match {
            case (Some(name), Some(t), None, None) =>
              val attributeName = toAttributeName(name)
              val attributeType = t match {
                case "string" if p.format.contains("date-time") =>
                  imports.add("import java.time.LocalDateTime")
                  "LocalDateTime"
                case "string" if p.enum.isDefined =>
                  val enumClassName = toClassName(className + "_" + name)
                  EnumGenerator.imports.foreach(imports.add)
                  enums.append(
                    EnumGenerator.generate(p.copy(name = Option(enumClassName)), includeImports = false).getOrElse(""))
                  enumClassName
                case other => toClassName(other)
              }
              attributeTemplate
                .replace(attributeNameTag, attributeName)
                .replace(attributeTypeTag, attributeType)
            case (Some(name), None, Some(ref), None) =>
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
