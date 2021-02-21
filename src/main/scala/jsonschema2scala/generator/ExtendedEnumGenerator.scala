package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

object ExtendedEnumGenerator extends EnumGenerator {

  protected val enumNameTag: String = "@enumName@"

  override val enumTemplate: String = s"""  case object $enumClassNameTag extends $classNameTag("$enumNameTag")"""
  override val template: String =
    s"""$packageTag$importsTag
      |sealed abstract class $classNameTag(override val entryName: String) extends EnumEntry
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
        val className: String                  = toClassName(name)
        val enumClassNames: List[String]       = enum.map(toClassName)
        val enumNames: List[String]            = enum
        val enumTuples: List[(String, String)] = enumClassNames.zip(enumNames)

        val enums = enumTuples
          .map(tuple => {
            val (enumClassName, enumName) = tuple
            enumTemplate.replace(enumClassNameTag, enumClassName).replace(enumNameTag, enumName)
          })
          .mkString("\n")

        val generated = template
          .replacePackages(packages)
          .replaceImports(EnumGenerator.imports)
          .replace(enumsTag, enums)
          .replaceAll(classNameTag, className)

        writeFilledTemplateToFile(className, packages, generated)

        Option(generated)
      case _ => None
    }
  }
}
