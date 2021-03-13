package jsonschema2scala.generator

import jsonschema2scala.parser.model.JsonSchemaProperty

object TypeGenerator extends ScalaGenerator {

  protected val typeNameTag: String     = "@typeName@"
  protected val typeTypeTag: String     = "@typeType@"
  protected val innerPackageTag: String = "@typeType@"
  protected val typesTag: String        = "@types@"

  protected val typeTemplate: String = s"  type $typeNameTag = $typeTypeTag"

  override def template: String =
    s"""$packageTag
       |package object $innerPackageTag {
       |
       |$typesTag
       |}
       |""".stripMargin

  def splitPackages(packages: List[String]): (Option[String], Seq[String]) = {
    val splitPackages = packages match {
      case List() => Seq("Types")
      case List(p) if p.contains('.') =>
        val (a, b) = p.splitAt(p.lastIndexOf('.'))
        Seq(a, b.drop(1))
      case _ => packages
    }
    splitPackages.foldRight((Option.empty[String], Seq.empty[String]))((e, acc) => {
      if (acc._1.isEmpty) (Some(e), acc._2) else (acc._1, acc._2 :+ e)
    })
  }

  def generate(jsonSchemaProperties: List[JsonSchemaProperty], packages: List[String]): List[String] = {
    val (maybeInnerPackage, outerPackages) = splitPackages(packages)
    val innerPackage                       = maybeInnerPackage.getOrElse("Types")
    val typesMap: Map[String, String]      = jsonSchemaProperties.flatMap(generateType).toMap
    val types                              = typesMap.values.mkString("\n")

    val generated = template
      .replacePackages(outerPackages)
      .replace(innerPackageTag, innerPackage)
      .replace(typesTag, types)

    writeFilledTemplateToFile("package", packages, generated)

    typesMap.keySet.toList
  }

  def generateType(jsonSchemaProperty: JsonSchemaProperty): Option[(String, String)] = {
    (jsonSchemaProperty.name, jsonSchemaProperty.`type`) match {
      case (Some(name), Some(tType)) =>
        val typeName = toClassName(name)
        val typeType = toClassName(tType)

        val generatedType = typeTemplate
          .replace(typeNameTag, typeName)
          .replace(typeTypeTag, typeType)

        Some((typeName, generatedType))
      case _ => None
    }
  }
}
