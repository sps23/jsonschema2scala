package jsonschema2scala.parser

import jsonschema2scala.parser.model.{JsonSchema, JsonSchemaProperty}
import org.json4s._
import org.json4s.jackson.JsonMethods._

import scala.io.Source

object JsonSchemaParser extends App {

  val securityInput: String        = Source.fromResource("v1-dev/security.json").getLines().mkString
  val securityInputParsed: JObject = parse(securityInput).asInstanceOf[JObject]
//  println(securityInputParsed.toString)
  val securityJsonSchema: Option[JsonSchema] = JsonSchema.from(securityInputParsed)
  println("\n\nsecurityJsonSchema")
  println(securityJsonSchema)

  val loanInput: String        = Source.fromResource("v1-dev/loan.json").getLines().mkString
  val loanInputParsed: JObject = parse(loanInput).asInstanceOf[JObject]
//  println(loanInputParsed.toString)
  val loanJsonSchema: Option[JsonSchema] = JsonSchema.from(loanInputParsed)
  println("\n\nloanJsonSchema")
  println(loanJsonSchema)

  val derivativeInput: String        = Source.fromResource("v1-dev/derivative.json").getLines().mkString
  val derivativeInputParsed: JObject = parse(derivativeInput).asInstanceOf[JObject]
//  println(derivativeInputParsed.toString)
  val derivativeJsonSchema: Option[JsonSchema] = JsonSchema.from(derivativeInputParsed)
  println("\n\nderivativeJsonSchema")
  println(derivativeJsonSchema)

  val commonInput: String        = Source.fromResource("v1-dev/common.json").getLines().mkString
  val commonInputParsed: JObject = parse(commonInput).asInstanceOf[JObject]
//  println(commonInputParsed.toString)
  val commonJsonSchema: Option[JsonSchema]                   = JsonSchema.from(commonInputParsed)
  val commonJsonProperties: Option[List[JsonSchemaProperty]] = JsonSchema.propertiesFrom(commonInputParsed)
//  println("\n\ncommonJsonSchema")
//  println(commonJsonSchema)
  println("\n\ncommonJsonProperties")
  println(commonJsonProperties)
}
