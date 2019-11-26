package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanImpairmentStatus(override val entryName: String) extends EnumEntry

object LoanImpairmentStatus extends Enum[LoanImpairmentStatus] {

  val values: IndexedSeq[LoanImpairmentStatus] = findValues

  case object Stage1 extends LoanImpairmentStatus("stage_1")
  case object Stage2 extends LoanImpairmentStatus("stage_2")
  case object Stage3 extends LoanImpairmentStatus("stage_3")
}
