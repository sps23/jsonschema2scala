package jsonschema2scala.generated
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityImpairmentStatus(override val entryName: String) extends EnumEntry

object SecurityImpairmentStatus extends Enum[SecurityImpairmentStatus] {

  val values: IndexedSeq[SecurityImpairmentStatus] = findValues

  case object Stage1 extends SecurityImpairmentStatus("stage_1")
  case object Stage2 extends SecurityImpairmentStatus("stage_2")
  case object Stage3 extends SecurityImpairmentStatus("stage_3")
}
