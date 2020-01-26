package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

trait PropertyBasedGenerator extends ScalaGenerator {

  def generate(jsonSchemaProperty: JsonSchemaProperty, packages: List[String]): Option[String]
}

object PropertyBasedGenerator {

  private[generator] def chooseGenerator(jsonSchemaProperty: JsonSchemaProperty): PropertyBasedGenerator =
    jsonSchemaProperty.enum match {
      case Some(_) => EnumGenerator.chooseGenerator(jsonSchemaProperty)
      case None    => TypeGenerator
    }

  def generate(jsonSchemaProperty: JsonSchemaProperty, packages: List[String]): Option[String] = {
    val generator: PropertyBasedGenerator = chooseGenerator(jsonSchemaProperty)
    generator.generate(jsonSchemaProperty, packages)
  }
}
