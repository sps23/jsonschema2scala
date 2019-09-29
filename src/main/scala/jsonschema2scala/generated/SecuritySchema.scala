package jsonschema2scala.generated

import java.time.LocalDateTime

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed trait SecuritySchemaAssetLiability extends EnumEntry

object SecuritySchemaAssetLiability extends Enum[SecuritySchemaAssetLiability] {

  val values: IndexedSeq[SecuritySchemaAssetLiability] = findValues

  case object Asset     extends SecuritySchemaAssetLiability
  case object Liability extends SecuritySchemaAssetLiability
}

sealed abstract class SecuritySchemaCapitalTier(override val entryName: String) extends EnumEntry

object SecuritySchemaCapitalTier extends Enum[SecuritySchemaCapitalTier] {

  val values: IndexedSeq[SecuritySchemaCapitalTier] = findValues

  case object Tier1    extends SecuritySchemaCapitalTier("tier_1")
  case object CeTier1  extends SecuritySchemaCapitalTier("ce_tier_1")
  case object AddTier1 extends SecuritySchemaCapitalTier("add_tier_1")
  case object Tier2    extends SecuritySchemaCapitalTier("tier_2")
  case object AncTier2 extends SecuritySchemaCapitalTier("anc_tier_2")
  case object BasTier2 extends SecuritySchemaCapitalTier("bas_tier_2")
  case object Tier3    extends SecuritySchemaCapitalTier("tier_3")
  case object AncTier3 extends SecuritySchemaCapitalTier("anc_tier_3")
  case object BasTier3 extends SecuritySchemaCapitalTier("bas_tier_3")
}

sealed trait SecuritySchemaBaseRate extends EnumEntry

object SecuritySchemaBaseRate extends Enum[SecuritySchemaBaseRate] {

  val values: IndexedSeq[SecuritySchemaBaseRate] = findValues

  case object ZERO     extends SecuritySchemaBaseRate
  case object UKBRBASE extends SecuritySchemaBaseRate
  case object FDTR     extends SecuritySchemaBaseRate
}

sealed trait SecuritySchemaHqlaClass extends EnumEntry

object SecuritySchemaHqlaClass extends Enum[SecuritySchemaHqlaClass] {

  val values: IndexedSeq[SecuritySchemaHqlaClass] = findValues

  case object I          extends SecuritySchemaHqlaClass
  case object Iia        extends SecuritySchemaHqlaClass
  case object Iib        extends SecuritySchemaHqlaClass
  case object Ineligible extends SecuritySchemaHqlaClass
  case object Exclude    extends SecuritySchemaHqlaClass
}

sealed abstract class SecuritySchemaImpairmentStatus(override val entryName: String) extends EnumEntry

object SecuritySchemaImpairmentStatus extends Enum[SecuritySchemaImpairmentStatus] {

  val values: IndexedSeq[SecuritySchemaImpairmentStatus] = findValues

  case object Stage1 extends SecuritySchemaImpairmentStatus("stage_1")
  case object Stage2 extends SecuritySchemaImpairmentStatus("stage_2")
  case object Stage3 extends SecuritySchemaImpairmentStatus("stage_3")
}

sealed abstract class SecuritySchemaMovement(override val entryName: String) extends EnumEntry

object SecuritySchemaMovement extends Enum[SecuritySchemaMovement] {

  val values: IndexedSeq[SecuritySchemaMovement] = findValues

  case object Cash      extends SecuritySchemaMovement("cash")
  case object Asset     extends SecuritySchemaMovement("asset")
  case object Issuance  extends SecuritySchemaMovement("issuance")
  case object DebtIssue extends SecuritySchemaMovement("debt_issue")
  case object CbOmo     extends SecuritySchemaMovement("cb_omo")
  case object Other     extends SecuritySchemaMovement("other")
}

sealed abstract class SecuritySchemaPurpose(override val entryName: String) extends EnumEntry

object SecuritySchemaPurpose extends Enum[SecuritySchemaPurpose] {

  val values: IndexedSeq[SecuritySchemaPurpose] = findValues

  case object Investment           extends SecuritySchemaPurpose("investment")
  case object Collateral           extends SecuritySchemaPurpose("collateral")
  case object Reference            extends SecuritySchemaPurpose("reference")
  case object DerivativeCollateral extends SecuritySchemaPurpose("derivative_collateral")
  case object Other                extends SecuritySchemaPurpose("other")
}

sealed abstract class SecuritySchemaSeniority(override val entryName: String) extends EnumEntry

object SecuritySchemaSeniority extends Enum[SecuritySchemaSeniority] {

  val values: IndexedSeq[SecuritySchemaSeniority] = findValues

  case object SeniorSecured         extends SecuritySchemaSeniority("senior_secured")
  case object SeniorUnsecured       extends SecuritySchemaSeniority("senior_unsecured")
  case object SubordinatedSecured   extends SecuritySchemaSeniority("subordinated_secured")
  case object SubordinatedUnsecured extends SecuritySchemaSeniority("subordinated_unsecured")
}

sealed abstract class SecuritySchemaSftType(override val entryName: String) extends EnumEntry

object SecuritySchemaSftType extends Enum[SecuritySchemaSftType] {

  val values: IndexedSeq[SecuritySchemaSftType] = findValues

  case object Repo        extends SecuritySchemaSftType("repo")
  case object RevRepo     extends SecuritySchemaSftType("rev_repo")
  case object SellBuyBack extends SecuritySchemaSftType("sell_buy_back")
  case object BuySellBack extends SecuritySchemaSftType("buy_sell_back")
  case object BondLoan    extends SecuritySchemaSftType("bond_loan")
  case object BondBorrow  extends SecuritySchemaSftType("bond_borrow")
  case object StockLoan   extends SecuritySchemaSftType("stock_loan")
  case object StockBorrow extends SecuritySchemaSftType("stock_borrow")
  case object MarginLoan  extends SecuritySchemaSftType("margin_loan")
}

sealed abstract class SecuritySchemaType(override val entryName: String) extends EnumEntry

object SecuritySchemaType extends Enum[SecuritySchemaType] {

  val values: IndexedSeq[SecuritySchemaType] = findValues

  case object Cash             extends SecuritySchemaType("cash")
  case object CbReserve        extends SecuritySchemaType("cb_reserve")
  case object CbFacility       extends SecuritySchemaType("cb_facility")
  case object CashRatioDeposit extends SecuritySchemaType("cash_ratio_deposit")
  case object Equity           extends SecuritySchemaType("equity")
  case object Share            extends SecuritySchemaType("share")
  case object ShareAgg         extends SecuritySchemaType("share_agg")
  case object PrefShare        extends SecuritySchemaType("pref_share")
  case object Debt             extends SecuritySchemaType("debt")
  case object Bond             extends SecuritySchemaType("bond")
  case object CoveredBond      extends SecuritySchemaType("covered_bond")
  case object ConvertibleBond  extends SecuritySchemaType("convertible_bond")
  case object Abs              extends SecuritySchemaType("abs")
  case object Rmbs             extends SecuritySchemaType("rmbs")
  case object RmbsTrans        extends SecuritySchemaType("rmbs_trans")
  case object Cmbs             extends SecuritySchemaType("cmbs")
  case object Frn              extends SecuritySchemaType("frn")
  case object Mbs              extends SecuritySchemaType("mbs")
  case object AbsAuto          extends SecuritySchemaType("abs_auto")
  case object AbsConsumer      extends SecuritySchemaType("abs_consumer")
  case object AbsSme           extends SecuritySchemaType("abs_sme")
  case object AbsOther         extends SecuritySchemaType("abs_other")
  case object Emtn             extends SecuritySchemaType("emtn")
  case object Mtn              extends SecuritySchemaType("mtn")
  case object CommercialPaper  extends SecuritySchemaType("commercial_paper")
  case object Cd               extends SecuritySchemaType("cd")
  case object StructNote       extends SecuritySchemaType("struct_note")
  case object SpvMortgages     extends SecuritySchemaType("spv_mortgages")
  case object SpvOther         extends SecuritySchemaType("spv_other")
  case object Other            extends SecuritySchemaType("other")
}

case class SecuritySchema(
    id: String,
    date: LocalDateTime,
    accFvChangeBeforeTaxes: Integer,
    accFvChangeCreditRisk: Integer,
    accountingTreatment: AccountingTreatment,
    accruedInterest: Integer,
    assetLiability: SecuritySchemaAssetLiability,
    capitalTier: SecuritySchemaCapitalTier,
    cbHaircut: Number,
    balance: Integer,
    baseRate: SecuritySchemaBaseRate,
    //,
    //,
    countryCode: CountryCode,
    cqsStandardised: Integer,
    cqsIrb: Integer,
    currencyCode: CurrencyCode,
    customerId: String,
    dealId: String,
    encumbranceAmount: Integer,
    endDate: LocalDateTime,
    fvhLevel: Integer,
    firstPaymentDate: LocalDateTime,
    guarantorId: String,
    guaranteeStartDate: LocalDateTime,
    hqlaClass: SecuritySchemaHqlaClass,
    impairmentAmount: Integer,
    impairmentStatus: SecuritySchemaImpairmentStatus,
    insolvencyRank: Integer,
    isinCode: String,
    issuerId: String,
    lastPaymentDate: LocalDateTime,
    mnaId: String,
    movement: SecuritySchemaMovement,
    mtmClean: Integer,
    mtmDirty: Integer,
    nextPaymentDate: LocalDateTime,
    notionalAmount: Integer,
    onBalanceSheet: Boolean,
    prevPaymentDate: LocalDateTime,
    productName: String,
    purpose: SecuritySchemaPurpose,
    rate: Number,
    regulatoryBook: RegulatoryBook,
    rehypothecation: Boolean,
    reportingLei: String,
    reportingEntityName: String,
    riskCountryCode: CountryCode,
    seniority: SecuritySchemaSeniority,
    sftType: SecuritySchemaSftType,
    source: String,
    startDate: LocalDateTime,
    `type`: SecuritySchemaType,
    tradeDate: LocalDateTime,
    transferable: Boolean,
    valueDate: LocalDateTime,
    versionId: String
)
