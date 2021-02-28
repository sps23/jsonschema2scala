package jsonschema2scala.model.fire
package account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountType(override val entryName: String) extends EnumEntry

object AccountType extends Enum[AccountType] {

  val values: IndexedSeq[AccountType] = findValues

  case object Amortisation extends AccountType("amortisation")

  case object Bonds extends AccountType("bonds")

  case object Call extends AccountType("call")

  case object Cd extends AccountType("cd")

  case object CreditCard extends AccountType("credit_card")

  case object Current extends AccountType("current")

  case object Deferred extends AccountType("deferred")

  case object Depreciation extends AccountType("depreciation")

  case object Expense extends AccountType("expense")

  case object Income extends AccountType("income")

  case object Intangible extends AccountType("intangible")

  case object InternetOnly extends AccountType("internet_only")

  case object Ira extends AccountType("ira")

  case object Isa extends AccountType("isa")

  case object MoneyMarket extends AccountType("money_market")

  case object NonDeferred extends AccountType("non_deferred")

  case object NonProduct extends AccountType("non_product")

  case object Other extends AccountType("other")

  case object PrepaidCard extends AccountType("prepaid_card")

  case object Provision extends AccountType("provision")

  case object Reserve extends AccountType("reserve")

  case object RetailBonds extends AccountType("retail_bonds")

  case object Savings extends AccountType("savings")

  case object Suspense extends AccountType("suspense")

  case object Tangible extends AccountType("tangible")

  case object TimeDeposit extends AccountType("time_deposit")

  case object Vostro extends AccountType("vostro")

}
