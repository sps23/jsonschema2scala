package jsonschema2scala.generated.security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySnpSt(override val entryName: String) extends EnumEntry

object SecuritySnpSt extends Enum[SecuritySnpSt] {

  val values: IndexedSeq[SecuritySnpSt] = findValues

  case object A1 extends SecuritySnpSt("a1")
  case object A2 extends SecuritySnpSt("a2")
  case object A3 extends SecuritySnpSt("a3")
  case object B  extends SecuritySnpSt("b")
  case object C  extends SecuritySnpSt("c")
  case object D  extends SecuritySnpSt("d")
}
