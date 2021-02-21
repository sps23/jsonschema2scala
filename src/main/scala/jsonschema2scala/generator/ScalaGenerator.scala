package jsonschema2scala.generator

import java.io.{File, PrintWriter}

import scala.collection.mutable

trait ScalaGenerator extends GeneratorUtils {

  def template: String

  protected val packageTag: String       = "@package@"
  protected val importsTag: String       = "@imports@"
  protected val enumClassNameTag: String = "@enumClassName@"
  protected val classNameTag: String     = "@className@"
  protected val enumsTag: String         = "@enums@"

  implicit class StringImprovements(val s: String) {
    def replacePackages(packages: Seq[String]): String = {
      val toReplace = if (packages.isEmpty) "" else packages.map("package " + _).mkString("", "\n", "\n")
      s.replace(packageTag, toReplace)
    }

    def replaceImports(imports: Seq[String]): String = {
      val toReplace = if (imports.isEmpty) "" else imports.mkString("", "\n", "\n")
      s.replace(importsTag, toReplace)
    }
  }

  protected def writeInnerClassesToFiles(innerClasses: mutable.HashMap[String, String], path: String): Unit = {
    innerClasses.foreach {
      case (enumName, fileContent) =>
        val pw = new PrintWriter(new File(path + s"/$enumName.scala"))
        pw.write(fileContent)
        pw.close()
    }
  }

  protected def writeFilledTemplateToFile(className: String,
                                          packages: List[String],
                                          filledInTemplate: String): String = {
    val path = getOrCreateDirectory(packages).getCanonicalPath
    val pw   = new PrintWriter(new File(path + s"/$className.scala"))
    pw.write(filledInTemplate)
    pw.close()
    path
  }
}
