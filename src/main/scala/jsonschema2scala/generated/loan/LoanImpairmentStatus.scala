package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanImpairmentStatus(override val entryName: String) extends EnumEntry

object LoanImpairmentStatus extends Enum[LoanImpairmentStatus] {

  val values: IndexedSeq[LoanImpairmentStatus] = findValues

  case object Doubtful      extends LoanImpairmentStatus("doubtful")
  case object Loss          extends LoanImpairmentStatus("loss")
  case object NonPerforming extends LoanImpairmentStatus("non_performing")
  case object Normal        extends LoanImpairmentStatus("normal")
  case object Performing    extends LoanImpairmentStatus("performing")
  case object Stage1        extends LoanImpairmentStatus("stage_1")
  case object Stage2        extends LoanImpairmentStatus("stage_2")
  case object Stage3        extends LoanImpairmentStatus("stage_3")
  case object Substandard   extends LoanImpairmentStatus("substandard")
  case object Watch         extends LoanImpairmentStatus("watch")
}
