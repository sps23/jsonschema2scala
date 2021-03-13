package jsonschema2scala.parser.model

import jsonschema2scala.parser.model.JsonSchemaScalaType.CaseClass
import org.json4s.{JObject, JValue, _}

case class JsonSchema(schema: Option[String],
                      title: Option[String],
                      description: Option[String],
                      `type`: Option[String],
                      allOf: Option[List[JsonSchemaProperty]],
                      properties: List[JsonSchemaProperty],
                      required: List[String],
                      additionalProperties: Boolean,
                      scalaType: JsonSchemaScalaType)

object JsonSchema {

  implicit val formats: Formats = DefaultFormats

  def propertiesFrom(jValue: JValue): Option[List[JsonSchemaProperty]] = {
    jValue match {
      case JObject(propList: List[(String, JValue)]) =>
        val parsedProperties: List[JsonSchemaProperty] = propList.flatMap(tuple => {
          val (name, toParse) = tuple
          JsonSchemaProperty.from(name, toParse)
        })
        Option(parsedProperties)
      case _ =>
        None
    }
  }

  def from(jValue: JValue): Option[JsonSchema] = {

    val schemaParsed: Option[JValue] = (jValue \ "$schema").toOption
    val schema = schemaParsed.collect {
      case JString(s) => s
    }
    val titleParsed: Option[JValue] = (jValue \ "title").toOption
    val title: Option[String] = titleParsed.collect {
      case JString(t) => t
    }

    val descriptionParsed: Option[JValue] = (jValue \ "description").toOption
    val description: Option[String] = descriptionParsed.collect {
      case JString(d) => d
    }

    val typeParsed: Option[JValue] = (jValue \ "type").toOption
    val `type`: Option[String] = typeParsed.collect {
      case JString(t) => t
    }

    val requiredParsed: Option[JValue] = (jValue \ "required").toOption
    val req: Option[List[String]] = requiredParsed.collect {
      case jArray: JArray => jArray.extract[List[String]]
    }

    val additionalPropertiesParsed: Option[JValue] = (jValue \ "additionalProperties").toOption
    val add = additionalPropertiesParsed.collect {
      case JBool(a) => a
    }

    val allOfParsed: Option[JValue] = (jValue \ "allOf").toOption
    val allOf: Option[List[JsonSchemaProperty]] = allOfParsed.collect {
      case jArray: JArray => jArray.extract[List[JsonSchemaProperty]]
    }

    val properties: Option[List[JsonSchemaProperty]] =
      (jValue \ "properties").toOption.flatMap(JsonSchema.propertiesFrom)

    properties.map(
      p =>
        JsonSchema(
          schema = schema,
          title = title,
          description = description,
          `type` = `type`,
          allOf = allOf,
          properties = p,
          required = req.getOrElse(List.empty),
          additionalProperties = add.getOrElse(false),
          scalaType = CaseClass
      ))
  }
}
