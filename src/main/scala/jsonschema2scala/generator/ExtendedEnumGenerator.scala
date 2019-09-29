package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

object ExtendedEnumGenerator extends ScalaGenerator with App {

  protected val enumNameTag: String = "@enumName@"

  val enumTemplate: String = s"""  case object $enumClassNameTag extends $classNameTag("$enumNameTag")"""
  val template =
    s"""
      |import enumeratum._
      |
      |import scala.collection.immutable.IndexedSeq
      |
      |sealed abstract class $classNameTag(override val entryName: String) extends EnumEntry
      |
      |object State extends Enum[$classNameTag] {
      |
      |  val values: IndexedSeq[AccountingTreatment] = findValues
      |
      |$enumsTag
      |}
      |""".stripMargin

  def generate(jsonSchemaProperty: JsonSchemaProperty): Option[String] = {
    (jsonSchemaProperty.name, jsonSchemaProperty.enum) match {
      case (Some(name), Some(enum)) =>
        val className                          = toClassName(name)
        val enumClassNames: List[String]       = enum.map(toClassName)
        val enumNames: List[String]            = enum
        val enumTuples: List[(String, String)] = enumClassNames.zip(enumNames)

        val enums = enumTuples
          .map(tuple => {
            val (enumClassName, enumName) = tuple
            enumTemplate.replace(enumClassNameTag, enumClassName).replace(enumNameTag, enumName)
          })
          .mkString("\n")
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
