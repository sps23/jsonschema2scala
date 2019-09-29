package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

trait EnumGenerator extends ScalaGenerator {

  def enumTemplate: String
  def template: String

  def generate(jsonSchemaProperty: JsonSchemaProperty, includeImports: Boolean): Option[String]
}

object EnumGenerator {

  val imports: Seq[String] = Seq(
    "import enumeratum._",
    "import scala.collection.immutable.IndexedSeq"
  )

  def generate(jsonSchemaProperty: JsonSchemaProperty, includeImports: Boolean): Option[String] = {
    val enumGenerator =
      if (jsonSchemaProperty.enum.getOrElse(List.empty).exists(_.contains("_"))) ExtendedEnumGenerator
      else SimpleEnumGenerator
    Option(enumGenerator.generate(jsonSchemaProperty, includeImports).getOrElse(""))
  }
}
