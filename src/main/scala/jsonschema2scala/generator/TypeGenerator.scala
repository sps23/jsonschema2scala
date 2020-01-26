package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

object TypeGenerator extends PropertyBasedGenerator {

  private val fileName: String      = "CommonType"
  protected val typeNameTag: String = "@typeName@"
  protected val typeTypeTag: String = "@typeType@"

  override def template: String =
    s"""
       |type $typeNameTag = $typeTypeTag
       |""".stripMargin

  def generate(jsonSchemaProperty: JsonSchemaProperty, packages: List[String]): Option[String] = {
    (jsonSchemaProperty.name, jsonSchemaProperty.`type`) match {
      case (Some(name), Some(tType)) =>
        val typeName = toClassName(name)
        val typeType = toClassName(tType)

        val generated = template
          .replacePackages(packages)
          .replace(typeNameTag, typeName)
          .replace(typeTypeTag, typeType)

        writeFilledTemplateToFile(fileName, generated, append = true)

        Option(generated)
      case _ => None
    }
  }
}
