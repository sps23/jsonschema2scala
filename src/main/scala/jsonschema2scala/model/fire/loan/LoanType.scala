package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanType(override val entryName: String) extends EnumEntry

object LoanType extends Enum[LoanType] {

  val values: IndexedSeq[LoanType] = findValues

  case object Auto extends LoanType("auto")

  case object Commercial extends LoanType("commercial")

  case object CommercialProperty extends LoanType("commercial_property")

  case object CreditCard extends LoanType("credit_card")

  case object CreditFacility extends LoanType("credit_facility")

  case object FinancialLease extends LoanType("financial_lease")

  case object LiquidityFacility extends LoanType("liquidity_facility")

  case object Mortgage extends LoanType("mortgage")

  case object MulticcyFacility extends LoanType("multiccy_facility")

  case object Nostro extends LoanType("nostro")

  case object Other extends LoanType("other")

  case object Personal extends LoanType("personal")

  case object TradeFinance extends LoanType("trade_finance")

}
