package jsonschema2scala.generator

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
}
