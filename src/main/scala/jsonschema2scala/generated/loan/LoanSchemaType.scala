package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaType(override val entryName: String) extends EnumEntry

object LoanSchemaType extends Enum[LoanSchemaType] {

  val values: IndexedSeq[LoanSchemaType] = findValues

  case object Mortgage           extends LoanSchemaType("mortgage")
  case object CommercialProperty extends LoanSchemaType("commercial_property")
  case object Commercial         extends LoanSchemaType("commercial")
  case object Personal           extends LoanSchemaType("personal")
  case object Auto               extends LoanSchemaType("auto")
  case object LiquidityFacility  extends LoanSchemaType("liquidity_facility")
  case object LetterOfCredit     extends LoanSchemaType("letter_of_credit")
  case object Guarantee          extends LoanSchemaType("guarantee")
  case object TradeFinance       extends LoanSchemaType("trade_finance")
  case object CreditCard         extends LoanSchemaType("credit_card")
  case object CreditFacility     extends LoanSchemaType("credit_facility")
  case object MulticcyFacility   extends LoanSchemaType("multiccy_facility")
  case object Nostro             extends LoanSchemaType("nostro")
  case object Other              extends LoanSchemaType("other")
}
