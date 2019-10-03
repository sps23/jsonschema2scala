package jsonschema2scala.parser.model

import org.json4s.JsonAST.JValue
import org.json4s.{DefaultFormats, Formats, JObject}

case class JsonSchemaProperty(name: Option[String],
                              description: Option[String],
                              `type`: Option[String],
                              `$ref`: Option[String],
                              format: Option[String],
                              minimum: Option[Double],
                              maximum: Option[Double],
                              enum: Option[List[String]],
                              minItems: Option[Int],
                              uniqueItems: Option[Boolean],
                              schema: Option[JsonSchema],
                              property: Option[JsonSchemaProperty],
                              isOverride: Boolean = false)

object JsonSchemaProperty {

  implicit val formats: Formats = DefaultFormats

  def from(name: String, jValue: JValue): Option[JsonSchemaProperty] = {
    val property: Option[JsonSchemaProperty] = jValue.extractOpt[JsonSchemaProperty].map(_.copy(name = Option(name)))
    val items                                = (jValue \ "items").toOption
    val (schema, innerProperty): (Option[JsonSchema], Option[JsonSchemaProperty]) = items match {
      case Some(jObject: JObject) => (JsonSchema.from(jObject), jObject.extractOpt[JsonSchemaProperty])
      case _                      => (None, None)
    }
    property.map(_.copy(schema = schema, property = innerProperty))
  }
}
