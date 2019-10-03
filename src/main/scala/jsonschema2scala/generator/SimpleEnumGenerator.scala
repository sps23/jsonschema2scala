package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

object SimpleEnumGenerator extends EnumGenerator {

  override val enumTemplate: String = s"""  case object $enumClassNameTag extends $classNameTag"""
  override val template: String =
    s"""$packageTag
      |
      |$importsTag
      |
      |sealed trait $classNameTag extends EnumEntry
      |
      |object $classNameTag extends Enum[$classNameTag] {
      |
      |  val values: IndexedSeq[$classNameTag] = findValues
      |
      |$enumsTag
      |}
      |""".stripMargin

  def generate(jsonSchemaProperty: JsonSchemaProperty, packages: List[String]): Option[String] = {
    (jsonSchemaProperty.name, jsonSchemaProperty.enum) match {
      case (Some(name), Some(enum)) =>
        val className: String            = toClassName(name)
        val enumClassNames: List[String] = enum.map(toClassName)

        val enums =
          enumClassNames.map(enumTemplate.replace(enumClassNameTag, _)).mkString("\n")
        val generated = template
          .replacePackages(packages)
          .replaceImports(EnumGenerator.imports)
          .replace(enumsTag, enums)
          .replaceAll(classNameTag, className)

        Option(generated)
      case _ => None
    }
  }
}
