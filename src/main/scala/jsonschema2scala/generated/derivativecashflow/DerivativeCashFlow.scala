package jsonschema2scala.generated.derivativecashflow

import java.time.LocalDateTime

import jsonschema2scala.generated.{CurrencyCode, RegulatoryBook}

case class DerivativeCashFlow(
    id: String,
    date: LocalDateTime,
    accruedInterest: Option[Int],
    assetClass: Option[DerivativeCashFlowAssetClass],
    assetLiability: Option[DerivativeCashFlowAssetLiability],
    balance: Option[Int],
    currencyCode: Option[CurrencyCode],
    customerId: Option[String],
    derivativeId: Option[String],
    leg: Option[DerivativeCashFlowLeg],
    mnaId: Option[String],
    mtmClean: Option[Int],
    mtmDirty: Option[Int],
    notionalAmount: Option[Int],
    onBalanceSheet: Option[Boolean],
    paymentDate: Option[LocalDateTime],
    productName: Option[String],
    purpose: Option[DerivativeCashFlowPurpose],
    regulatoryBook: Option[RegulatoryBook],
    reportingLei: Option[String],
    reportingEntityName: Option[String],
    settlementType: Option[DerivativeCashFlowSettlementType],
    source: Option[String],
    tradeDate: Option[LocalDateTime],
    valueDate: Option[LocalDateTime],
    versionId: Option[String]
)
