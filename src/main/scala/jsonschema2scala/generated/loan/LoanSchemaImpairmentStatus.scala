package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaImpairmentStatus(override val entryName: String) extends EnumEntry

object LoanSchemaImpairmentStatus extends Enum[LoanSchemaImpairmentStatus] {

  val values: IndexedSeq[LoanSchemaImpairmentStatus] = findValues

  case object Stage1 extends LoanSchemaImpairmentStatus("stage_1")
  case object Stage2 extends LoanSchemaImpairmentStatus("stage_2")
  case object Stage3 extends LoanSchemaImpairmentStatus("stage_3")
}
