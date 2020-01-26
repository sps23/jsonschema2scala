package jsonschema2scala.generator

import jsonschema2scala.parser.model.AccountingTreatment.{CaseClass, Trait}
import jsonschema2scala.parser.model.JsonSchema

import scala.collection.mutable

object CodeGenerator extends GeneratorUtils {

  private def chooseGenerator(jsonSchema: JsonSchema): CommonGenerator = jsonSchema.scalaType match {
    case Trait     => TraitGenerator
    case CaseClass => CaseClassGenerator
  }

  def generateAll(jsonSchemas: List[JsonSchema], packages: List[String] = List.empty): Option[String] = {

    val refNames: Set[String] =
      jsonSchemas.flatMap(_.allOf.getOrElse(List.empty).flatMap(_.`$ref`.map(toRefName))).toSet

    val jsonSchemasSortedByRefs = jsonSchemas
      .map(js =>
        if (refNames.contains(js.title.map(toClassNameFromTitle).getOrElse(""))) js.copy(scalaType = Trait) else js)
      .sortBy(_.scalaType != Trait)

    @scala.annotation.tailrec
    def iter(schemas: List[JsonSchema],
             previous: Map[String, JsonSchema],
             acc: mutable.StringBuilder): Option[String] = {

      schemas match {
        case Nil => if (acc.isEmpty) None else Option(acc.toString())
        case h :: t =>
          val generator = chooseGenerator(h)
          val r         = generator.generate(h, packages, previous)
          r match {
            case Some(o) => iter(t, previous + (generator.toClassName(h.title.getOrElse("")) -> h), acc.append(o))
            case None    => iter(t, previous, acc)
          }
      }
    }

    iter(jsonSchemasSortedByRefs, Map.empty, StringBuilder.newBuilder)
  }
}
