package jsonschema2scala.generator

import org.scalatest.wordspec.AnyWordSpec

class GeneratorUtilsUnitTest extends AnyWordSpec {

  object GeneratorUtilsTest extends GeneratorUtils

  "buildPath" should {
    "generate path for just className" in {
      assert(GeneratorUtilsTest.buildPath(List.empty[String]) === GeneratorUtilsTest.basePath)
    }
    "generate path for className and single package" in {
      assert(GeneratorUtilsTest.buildPath(List("a")) === GeneratorUtilsTest.basePath + "/a")
    }
    "generate path for className and multiple packages" in {
      assert(GeneratorUtilsTest.buildPath(List("a", "b", "c")) === GeneratorUtilsTest.basePath + "/a/b/c")
    }
    "generate path for className and single package containing '.'" in {
      assert(GeneratorUtilsTest.buildPath(List("a.b.c")) === GeneratorUtilsTest.basePath + "/a/b/c")
    }
    "generate path for className and multiple packages containing '.'" in {
      assert(GeneratorUtilsTest.buildPath(List("a.b", "c")) === GeneratorUtilsTest.basePath + "/a/b/c")
    }
  }
}
