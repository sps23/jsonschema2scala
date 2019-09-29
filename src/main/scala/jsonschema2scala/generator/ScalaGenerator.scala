package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

import scala.annotation.tailrec

trait ScalaGenerator {

  protected val enumClassNameTag: String = "@enumClassName@"
  protected val classNameTag: String     = "@className@"
  protected val enumsTag: String         = "@enums@"

  private def toName(name: String, startWithCapital: Boolean): String = {
    @tailrec
    def iter(s: List[Char], acc: StringBuilder): String = s match {
      case Nil                      => acc.toString()
      case ('_' | ' ') :: c :: tail => iter(tail, acc.append(c.toUpper))
      case c :: tail =>
        iter(tail, acc.append(c))
    }

    val init: List[Char] = if (startWithCapital) name.toList match {
      case h :: t => h.toUpper :: t
      case other  => other
    } else name.toList

    iter(init, StringBuilder.newBuilder)
  }

  def toAttributeName(name: String): String = toName(name, startWithCapital = false)

  def toClassName(name: String): String = toName(name, startWithCapital = true)
}
