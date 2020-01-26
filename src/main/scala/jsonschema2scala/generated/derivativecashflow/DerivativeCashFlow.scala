package jsonschema2scala.generated
package derivativecashflow

import java.time.LocalDateTime

case class DerivativeCashFlow(
    id: String,
    date: LocalDateTime,
    accrued_interest: Option[Int],
    asset_class: Option[AssetClass],
    asset_liability: Option[AssetLiability],
    balance: Option[Int],
    currency_code: Option[CurrencyCode],
    customer_id: Option[String],
    derivative_id: Option[String],
    leg: Option[DerivativeCashFlowLeg],
    mna_id: Option[String],
    mtm_clean: Option[Int],
    mtm_dirty: Option[Int],
    notional_amount: Option[Int],
    on_balance_sheet: Option[Boolean],
    payment_date: Option[LocalDateTime],
    product_name: Option[String],
    purpose: Option[DerivativeCashFlowPurpose],
    regulatory_book: Option[RegulatoryBook],
    reporting_lei: Option[String],
    reporting_entity_name: Option[String],
    settlement_type: Option[DerivativeCashFlowSettlementType],
    source: Option[String],
    trade_date: Option[LocalDateTime],
    value_date: Option[LocalDateTime],
    version_id: Option[String]
)
