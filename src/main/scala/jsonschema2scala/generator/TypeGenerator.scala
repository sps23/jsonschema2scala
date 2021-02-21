package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

object TypeGenerator extends PropertyBasedGenerator {

  protected val typeNameTag: String = "@typeName@"
  protected val typeTypeTag: String = "@typeType@"

  // TODO generate all type inside a singe package object (e.g. Cff and MicCode)
  override def template: String =
    s"""$packageTag
       |object $classNameTag {
       |
       |  type $typeNameTag = $typeTypeTag
       |}
       |""".stripMargin

  def generate(jsonSchemaProperty: JsonSchemaProperty, packages: List[String]): Option[String] = {
    (jsonSchemaProperty.name, jsonSchemaProperty.`type`) match {
      case (Some(name), Some(tType)) =>
        val typeName  = toClassName(name)
        val typeType  = toClassName(tType)
        val className = typeName + "Type"

        val generated = template
          .replacePackages(packages)
          .replace(classNameTag, className)
          .replace(typeNameTag, typeName)
          .replace(typeTypeTag, typeType)

        writeFilledTemplateToFile(className, packages, generated)

        Option(generated)
      case _ => None
    }
  }
}
