package jsonschema2scala

import jsonschema2scala.generator.{CaseClassGenerator, EnumGenerator, ExtendedEnumGenerator}
import jsonschema2scala.parser.model.{JsonSchema, JsonSchemaProperty}
import org.json4s.JObject
import org.json4s.jackson.JsonMethods.parse

import scala.io.Source

object Main extends App {

  val enumGenerator: EnumGenerator = ExtendedEnumGenerator // SimpleEnumGenerator
  val accounting_treatment: JsonSchemaProperty = JsonSchemaProperty(
    name = Option("accounting_treatment"),
    description = Option("The accounting treatment in accordance with IAS/IFRS9 accounting principles."),
    `type` = Option("string"),
    `$ref` = None,
    format = None,
    minimum = None,
    maximum = None,
    enum = Option(
      List(
        "cb_or_demand",
        "held_for_trading",
        "fv_thru_pnl",
        "fv_mandatorily",
        "fv_oci",
        "amortised_cost",
        "held_for_hedge",
        "available_for_sale",
        "loans_and_recs",
        "held_to_maturity"
      )),
    minItems = None,
    uniqueItems = None,
    schema = None,
    property = None,
  )
  val accounting_treatment_gen = enumGenerator.generate(accounting_treatment, includeImports = true).getOrElse("")

  println("accounting_treatment")
  println(accounting_treatment)
  println(accounting_treatment_gen)

  val customerInput: String        = Source.fromResource("v1-dev/customer.json").getLines().mkString
  val customerInputParsed: JObject = parse(customerInput).asInstanceOf[JObject]
  //  println(customerInputParsed.toString)
  val customerJsonSchema: Option[JsonSchema] = JsonSchema.from(customerInputParsed)
  println("\n\ncustomerJsonSchema")
  println(customerJsonSchema)

  val generatedCustomer = customerJsonSchema.flatMap(CaseClassGenerator.generate)
  println("\n\ngeneratedCustomer")
  println(generatedCustomer.getOrElse(""))

  val entityInput: String        = Source.fromResource("v1-dev/entity.json").getLines().mkString
  val entityInputParsed: JObject = parse(entityInput).asInstanceOf[JObject]
  //  println(entityInputParsed.toString)
  val entityJsonSchema: Option[JsonSchema] = JsonSchema.from(entityInputParsed)
  println("\n\nentityJsonSchema")
  println(entityJsonSchema)

  val generatedEntity = entityJsonSchema.flatMap(CaseClassGenerator.generate)
  println("\n\ngeneratedEntity")
  println(generatedEntity.getOrElse(""))

  val securityInput: String        = Source.fromResource("v1-dev/security.json").getLines().mkString
  val securityInputParsed: JObject = parse(securityInput).asInstanceOf[JObject]
  //  println(securityInputParsed.toString)
  val securityJsonSchema: Option[JsonSchema] = JsonSchema.from(securityInputParsed)
  println("\n\nsecurityJsonSchema")
  println(securityJsonSchema)

  val generatedSecurity = securityJsonSchema.flatMap(CaseClassGenerator.generate)
  println("\n\ngeneratedSecurity")
  println(generatedSecurity.getOrElse(""))

  val commonInput: String        = Source.fromResource("v1-dev/common.json").getLines().mkString
  val commonInputParsed: JObject = parse(commonInput).asInstanceOf[JObject]
  //  println(commonInputParsed.toString)
  //  val commonJsonSchema: Option[JsonSchema]                   = JsonSchema.from(commonInputParsed)
  val commonJsonProperties: Option[List[JsonSchemaProperty]] = JsonSchema.propertiesFrom(commonInputParsed)
  println("\n\ncommonJsonProperties")
  println(commonJsonProperties)

  val generatedCommon: List[String] =
    commonJsonProperties.map(_.flatMap(EnumGenerator.generate(_, includeImports = true))).getOrElse(List.empty)
  println("\n\ngeneratedCommon")
  println(generatedCommon.mkString("\n"))
}
