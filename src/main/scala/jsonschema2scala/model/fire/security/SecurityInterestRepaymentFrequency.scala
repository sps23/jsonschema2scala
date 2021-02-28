package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityInterestRepaymentFrequency(override val entryName: String) extends EnumEntry

object SecurityInterestRepaymentFrequency extends Enum[SecurityInterestRepaymentFrequency] {

  val values: IndexedSeq[SecurityInterestRepaymentFrequency] = findValues

  case object Annually extends SecurityInterestRepaymentFrequency("annually")

  case object AtMaturity extends SecurityInterestRepaymentFrequency("at_maturity")

  case object BiMonthly extends SecurityInterestRepaymentFrequency("bi_monthly")

  case object BiWeekly extends SecurityInterestRepaymentFrequency("bi_weekly")

  case object Daily extends SecurityInterestRepaymentFrequency("daily")

  case object Monthly extends SecurityInterestRepaymentFrequency("monthly")

  case object Quarterly extends SecurityInterestRepaymentFrequency("quarterly")

  case object SemiAnnually extends SecurityInterestRepaymentFrequency("semi_annually")

  case object Weekly extends SecurityInterestRepaymentFrequency("weekly")

}
