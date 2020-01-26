package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

trait PropertyBasedGenerator extends ScalaGenerator {

  def generate(jsonSchemaProperty: JsonSchemaProperty, packages: List[String]): Option[String]
}
