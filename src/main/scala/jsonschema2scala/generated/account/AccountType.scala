package jsonschema2scala.generated.account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountType(override val entryName: String) extends EnumEntry

object AccountType extends Enum[AccountType] {

  val values: IndexedSeq[AccountType] = findValues

  case object Bonds              extends AccountType("bonds")
  case object Call               extends AccountType("call")
  case object Cd                 extends AccountType("cd")
  case object CfHedge            extends AccountType("cf_hedge")
  case object CreditCard         extends AccountType("credit_card")
  case object Current            extends AccountType("current")
  case object Deferred           extends AccountType("deferred")
  case object Goodwill           extends AccountType("goodwill")
  case object Intangible         extends AccountType("intangible")
  case object InternetOnly       extends AccountType("internet_only")
  case object InvestmentProperty extends AccountType("investment_property")
  case object Ira                extends AccountType("ira")
  case object Isa                extends AccountType("isa")
  case object MoneyMarket        extends AccountType("money_market")
  case object Other              extends AccountType("other")
  case object OwnerProperty      extends AccountType("owner_property")
  case object Payments           extends AccountType("payments")
  case object Ppe                extends AccountType("ppe")
  case object Property           extends AccountType("property")
  case object Provision          extends AccountType("provision")
  case object RegLoss            extends AccountType("reg_loss")
  case object Reserve            extends AccountType("reserve")
  case object RetailBonds        extends AccountType("retail_bonds")
  case object RevenueReserve     extends AccountType("revenue_reserve")
  case object Savings            extends AccountType("savings")
  case object SharePlan          extends AccountType("share_plan")
  case object Suspense           extends AccountType("suspense")
  case object Tangible           extends AccountType("tangible")
  case object TimeDeposit        extends AccountType("time_deposit")
  case object Vostro             extends AccountType("vostro")
}
