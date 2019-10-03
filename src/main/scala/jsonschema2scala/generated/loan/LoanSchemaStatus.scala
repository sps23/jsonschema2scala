package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaStatus(override val entryName: String) extends EnumEntry

object LoanSchemaStatus extends Enum[LoanSchemaStatus] {

  val values: IndexedSeq[LoanSchemaStatus] = findValues

  case object Actual    extends LoanSchemaStatus("actual")
  case object Committed extends LoanSchemaStatus("committed")
  case object Cancelled extends LoanSchemaStatus("cancelled")
  case object Defaulted extends LoanSchemaStatus("defaulted")
}
