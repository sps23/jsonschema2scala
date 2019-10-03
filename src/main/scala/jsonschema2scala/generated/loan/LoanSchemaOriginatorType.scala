package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaOriginatorType(override val entryName: String) extends EnumEntry

object LoanSchemaOriginatorType extends Enum[LoanSchemaOriginatorType] {

  val values: IndexedSeq[LoanSchemaOriginatorType] = findValues

  case object MortgageLender extends LoanSchemaOriginatorType("mortgage_lender")
  case object Spv            extends LoanSchemaOriginatorType("spv")
  case object Other          extends LoanSchemaOriginatorType("other")
}
