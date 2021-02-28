package jsonschema2scala.model.fire
package derivativecashflow

import java.time.LocalDateTime

case class DerivativeCashFlow(id: String,
                              date: LocalDateTime,
                              accrued_interest: Option[Long],
                              asset_class: Option[AssetClass],
                              asset_liability: Option[AssetLiability],
                              balance: Option[Long],
                              csa_id: Option[String],
                              currency_code: Option[CurrencyCode],
                              customer_id: Option[String],
                              derivative_id: Option[String],
                              forward_rate: Option[BigDecimal],
                              leg: Option[DerivativeCashFlowLeg],
                              mna_id: Option[String],
                              mtm_clean: Option[Long],
                              mtm_dirty: Option[Long],
                              notional_amount: Option[Long],
                              on_balance_sheet: Option[Boolean],
                              payment_date: Option[LocalDateTime],
                              product_name: Option[String],
                              purpose: Option[DerivativeCashFlowPurpose],
                              regulatory_book: Option[RegulatoryBook],
                              reporting_entity_name: Option[String],
                              reporting_id: Option[String],
                              reset_date: Option[LocalDateTime],
                              settlement_type: Option[DerivativeCashFlowSettlementType],
                              source: Option[String],
                              trade_date: Option[LocalDateTime],
                              value_date: Option[LocalDateTime],
                              version_id: Option[String])
