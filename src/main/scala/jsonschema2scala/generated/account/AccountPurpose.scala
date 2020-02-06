package jsonschema2scala.generated.account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountPurpose(override val entryName: String) extends EnumEntry

object AccountPurpose extends Enum[AccountPurpose] {

  val values: IndexedSeq[AccountPurpose] = findValues

  case object Admin                 extends AccountPurpose("admin")
  case object AdminExpenses         extends AccountPurpose("admin_expenses")
  case object CashManagement        extends AccountPurpose("cash_management")
  case object CfHedge               extends AccountPurpose("cf_hedge")
  case object CiService             extends AccountPurpose("ci_service")
  case object Clearing              extends AccountPurpose("clearing")
  case object Collateral            extends AccountPurpose("collateral")
  case object Commitments           extends AccountPurpose("commitments")
  case object CriticalService       extends AccountPurpose("critical_service")
  case object Custody               extends AccountPurpose("custody")
  case object Deposit               extends AccountPurpose("deposit")
  case object Depreciation          extends AccountPurpose("depreciation")
  case object Dividend              extends AccountPurpose("dividend")
  case object Employee              extends AccountPurpose("employee")
  case object Escrow                extends AccountPurpose("escrow")
  case object Fees                  extends AccountPurpose("fees")
  case object FirmOperatingExpenses extends AccountPurpose("firm_operating_expenses")
  case object FirmOperations        extends AccountPurpose("firm_operations")
  case object Fx                    extends AccountPurpose("fx")
  case object Goodwill              extends AccountPurpose("goodwill")
  case object Interest              extends AccountPurpose("interest")
  case object InvestmentProperty    extends AccountPurpose("investment_property")
  case object Ips                   extends AccountPurpose("ips")
  case object Operational           extends AccountPurpose("operational")
  case object OperationalEscrow     extends AccountPurpose("operational_escrow")
  case object Other                 extends AccountPurpose("other")
  case object OwnProperty           extends AccountPurpose("own_property")
  case object Pension               extends AccountPurpose("pension")
  case object Ppe                   extends AccountPurpose("ppe")
  case object PrimeBrokerage        extends AccountPurpose("prime_brokerage")
  case object Property              extends AccountPurpose("property")
  case object Reference             extends AccountPurpose("reference")
  case object RegLoss               extends AccountPurpose("reg_loss")
  case object Restructuring         extends AccountPurpose("restructuring")
  case object RevenueReserve        extends AccountPurpose("revenue_reserve")
  case object SharePlan             extends AccountPurpose("share_plan")
  case object Staff                 extends AccountPurpose("staff")
  case object System                extends AccountPurpose("system")
  case object Tax                   extends AccountPurpose("tax")
}
