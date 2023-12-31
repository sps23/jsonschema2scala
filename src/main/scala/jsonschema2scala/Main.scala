package jsonschema2scala

import jsonschema2scala.generator.CodeGenerator
import jsonschema2scala.parser.model.{JsonSchema, JsonSchemaProperty}
import org.json4s.JObject
import org.json4s.jackson.JsonMethods.parse

import scala.io.Source

object Main extends App {

  val commonJsonProperties: Option[List[JsonSchemaProperty]] = JsonSchema.propertiesFrom(
    parse(Source.fromResource("v1-dev/common.json").getLines().mkString).asInstanceOf[JObject])

  val resources: List[String] = List(
    "v1-dev/entity.json",
    "v1-dev/customer.json",
    "v1-dev/issuer.json",
    "v1-dev/guarantor.json",
    "v1-dev/security.json",
    "v1-dev/account.json",
    "v1-dev/collateral.json",
    "v1-dev/derivative.json",
    "v1-dev/derivative_cash_flow.json",
    "v1-dev/loan.json", // new below
    "v1-dev/adjustment.json",
    "v1-dev/reporter.json",
    ////    "v1-dev/batch.json", // TODO problem with 'data' attribute
    "v1-dev/exchange_rate.json",
    "v1-dev/loan_transaction.json",
    "v1-dev/curve.json"
  )
  val jsonSchemas: List[JsonSchema] =
    resources.flatMap(r => JsonSchema.from(parse(Source.fromResource(r).getLines().mkString)))

  val generated = CodeGenerator.generateAll(
    jsonSchemaProperties = commonJsonProperties.getOrElse(List.empty),
    jsonSchemas = jsonSchemas,
    packages = List("jsonschema2scala.model.fire2")
  )
}
