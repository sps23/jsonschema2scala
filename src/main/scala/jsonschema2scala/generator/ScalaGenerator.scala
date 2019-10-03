package jsonschema2scala.generator

import scala.annotation.tailrec

trait ScalaGenerator {

  def template: String

  protected val packageTag: String       = "@package@"
  protected val importsTag: String       = "@imports@"
  protected val enumClassNameTag: String = "@enumClassName@"
  protected val classNameTag: String     = "@className@"
  protected val enumsTag: String         = "@enums@"

  private def wrapScalaKeyword(s: String): String = {
    val scalaKeywords = Seq("type")
    if (scalaKeywords.contains(s)) s"`$s`" else s
  }

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

  def toAttributeName(name: String): String = wrapScalaKeyword(toName(name, startWithCapital = false))

  def toClassName(name: String): String = toName(name, startWithCapital = true) match {
    case "Number"  => "BigDecimal"
    case "Integer" => "Int"
    case other     => other
  }

  def toRefName(ref: String): String = {
    val name: String = ref.substring(ref.lastIndexOf("#/") + 2)
    toClassName(name)
  }

  implicit class StringImprovements(val s: String) {
    def replacePackages(packages: Seq[String]): String =
      s.replace(packageTag, packages.map("package " + _).mkString("\n"))

    def replaceImports(imports: Seq[String]): String =
      s.replace(importsTag, imports.mkString("\n"))
  }
}
