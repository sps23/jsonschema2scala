package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaRepaymentType(override val entryName: String) extends EnumEntry

object LoanSchemaRepaymentType extends Enum[LoanSchemaRepaymentType] {

  val values: IndexedSeq[LoanSchemaRepaymentType] = findValues

  case object Repayment    extends LoanSchemaRepaymentType("repayment")
  case object InterestOnly extends LoanSchemaRepaymentType("interest_only")
  case object Combined     extends LoanSchemaRepaymentType("combined")
  case object Other        extends LoanSchemaRepaymentType("other")
}
