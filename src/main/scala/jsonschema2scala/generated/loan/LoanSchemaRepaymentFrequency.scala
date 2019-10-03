package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaRepaymentFrequency(override val entryName: String) extends EnumEntry

object LoanSchemaRepaymentFrequency extends Enum[LoanSchemaRepaymentFrequency] {

  val values: IndexedSeq[LoanSchemaRepaymentFrequency] = findValues

  case object Daily        extends LoanSchemaRepaymentFrequency("daily")
  case object Weekly       extends LoanSchemaRepaymentFrequency("weekly")
  case object BiWeekly     extends LoanSchemaRepaymentFrequency("bi_weekly")
  case object Monthly      extends LoanSchemaRepaymentFrequency("monthly")
  case object BiMonthly    extends LoanSchemaRepaymentFrequency("bi_monthly")
  case object Quarterly    extends LoanSchemaRepaymentFrequency("quarterly")
  case object SemiAnnually extends LoanSchemaRepaymentFrequency("semi_annually")
  case object Annually     extends LoanSchemaRepaymentFrequency("annually")
  case object AtMaturity   extends LoanSchemaRepaymentFrequency("at_maturity")
}
