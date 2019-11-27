package jsonschema2scala.generator

object TraitGenerator extends CommonGenerator {

  val template: String =
    s"""$packageTag
       |
       |$importsTag
       |
       |trait $classNameTag $extendsTag {
       |$attributesTag
       |}
       |""".stripMargin

  def attributeSeparator(attributeList: List[String]): String = attributeList.mkString("", "\n", "")
  def attributePrefix(attribute: String): String              = "  def " + attribute
}
