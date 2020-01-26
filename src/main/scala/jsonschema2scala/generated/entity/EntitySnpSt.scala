package jsonschema2scala.generated.entity

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntitySnpSt(override val entryName: String) extends EnumEntry

object EntitySnpSt extends Enum[EntitySnpSt] {

  val values: IndexedSeq[EntitySnpSt] = findValues

  case object A1 extends EntitySnpSt("a1")
  case object A2 extends EntitySnpSt("a2")
  case object A3 extends EntitySnpSt("a3")
  case object B  extends EntitySnpSt("b")
  case object C  extends EntitySnpSt("c")
  case object D  extends EntitySnpSt("d")
}
