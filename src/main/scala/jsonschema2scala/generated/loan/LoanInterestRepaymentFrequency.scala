package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanInterestRepaymentFrequency(override val entryName: String) extends EnumEntry

object LoanInterestRepaymentFrequency extends Enum[LoanInterestRepaymentFrequency] {

  val values: IndexedSeq[LoanInterestRepaymentFrequency] = findValues

  case object Annually     extends LoanInterestRepaymentFrequency("annually")
  case object AtMaturity   extends LoanInterestRepaymentFrequency("at_maturity")
  case object BiMonthly    extends LoanInterestRepaymentFrequency("bi_monthly")
  case object BiWeekly     extends LoanInterestRepaymentFrequency("bi_weekly")
  case object Daily        extends LoanInterestRepaymentFrequency("daily")
  case object Monthly      extends LoanInterestRepaymentFrequency("monthly")
  case object Quarterly    extends LoanInterestRepaymentFrequency("quarterly")
  case object SemiAnnually extends LoanInterestRepaymentFrequency("semi_annually")
  case object Weekly       extends LoanInterestRepaymentFrequency("weekly")
}
