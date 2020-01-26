package jsonschema2scala.generator

import scala.annotation.tailrec

trait GeneratorUtils {

  private def wrapScalaKeyword(s: String): String = {
    val scalaKeywords = Seq("type")
    if (scalaKeywords.contains(s)) s"`$s`" else s
  }

  private[generator] def toName(name: String, startWithCapital: Boolean): String = {
    @tailrec
    def iter(s: List[Char], acc: StringBuilder): String = s match {
      case Nil                      => acc.toString()
      case ' ' :: tail              => acc.toString()
      case ('_' | '-') :: c :: tail => iter(tail, acc.append(c.toUpper))
      case c :: tail =>
        iter(tail, acc.append(c))
    }

    val init: List[Char] = if (startWithCapital) name.toList match {
      case h :: t => h.toUpper :: t
      case other  => other
    } else name.toList

    iter(init, StringBuilder.newBuilder)
  }

  def toAttributeName(name: String): String = wrapScalaKeyword(name)

  def toClassNameFromTitle(title: String): String = {
    val titleFormatted = title.replace(" Schema", "").replace(' ', '_')
    toClassName(titleFormatted)
  }

  def toClassName(name: String): String = toName(name, startWithCapital = true) match {
    case "Number"  => "BigDecimal"
    case "Integer" => "Int"
    case other     => other
  }

  def toClassName(className: String, name: String): String = toName(className + "_" + name, startWithCapital = true)

  def toRefName(ref: String): String = {
    val name: String = ref.substring(ref.lastIndexOf("/") + 1).replace(".json", "")
    toClassName(name)
  }

}
