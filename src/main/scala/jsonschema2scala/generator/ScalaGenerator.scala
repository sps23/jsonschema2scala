package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

import scala.annotation.tailrec

trait ScalaGenerator {

  protected val enumClassNameTag: String = "@enumClassName@"
  protected val classNameTag: String     = "@className@"
  protected val enumsTag: String         = "@enums@"

  def toClassName(name: String): String = {

    @tailrec
    def iter(s: List[Char], acc: StringBuilder): String = s match {
      case Nil              => acc.toString()
      case '_' :: c :: tail => iter(tail, acc.append(c.toUpper))
      case c :: tail =>
        val char = if (acc.isEmpty) c.toUpper else c
        iter(tail, acc.append(char))
    }

    iter(name.toList, StringBuilder.newBuilder)
  }

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
}
