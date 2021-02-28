package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

trait EnumGenerator extends PropertyBasedGenerator {

  def enumTemplate: String
  def template: String

  def generate(jsonSchemaProperty: JsonSchemaProperty, packages: List[String]): Option[String]
}

object EnumGenerator {

  val imports: Seq[String] = Seq(
    "enumeratum._",
    "scala.collection.immutable.IndexedSeq"
  )

  private[generator] def chooseGenerator(jsonSchemaProperty: JsonSchemaProperty): EnumGenerator = {
    def useExtended(enums: List[String]): Boolean = enums.exists(enum => enum.contains('_') || enum.exists(_.isLower))
    jsonSchemaProperty.enum match {
      case Some(enums) if useExtended(enums) => ExtendedEnumGenerator
      case _                                 => SimpleEnumGenerator
    }
  }

  def generate(jsonSchemaProperty: JsonSchemaProperty, packages: List[String]): Option[String] = {
    val enumGenerator = chooseGenerator(jsonSchemaProperty)
    enumGenerator.generate(jsonSchemaProperty.copy(enum = jsonSchemaProperty.enum.map(_.sorted)), packages)
  }
}
