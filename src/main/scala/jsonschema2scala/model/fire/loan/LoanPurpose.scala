package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanPurpose(override val entryName: String) extends EnumEntry

object LoanPurpose extends Enum[LoanPurpose] {

  val values: IndexedSeq[LoanPurpose] = findValues

  case object Agriculture extends LoanPurpose("agriculture")

  case object BridgingLoan extends LoanPurpose("bridging_loan")

  case object BuyToLet extends LoanPurpose("buy_to_let")

  case object BuyToLetFurtherAdvance extends LoanPurpose("buy_to_let_further_advance")

  case object BuyToLetHousePurchase extends LoanPurpose("buy_to_let_house_purchase")

  case object BuyToLetOther extends LoanPurpose("buy_to_let_other")

  case object BuyToLetRemortgage extends LoanPurpose("buy_to_let_remortgage")

  case object Construction extends LoanPurpose("construction")

  case object ConsumerBuyToLet extends LoanPurpose("consumer_buy_to_let")

  case object FirstTimeBuyer extends LoanPurpose("first_time_buyer")

  case object FurtherAdvance extends LoanPurpose("further_advance")

  case object HousePurchase extends LoanPurpose("house_purchase")

  case object Ips extends LoanPurpose("ips")

  case object LifetimeMortgage extends LoanPurpose("lifetime_mortgage")

  case object Operational extends LoanPurpose("operational")

  case object Other extends LoanPurpose("other")

  case object Promotional extends LoanPurpose("promotional")

  case object Remortgage extends LoanPurpose("remortgage")

  case object RemortgageOther extends LoanPurpose("remortgage_other")

  case object SpeculativeProperty extends LoanPurpose("speculative_property")

}
