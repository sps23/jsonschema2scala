package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

trait EnumGenerator extends ScalaGenerator {

  def enumTemplate: String
  def template: String

  def generate(jsonSchemaProperty: JsonSchemaProperty): Option[String]
}

object EnumGenerator {

  def generate(jsonSchemaProperty: JsonSchemaProperty): Option[String] = {
    val enumGenerator =
      if (jsonSchemaProperty.enum.getOrElse(List.empty).exists(_.contains("_"))) ExtendedEnumGenerator
      else SimpleEnumGenerator
    Option(enumGenerator.generate(jsonSchemaProperty).getOrElse(""))
  }
}
