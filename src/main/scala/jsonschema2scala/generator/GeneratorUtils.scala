package jsonschema2scala.generator

import java.io.File

import scala.annotation.tailrec

trait GeneratorUtils {

  private[generator] val basePath: String = "src/main/scala"

  def buildPath(packages: List[String]): String = {
    val parsedPackagesString: String = packages.flatMap(_.split('.').toList) match {
      case Nil      => ""
      case nonempty => nonempty.mkString("/", "/", "")
    }
    basePath + parsedPackagesString
  }

  def getOrCreateDirectory(packages: List[String]): File = {
    val path = buildPath(packages)
    val dir  = new File(path)
    if (!dir.exists()) dir.mkdirs()
    dir
  }

  private def wrapScalaReservedNames(s: String): String = {
    val scalaKeywords = Seq("type")
    val wrap: Boolean = scalaKeywords.contains(s) || s.headOption.exists(_.isDigit)
    if (wrap) s"`$s`" else s
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

    wrapScalaReservedNames(iter(init, new StringBuilder()))
  }

  def toAttributeName(name: String): String = wrapScalaReservedNames(name)

  def toClassNameFromTitle(title: String): String = {
    val titleFormatted = title.replace(" Schema", "").replace(' ', '_')
    toClassName(titleFormatted)
  }

  def toClassName(name: String): String = toName(name, startWithCapital = true) match {
    case "Number"  => "BigDecimal"
    case "Integer" => "Long"
    case other     => other
  }

  def toPackageNameAll(name: String): String = toPackageName(name) + "._"

  def toPackageName(name: String): String = toClassName(name).toLowerCase()

  def toClassName(className: String, name: String): String = toName(className + "_" + name, startWithCapital = true)

  def toRefName(ref: String): String = {
    val name: String = ref.substring(ref.lastIndexOf("/") + 1).replace(".json", "")
    toClassName(name)
  }

}
