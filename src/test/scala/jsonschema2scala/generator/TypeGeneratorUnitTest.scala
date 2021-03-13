package jsonschema2scala.generator

import org.scalatest.wordspec.AnyWordSpec

class TypeGeneratorUnitTest extends AnyWordSpec {

  "splitPackages" when {
    "simple scenario" should {
      "return for empty packages" in {
        assert(TypeGenerator.splitPackages(List.empty) === ((Some("Types"), List.empty[String])))
      }
      "return for single package" in {
        assert(TypeGenerator.splitPackages(List("A")) === ((Some("A"), List.empty[String])))
      }
      "return for multiple packages" in {
        assert(TypeGenerator.splitPackages(List("A", "B")) === ((Some("B"), List("A"))))
      }
    }
    "dot in package names" should {
      "return for single package with single dot" in {
        assert(TypeGenerator.splitPackages(List("A.B")) === ((Some("B"), List("A"))))
      }
      "return for single package with two dots" in {
        assert(TypeGenerator.splitPackages(List("A.B.C")) === ((Some("C"), List("A.B"))))
      }
      "return for two packages and first with two dots" in {
        assert(TypeGenerator.splitPackages(List("A.B", "C")) === ((Some("C"), List("A.B"))))
      }
    }
  }
}
