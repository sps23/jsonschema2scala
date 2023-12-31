package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaScalaType.Trait
import jsonschema2scala.parser.model.{JsonSchema, JsonSchemaProperty}

object CodeGenerator extends GeneratorUtils {

  private def toOptionString(stringBuilder: StringBuilder): Option[String] =
    if (stringBuilder.isEmpty) None else Option(stringBuilder.toString())

  def generateAll(jsonSchemaProperties: List[JsonSchemaProperty],
                  jsonSchemas: List[JsonSchema],
                  packages: List[String]): Option[String] = {

    val refNames: Set[String] =
      jsonSchemas.flatMap(_.allOf.getOrElse(List.empty).flatMap(_.`$ref`.map(toRefName))).toSet

    val jsonSchemasSortedByRefs = jsonSchemas
      .map(js =>
        if (refNames.contains(js.title.map(toClassNameFromTitle).getOrElse(""))) js.copy(scalaType = Trait) else js)
      .sortBy(_.scalaType != Trait)

    @scala.annotation.tailrec
    def iter(schemas: List[JsonSchema], previous: Map[String, JsonSchema], acc: StringBuilder): StringBuilder = {

      schemas match {
        case Nil => acc
        case h :: t =>
          val generated = CommonGenerator.generate(h, packages, previous)
          generated match {
            case Some(o) => iter(t, previous + (toClassName(h.title.getOrElse("")) -> h), acc.append(o))
            case None    => iter(t, previous, acc)
          }
      }
    }

    val generatedFromProps: StringBuilder =
      PropertyBasedGenerator.generate(jsonSchemaProperties, packages).foldLeft(new StringBuilder())(_.append(_))
    val generatedFromSchemas: StringBuilder = iter(jsonSchemasSortedByRefs, Map.empty, new StringBuilder())

    toOptionString(generatedFromProps.append(generatedFromSchemas))
  }
}
