package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

trait PropertyBasedGenerator extends ScalaGenerator {

  def generate(jsonSchemaProperty: JsonSchemaProperty, packages: List[String]): Option[String]
}

object PropertyBasedGenerator {

  def generate(jsonSchemaProperties: List[JsonSchemaProperty], packages: List[String]): List[String] = {
    val (types, enums) = jsonSchemaProperties.partition(_.`enum`.isEmpty)

    TypeGenerator.generate(types, packages) ++ enums.flatMap(e =>
      EnumGenerator.chooseGenerator(e).generate(e, packages))
  }
}
