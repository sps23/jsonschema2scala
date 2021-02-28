package jsonschema2scala.model.fire
package account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountPurpose(override val entryName: String) extends EnumEntry

object AccountPurpose extends Enum[AccountPurpose] {

  val values: IndexedSeq[AccountPurpose] = findValues

  case object Admin extends AccountPurpose("admin")

  case object AnnualBonusAccruals extends AccountPurpose("annual_bonus_accruals")

  case object BenefitInKind extends AccountPurpose("benefit_in_kind")

  case object CapitalGainTax extends AccountPurpose("capital_gain_tax")

  case object CashManagement extends AccountPurpose("cash_management")

  case object CfHedge extends AccountPurpose("cf_hedge")

  case object CiService extends AccountPurpose("ci_service")

  case object Clearing extends AccountPurpose("clearing")

  case object Collateral extends AccountPurpose("collateral")

  case object Commitments extends AccountPurpose("commitments")

  case object ComputerAndItCost extends AccountPurpose("computer_and_it_cost")

  case object CorporationTax extends AccountPurpose("corporation_tax")

  case object CreditCardFee extends AccountPurpose("credit_card_fee")

  case object CriticalService extends AccountPurpose("critical_service")

  case object CurrentAccountFee extends AccountPurpose("current_account_fee")

  case object Custody extends AccountPurpose("custody")

  case object DealingRevDeriv extends AccountPurpose("dealing_rev_deriv")

  case object DealingRevDerivNse extends AccountPurpose("dealing_rev_deriv_nse")

  case object DealingRevFx extends AccountPurpose("dealing_rev_fx")

  case object DealingRevFxNse extends AccountPurpose("dealing_rev_fx_nse")

  case object DealingRevSec extends AccountPurpose("dealing_rev_sec")

  case object DealingRevSecNse extends AccountPurpose("dealing_rev_sec_nse")

  case object DealingRevenue extends AccountPurpose("dealing_revenue")

  case object Deposit extends AccountPurpose("deposit")

  case object DerivativeFee extends AccountPurpose("derivative_fee")

  case object DivFromCis extends AccountPurpose("div_from_cis")

  case object DivFromMoneyMkt extends AccountPurpose("div_from_money_mkt")

  case object Dividend extends AccountPurpose("dividend")

  case object Donation extends AccountPurpose("donation")

  case object Employee extends AccountPurpose("employee")

  case object EmployeeStockOption extends AccountPurpose("employee_stock_option")

  case object Escrow extends AccountPurpose("escrow")

  case object Fees extends AccountPurpose("fees")

  case object Fine extends AccountPurpose("fine")

  case object FirmOperatingExpenses extends AccountPurpose("firm_operating_expenses")

  case object FirmOperations extends AccountPurpose("firm_operations")

  case object Fx extends AccountPurpose("fx")

  case object Goodwill extends AccountPurpose("goodwill")

  case object InsuranceFee extends AccountPurpose("insurance_fee")

  case object IntOnBondAndFrn extends AccountPurpose("int_on_bond_and_frn")

  case object IntOnBridgingLoan extends AccountPurpose("int_on_bridging_loan")

  case object IntOnCreditCard extends AccountPurpose("int_on_credit_card")

  case object IntOnDeposit extends AccountPurpose("int_on_deposit")

  case object IntOnDerivHedge extends AccountPurpose("int_on_deriv_hedge")

  case object IntOnDerivative extends AccountPurpose("int_on_derivative")

  case object IntOnEcgdLending extends AccountPurpose("int_on_ecgd_lending")

  case object IntOnLoanAndAdv extends AccountPurpose("int_on_loan_and_adv")

  case object IntOnMoneyMkt extends AccountPurpose("int_on_money_mkt")

  case object IntOnMortgage extends AccountPurpose("int_on_mortgage")

  case object IntOnSft extends AccountPurpose("int_on_sft")

  case object Interest extends AccountPurpose("interest")

  case object IntraGroupFee extends AccountPurpose("intra_group_fee")

  case object InvInSubsidiary extends AccountPurpose("inv_in_subsidiary")

  case object InvestmentBankingFee extends AccountPurpose("investment_banking_fee")

  case object InvestmentProperty extends AccountPurpose("investment_property")

  case object Ips extends AccountPurpose("ips")

  case object LoanAndAdvanceFee extends AccountPurpose("loan_and_advance_fee")

  case object ManufacturedDividend extends AccountPurpose("manufactured_dividend")

  case object MortgageFee extends AccountPurpose("mortgage_fee")

  case object NiContribution extends AccountPurpose("ni_contribution")

  case object NonLifeInsPremium extends AccountPurpose("non_life_ins_premium")

  case object OccupancyCost extends AccountPurpose("occupancy_cost")

  case object Operational extends AccountPurpose("operational")

  case object OperationalEscrow extends AccountPurpose("operational_escrow")

  case object OperationalExcess extends AccountPurpose("operational_excess")

  case object Other extends AccountPurpose("other")

  case object OtherExpenditure extends AccountPurpose("other_expenditure")

  case object OtherFsFee extends AccountPurpose("other_fs_fee")

  case object OtherNonFsFee extends AccountPurpose("other_non_fs_fee")

  case object OtherSocialContrib extends AccountPurpose("other_social_contrib")

  case object OtherStaffCost extends AccountPurpose("other_staff_cost")

  case object OtherStaffRem extends AccountPurpose("other_staff_rem")

  case object OverdraftFee extends AccountPurpose("overdraft_fee")

  case object OwnProperty extends AccountPurpose("own_property")

  case object Pension extends AccountPurpose("pension")

  case object Ppe extends AccountPurpose("ppe")

  case object PrimeBrokerage extends AccountPurpose("prime_brokerage")

  case object Property extends AccountPurpose("property")

  case object Recovery extends AccountPurpose("recovery")

  case object RedundancyPymt extends AccountPurpose("redundancy_pymt")

  case object Reference extends AccountPurpose("reference")

  case object RegLoss extends AccountPurpose("reg_loss")

  case object RegularWages extends AccountPurpose("regular_wages")

  case object Release extends AccountPurpose("release")

  case object Rent extends AccountPurpose("rent")

  case object Restructuring extends AccountPurpose("restructuring")

  case object RetainedEarnings extends AccountPurpose("retained_earnings")

  case object Revaluation extends AccountPurpose("revaluation")

  case object RevenueReserve extends AccountPurpose("revenue_reserve")

  case object SharePlan extends AccountPurpose("share_plan")

  case object Staff extends AccountPurpose("staff")

  case object System extends AccountPurpose("system")

  case object Tax extends AccountPurpose("tax")

  case object UnsecuredLoanFee extends AccountPurpose("unsecured_loan_fee")

  case object WriteOff extends AccountPurpose("write_off")

}
