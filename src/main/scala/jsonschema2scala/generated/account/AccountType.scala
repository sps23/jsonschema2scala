package jsonschema2scala.generated.account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountType(override val entryName: String) extends EnumEntry

object AccountType extends Enum[AccountType] {

  val values: IndexedSeq[AccountType] = findValues

  case object Bonds        extends AccountType("bonds")
  case object Call         extends AccountType("call")
  case object Cd           extends AccountType("cd")
  case object CreditCard   extends AccountType("credit_card")
  case object Current      extends AccountType("current")
  case object InternetOnly extends AccountType("internet_only")
  case object Isa          extends AccountType("isa")
  case object MoneyMarket  extends AccountType("money_market")
  case object Other        extends AccountType("other")
  case object Payments     extends AccountType("payments")
  case object Provision    extends AccountType("provision")
  case object RetailBonds  extends AccountType("retail_bonds")
  case object Savings      extends AccountType("savings")
  case object TimeDeposit  extends AccountType("time_deposit")
  case object Vostro       extends AccountType("vostro")
}
