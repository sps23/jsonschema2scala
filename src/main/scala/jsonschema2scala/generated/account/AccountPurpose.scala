package jsonschema2scala.generated.account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountPurpose(override val entryName: String) extends EnumEntry

object AccountPurpose extends Enum[AccountPurpose] {

  val values: IndexedSeq[AccountPurpose] = findValues

  case object CashManagement        extends AccountPurpose("cash_management")
  case object CiService             extends AccountPurpose("ci_service")
  case object Clearing              extends AccountPurpose("clearing")
  case object Collateral            extends AccountPurpose("collateral")
  case object CriticalService       extends AccountPurpose("critical_service")
  case object Custody               extends AccountPurpose("custody")
  case object Deposit               extends AccountPurpose("deposit")
  case object Employee              extends AccountPurpose("employee")
  case object Escrow                extends AccountPurpose("escrow")
  case object FirmOperatingExpenses extends AccountPurpose("firm_operating_expenses")
  case object Ips                   extends AccountPurpose("ips")
  case object Operational           extends AccountPurpose("operational")
  case object OperationalEscrow     extends AccountPurpose("operational_escrow")
  case object Other                 extends AccountPurpose("other")
  case object PrimeBrokerage        extends AccountPurpose("prime_brokerage")
  case object System                extends AccountPurpose("system")
  case object Tax                   extends AccountPurpose("tax")
}
