package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanRepaymentType(override val entryName: String) extends EnumEntry

object LoanRepaymentType extends Enum[LoanRepaymentType] {

  val values: IndexedSeq[LoanRepaymentType] = findValues

  case object Combined     extends LoanRepaymentType("combined")
  case object InterestOnly extends LoanRepaymentType("interest_only")
  case object Other        extends LoanRepaymentType("other")
  case object Repayment    extends LoanRepaymentType("repayment")
}
