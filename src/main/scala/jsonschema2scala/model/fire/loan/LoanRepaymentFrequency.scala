package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanRepaymentFrequency(override val entryName: String) extends EnumEntry

object LoanRepaymentFrequency extends Enum[LoanRepaymentFrequency] {

  val values: IndexedSeq[LoanRepaymentFrequency] = findValues

  case object Annually extends LoanRepaymentFrequency("annually")

  case object AtMaturity extends LoanRepaymentFrequency("at_maturity")

  case object BiMonthly extends LoanRepaymentFrequency("bi_monthly")

  case object BiWeekly extends LoanRepaymentFrequency("bi_weekly")

  case object Daily extends LoanRepaymentFrequency("daily")

  case object Monthly extends LoanRepaymentFrequency("monthly")

  case object Quarterly extends LoanRepaymentFrequency("quarterly")

  case object SemiAnnually extends LoanRepaymentFrequency("semi_annually")

  case object Weekly extends LoanRepaymentFrequency("weekly")

}
