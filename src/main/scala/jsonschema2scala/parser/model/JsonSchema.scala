package jsonschema2scala.parser.model

import org.json4s.{JObject, JValue, _}

case class JsonSchema(schema: Option[String],
                      title: Option[String],
                      description: Option[String],
                      `type`: Option[String],
                      properties: List[JsonSchemaProperty],
                      required: List[String],
                      additionalProperties: Boolean)

object JsonSchema {

  implicit val formats: Formats = DefaultFormats

  def propertiesFrom(jValue: JValue): Option[List[JsonSchemaProperty]] = {
//    val propertiesParsed: Option[JValue] = (jObject \ "properties").toOption
    jValue match {
      case JObject(propList: List[(String, JValue)]) =>
        //      propList.foreach(tuple => println(s"${tuple._1}:\n\t${tuple._2}"))
        val parsedProperties: List[JsonSchemaProperty] = propList.flatMap(tuple => {
          val (name, toParse) = tuple
          JsonSchemaProperty.from(name, toParse)
        })
        //      println("\n\nParsed Properties:")
        //      parsedProperties.foreach(println)
        Option(parsedProperties)
      case _ =>
        None
    }
  }

  def from(jObject: JObject): Option[JsonSchema] = {

    val schemaParsed = (jObject \ "$schema").toOption
    val schema = schemaParsed.map {
      case JString(s) => s
    }
    val titleParsed = (jObject \ "title").toOption
    val title: Option[String] = titleParsed.map {
      case JString(t) => t
    }

    val descriptionParsed = (jObject \ "description").toOption
    val description: Option[String] = descriptionParsed.map {
      case JString(d) => d
    }

    val typeParsed = (jObject \ "type").toOption
    val `type`: Option[String] = typeParsed.map {
      case JString(t) => t
    }

    val requiredParsed = (jObject \ "required").toOption
    val req: Option[List[String]] = requiredParsed.map {
      case jArray: JArray => jArray.extract[List[String]]
    }

    val additionalPropertiesParsed = (jObject \ "additionalProperties").toOption
    val add = additionalPropertiesParsed.map {
      case JBool(a) => a
    }

    val properties: Option[List[JsonSchemaProperty]] =
      (jObject \ "properties").toOption.flatMap(JsonSchema.propertiesFrom)

    properties.map(
      p =>
        JsonSchema(
          schema = schema,
          title = title,
          description = description,
          `type` = `type`,
          properties = p,
          required = req.getOrElse(List.empty),
          additionalProperties = add.getOrElse(false)
      ))
  }
}
