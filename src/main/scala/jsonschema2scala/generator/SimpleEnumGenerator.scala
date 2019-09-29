package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

object SimpleEnumGenerator extends ScalaGenerator with App {

  val enumTemplate: String = s"""  case object $enumClassNameTag extends $classNameTag"""
  val template: String =
    s"""
      |import enumeratum._
      |
      |import scala.collection.immutable.IndexedSeq
      |
      |sealed trait $classNameTag extends EnumEntry
      |
      |object $classNameTag extends Enum[$classNameTag] {
      |
      |  val values: IndexedSeq[AccountingTreatment] = findValues
      |
      |$enumsTag
      |}
      |""".stripMargin

  def generate(jsonSchemaProperty: JsonSchemaProperty): Option[String] = {
    (jsonSchemaProperty.name, jsonSchemaProperty.enum) match {
      case (Some(name), Some(enum)) =>
        val className      = toClassName(name)
        val enumClassNames = enum.map(toClassName)

        val enums =
          enumClassNames.map(enumTemplate.replace(enumClassNameTag, _)).mkString("\n")
        val generated = template.replace(enumsTag, enums).replaceAll(classNameTag, className)

        Option(generated)
      case _ => None
    }
  }

  val accounting_treatment_gen = generate(accounting_treatment)

  println("accounting_treatment")
  println(accounting_treatment)
  println(accounting_treatment_gen)
}
