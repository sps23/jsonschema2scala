package jsonschema2scala.generator

import java.io.{File, FileWriter, PrintWriter}

import scala.collection.mutable

trait ScalaGenerator extends GeneratorUtils {

  def template: String

  protected val packageTag: String       = "@package@"
  protected val importsTag: String       = "@imports@"
  protected val enumClassNameTag: String = "@enumClassName@"
  protected val classNameTag: String     = "@className@"
  protected val enumsTag: String         = "@enums@"

  implicit class StringImprovements(val s: String) {
    def replacePackages(packages: Seq[String]): String =
      s.replace(packageTag, packages.map("package " + _).mkString("\n"))

    def replaceImports(imports: Seq[String]): String =
      s.replace(importsTag, imports.mkString("\n"))
  }

  protected def writeInnerClassesToFiles(innerClasses: mutable.HashMap[String, String], path: String): Unit = {
    innerClasses.foreach(tuple => {
      val (enumName, fileContent) = tuple
      val pw                      = new PrintWriter(new File(path + s"/$enumName.scala"))
      pw.write(fileContent)
      pw.close()
    })
  }

  protected def writeFilledTemplateToFile(className: String,
                                          filledInTemplate: String,
                                          append: Boolean = false): String = {
    val path = new File(".").getCanonicalPath
    val pw   = new FileWriter(new File(path + s"/$className.scala"), append)
    pw.write(filledInTemplate)
    pw.close()
    path
  }
}
