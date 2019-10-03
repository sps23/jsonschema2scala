package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaInterestRepaymentFrequency(override val entryName: String) extends EnumEntry

object LoanSchemaInterestRepaymentFrequency extends Enum[LoanSchemaInterestRepaymentFrequency] {

  val values: IndexedSeq[LoanSchemaInterestRepaymentFrequency] = findValues

  case object Daily        extends LoanSchemaInterestRepaymentFrequency("daily")
  case object Weekly       extends LoanSchemaInterestRepaymentFrequency("weekly")
  case object BiWeekly     extends LoanSchemaInterestRepaymentFrequency("bi_weekly")
  case object Monthly      extends LoanSchemaInterestRepaymentFrequency("monthly")
  case object BiMonthly    extends LoanSchemaInterestRepaymentFrequency("bi_monthly")
  case object Quarterly    extends LoanSchemaInterestRepaymentFrequency("quarterly")
  case object SemiAnnually extends LoanSchemaInterestRepaymentFrequency("semi_annually")
  case object Annually     extends LoanSchemaInterestRepaymentFrequency("annually")
  case object AtMaturity   extends LoanSchemaInterestRepaymentFrequency("at_maturity")
}
