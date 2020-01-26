package jsonschema2scala

import jsonschema2scala.generator.CodeGenerator
import jsonschema2scala.parser.model.{JsonSchema, JsonSchemaProperty}
import org.json4s.JObject
import org.json4s.jackson.JsonMethods.parse

import scala.io.Source

object Main extends App {

  val commonJsonProperties: Option[List[JsonSchemaProperty]] = JsonSchema.propertiesFrom(
    parse(Source.fromResource("v1-dev/common.json").getLines().mkString).asInstanceOf[JObject])
//  val curveJsonSchema: Option[JsonSchema] =
//    JsonSchema.from(parse(Source.fromResource("v1-dev/curve.json").getLines().mkString).asInstanceOf[JObject])
//  val entityJsonSchema: Option[JsonSchema] =
//    JsonSchema.from(parse(Source.fromResource("v1-dev/entity.json").getLines().mkString).asInstanceOf[JObject])
//  val customerJsonSchema: Option[JsonSchema] =
//    JsonSchema.from(parse(Source.fromResource("v1-dev/customer.json").getLines().mkString).asInstanceOf[JObject])
//  val issuerJsonSchema: Option[JsonSchema] =
//    JsonSchema.from(parse(Source.fromResource("v1-dev/issuer.json").getLines().mkString).asInstanceOf[JObject])
//  val guarantorJsonSchema: Option[JsonSchema] =
//    JsonSchema.from(parse(Source.fromResource("v1-dev/guarantor.json").getLines().mkString).asInstanceOf[JObject])
//  val securityJsonSchema: Option[JsonSchema] =
//    JsonSchema.from(parse(Source.fromResource("v1-dev/security.json").getLines().mkString).asInstanceOf[JObject])
//  val accountJsonSchema: Option[JsonSchema] =
//    JsonSchema.from(parse(Source.fromResource("v1-dev/account.json").getLines().mkString).asInstanceOf[JObject])
//  val collateralJsonSchema: Option[JsonSchema] =
//    JsonSchema.from(parse(Source.fromResource("v1-dev/collateral.json").getLines().mkString).asInstanceOf[JObject])
//  val derivativeJsonSchema: Option[JsonSchema] =
//    JsonSchema.from(parse(Source.fromResource("v1-dev/derivative.json").getLines().mkString).asInstanceOf[JObject])
//  val derivativeCashFlowJsonSchema: Option[JsonSchema] =
//    JsonSchema.from(
//      parse(Source.fromResource("v1-dev/derivative_cash_flow.json").getLines().mkString).asInstanceOf[JObject])
//  val loanJsonSchema: Option[JsonSchema] =
//    JsonSchema.from(parse(Source.fromResource("v1-dev/loan.json").getLines().mkString).asInstanceOf[JObject])
  val generated = CodeGenerator.generateAll(
    jsonSchemaProperties = commonJsonProperties.getOrElse(List.empty),
    jsonSchemas = List(
      //      entityJsonSchema,
      //      customerJsonSchema,
      //      issuerJsonSchema,
      //      guarantorJsonSchema,
      //      accountJsonSchema,
      //      collateralJsonSchema,
      //      derivativeJsonSchema,
      //      derivativeCashFlowJsonSchema,
      //      loanJsonSchema,
      //      securityJsonSchema
      //      curveJsonSchema
    ).flatten
  )

}
