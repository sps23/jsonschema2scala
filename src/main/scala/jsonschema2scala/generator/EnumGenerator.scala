package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

trait EnumGenerator extends ScalaGenerator {

  def enumTemplate: String
  def template: String

  def generate(jsonSchemaProperty: JsonSchemaProperty, packages: List[String]): Option[String]
}

object EnumGenerator {

  val imports: Seq[String] = Seq(
    "import enumeratum._",
    "import scala.collection.immutable.IndexedSeq"
  )

  def generate(jsonSchemaProperty: JsonSchemaProperty, packages: List[String]): Option[String] = {
    val enum: List[String]   = jsonSchemaProperty.enum.getOrElse(List.empty)
    val useExtended: Boolean = enum.exists(e => e.contains("_") || e.headOption.exists(_.isLower))
    val enumGenerator =
      if (useExtended) ExtendedEnumGenerator else SimpleEnumGenerator
    Option(enumGenerator.generate(jsonSchemaProperty, packages).getOrElse(""))
  }
}
