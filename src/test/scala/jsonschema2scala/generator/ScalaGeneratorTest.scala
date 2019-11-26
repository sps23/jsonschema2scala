package jsonschema2scala.generator

import org.scalatest.{FlatSpec, Matchers}

class ScalaGeneratorTest extends FlatSpec with Matchers {

  val scalaGenerator: ScalaGenerator = new ScalaGenerator {
    override def template: String = ""
  }

  "toClassNameFromTitle" should "return 'DerivativeCashFlow' from title 'Derivative Cash Flow Schema'" in {
    val actual   = scalaGenerator.toClassNameFromTitle("Derivative Cash Flow Schema")
    val expected = "DerivativeCashFlow"
    actual shouldBe expected
  }

  "toClassName" should "return 'Derivative' from name 'Derivative Schema'" in {
    val actual   = scalaGenerator.toClassName("Derivative Schema")
    val expected = "Derivative"
    actual shouldBe expected
  }
}
