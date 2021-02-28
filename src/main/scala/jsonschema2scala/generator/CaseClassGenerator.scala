package jsonschema2scala.generator

object CaseClassGenerator extends CommonGenerator {

  val template: String =
    s"""$packageTag$importsTag
       |case class $classNameTag($attributesTag
       |)$extendsTag
       |""".stripMargin

  def attributeSeparator(attributeList: List[String]): String = attributeList.mkString("", ",\n", "")
  def attributePrefix(attribute: String): String              = "  " + attribute
}
