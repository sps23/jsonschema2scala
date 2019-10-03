package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaRateType(override val entryName: String) extends EnumEntry

object LoanSchemaRateType extends Enum[LoanSchemaRateType] {

  val values: IndexedSeq[LoanSchemaRateType] = findValues

  case object Fixed    extends LoanSchemaRateType("fixed")
  case object Variable extends LoanSchemaRateType("variable")
  case object Tracker  extends LoanSchemaRateType("tracker")
  case object Combined extends LoanSchemaRateType("combined")
}
