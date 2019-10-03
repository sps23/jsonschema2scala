package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaPurpose(override val entryName: String) extends EnumEntry

object LoanSchemaPurpose extends Enum[LoanSchemaPurpose] {

  val values: IndexedSeq[LoanSchemaPurpose] = findValues

  case object HousePurchase          extends LoanSchemaPurpose("house_purchase")
  case object FirstTimeBuyer         extends LoanSchemaPurpose("first_time_buyer")
  case object BuyToLet               extends LoanSchemaPurpose("buy_to_let")
  case object ConsumerBuyToLet       extends LoanSchemaPurpose("consumer_buy_to_let")
  case object BuyToLetHousePurchase  extends LoanSchemaPurpose("buy_to_let_house_purchase")
  case object BuyToLetRemortgage     extends LoanSchemaPurpose("buy_to_let_remortgage")
  case object BuyToLetFurtherAdvance extends LoanSchemaPurpose("buy_to_let_further_advance")
  case object BuyToLetOther          extends LoanSchemaPurpose("buy_to_let_other")
  case object Remortgage             extends LoanSchemaPurpose("remortgage")
  case object RemortgageOther        extends LoanSchemaPurpose("remortgage_other")
  case object LifetimeMortgage       extends LoanSchemaPurpose("lifetime_mortgage")
  case object BridgingLoan           extends LoanSchemaPurpose("bridging_loan")
  case object FurtherAdvance         extends LoanSchemaPurpose("further_advance")
  case object Promotional            extends LoanSchemaPurpose("promotional")
  case object Other                  extends LoanSchemaPurpose("other")
  case object Ips                    extends LoanSchemaPurpose("ips")
}
