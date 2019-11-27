package jsonschema2scala

import jsonschema2scala.generator.CodeGenerator
import jsonschema2scala.parser.model.JsonSchema
import org.json4s.JObject
import org.json4s.jackson.JsonMethods.parse

import scala.io.Source

object Main extends App {

//  val enumGenerator: EnumGenerator = ExtendedEnumGenerator // SimpleEnumGenerator
//  val accounting_treatment: JsonSchemaProperty = JsonSchemaProperty(
//    name = Option("accounting_treatment"),
//    description = Option("The accounting treatment in accordance with IAS/IFRS9 accounting principles."),
//    `type` = Option("string"),
//    `$ref` = None,
//    format = None,
//    minimum = None,
//    maximum = None,
//    enum = Option(
//      List(
//        "cb_or_demand",
//        "held_for_trading",
//        "fv_thru_pnl",
//        "fv_mandatorily",
//        "fv_oci",
//        "amortised_cost",
//        "held_for_hedge",
//        "available_for_sale",
//        "loans_and_recs",
//        "held_to_maturity"
//      )),
//    minItems = None,
//    uniqueItems = None,
//    schema = None,
//    property = None,
//  )
//  val accounting_treatment_gen = enumGenerator.generate(accounting_treatment, includeImports = true).getOrElse("")
//
//  println("accounting_treatment")
//  println(accounting_treatment)
//  println(accounting_treatment_gen)
//
//
//  val commonInput: String        = Source.fromResource("v1-dev/common.json").getLines().mkString
//  val commonInputParsed: JObject = parse(commonInput).asInstanceOf[JObject]
//  //  println(commonInputParsed.toString)
//  //  val commonJsonSchema: Option[JsonSchema]                   = JsonSchema.from(commonInputParsed)
//  val commonJsonProperties: Option[List[JsonSchemaProperty]] = JsonSchema.propertiesFrom(commonInputParsed)
//  println("\n\ncommonJsonProperties")
//  println(commonJsonProperties)
//
//  val generatedCommon: List[String] =
//    commonJsonProperties.map(_.flatMap(EnumGenerator.generate(_, includeImports = true))).getOrElse(List.empty)
//  println("\n\ngeneratedCommon")
//  println(generatedCommon.mkString("\n"))

//
//  val curveInput: String        = Source.fromResource("v1-dev/curve.json").getLines().mkString
//  val curveInputParsed: JObject = parse(curveInput).asInstanceOf[JObject]
//  //  println(curveInputParsed.toString)
//  val curveJsonSchema: Option[JsonSchema] = JsonSchema.from(curveInputParsed)
//  println("\n\ncurveJsonSchema")
//  println(curveJsonSchema)
//
//  val generatedCurve = curveJsonSchema.flatMap(CaseClassGenerator.generate)
//  println("\n\ngeneratedCurve")
//  println(generatedCurve.getOrElse(""))

  val entityJsonSchema: Option[JsonSchema] =
    JsonSchema.from(parse(Source.fromResource("v1-dev/entity.json").getLines().mkString).asInstanceOf[JObject])
  val customerJsonSchema: Option[JsonSchema] =
    JsonSchema.from(parse(Source.fromResource("v1-dev/customer.json").getLines().mkString).asInstanceOf[JObject])
  val issuerJsonSchema: Option[JsonSchema] =
    JsonSchema.from(parse(Source.fromResource("v1-dev/issuer.json").getLines().mkString).asInstanceOf[JObject])
  val guarantorJsonSchema: Option[JsonSchema] =
    JsonSchema.from(parse(Source.fromResource("v1-dev/guarantor.json").getLines().mkString).asInstanceOf[JObject])
  val securityJsonSchema: Option[JsonSchema] =
    JsonSchema.from(parse(Source.fromResource("v1-dev/security.json").getLines().mkString).asInstanceOf[JObject])
  val accountJsonSchema: Option[JsonSchema] =
    JsonSchema.from(parse(Source.fromResource("v1-dev/account.json").getLines().mkString).asInstanceOf[JObject])
  val collateralJsonSchema: Option[JsonSchema] =
    JsonSchema.from(parse(Source.fromResource("v1-dev/collateral.json").getLines().mkString).asInstanceOf[JObject])
  val derivativeJsonSchema: Option[JsonSchema] =
    JsonSchema.from(parse(Source.fromResource("v1-dev/derivative.json").getLines().mkString).asInstanceOf[JObject])
  val derivativeCashFlowJsonSchema: Option[JsonSchema] =
    JsonSchema.from(
      parse(Source.fromResource("v1-dev/derivative_cash_flow.json").getLines().mkString).asInstanceOf[JObject])
  val loanJsonSchema: Option[JsonSchema] =
    JsonSchema.from(parse(Source.fromResource("v1-dev/loan.json").getLines().mkString).asInstanceOf[JObject])
  val generated = CodeGenerator.generateAll(
    List(
//      entityJsonSchema,
//      customerJsonSchema,
//      issuerJsonSchema,
//      guarantorJsonSchema,
//      accountJsonSchema,
      collateralJsonSchema //,
//      derivativeJsonSchema,
//      derivativeCashFlowJsonSchema,
//      loanJsonSchema,
//      securityJsonSchema
    ).flatten)
//  println("\n\ngenerated")
//  println(generated.getOrElse(""))
}
