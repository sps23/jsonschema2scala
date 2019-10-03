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
    val useExtended: Boolean =
      jsonSchemaProperty.enum.exists(_.exists(e => e.contains("_") || e.headOption.exists(_.isLower)))
    val enumGenerator =
      if (useExtended) ExtendedEnumGenerator else SimpleEnumGenerator
    enumGenerator.generate(jsonSchemaProperty.copy(enum = jsonSchemaProperty.enum.map(_.sorted)), packages)
  }
}
