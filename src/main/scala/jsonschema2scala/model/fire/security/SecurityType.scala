package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityType(override val entryName: String) extends EnumEntry

object SecurityType extends Enum[SecurityType] {

  val values: IndexedSeq[SecurityType] = findValues

  case object Abs extends SecurityType("abs")

  case object AbsAuto extends SecurityType("abs_auto")

  case object AbsConsumer extends SecurityType("abs_consumer")

  case object AbsOther extends SecurityType("abs_other")

  case object AbsSme extends SecurityType("abs_sme")

  case object Acceptance extends SecurityType("acceptance")

  case object BillOfExchange extends SecurityType("bill_of_exchange")

  case object Bond extends SecurityType("bond")

  case object Cash extends SecurityType("cash")

  case object CashRatioDeposit extends SecurityType("cash_ratio_deposit")

  case object CbFacility extends SecurityType("cb_facility")

  case object CbReserve extends SecurityType("cb_reserve")

  case object Cd extends SecurityType("cd")

  case object Cmbs extends SecurityType("cmbs")

  case object CommercialPaper extends SecurityType("commercial_paper")

  case object ConvertibleBond extends SecurityType("convertible_bond")

  case object CoveredBond extends SecurityType("covered_bond")

  case object Debt extends SecurityType("debt")

  case object Emtn extends SecurityType("emtn")

  case object Equity extends SecurityType("equity")

  case object FinancialGuarantee extends SecurityType("financial_guarantee")

  case object FinancialSloc extends SecurityType("financial_sloc")

  case object Frn extends SecurityType("frn")

  case object Guarantee extends SecurityType("guarantee")

  case object Index extends SecurityType("index")

  case object IndexLinked extends SecurityType("index_linked")

  case object LetterOfCredit extends SecurityType("letter_of_credit")

  case object Mbs extends SecurityType("mbs")

  case object Mtn extends SecurityType("mtn")

  case object Other extends SecurityType("other")

  case object PerformanceBond extends SecurityType("performance_bond")

  case object PerformanceGuarantee extends SecurityType("performance_guarantee")

  case object PerformanceSloc extends SecurityType("performance_sloc")

  case object PrefShare extends SecurityType("pref_share")

  case object Rmbs extends SecurityType("rmbs")

  case object RmbsTrans extends SecurityType("rmbs_trans")

  case object Share extends SecurityType("share")

  case object ShareAgg extends SecurityType("share_agg")

  case object SpvMortgages extends SecurityType("spv_mortgages")

  case object SpvOther extends SecurityType("spv_other")

  case object StructNote extends SecurityType("struct_note")

  case object Treasury extends SecurityType("treasury")

  case object Urp extends SecurityType("urp")

  case object Warranty extends SecurityType("warranty")

}
