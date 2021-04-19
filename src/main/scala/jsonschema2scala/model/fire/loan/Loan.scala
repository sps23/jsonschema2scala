package jsonschema2scala.model.fire
package loan

import java.time.LocalDateTime

case class Loan(id: String,
                date: LocalDateTime,
                acc_fv_change_before_taxes: Option[Long],
                acc_fv_change_credit_risk: Option[Long],
                accounting_treatment: Option[AccountingTreatment],
                accrued_interest_balance: Option[Long],
                administration: Option[LoanAdministration],
                arrears_arrangement: Option[LoanArrearsArrangement],
                arrears_balance: Option[Long],
                asset_liability: Option[AssetLiability],
                balance: Option[Long],
                base_rate: Option[LoanBaseRate],
                behavioral_curve_id: Option[String],
                cost_center_code: Option[String],
                country_code: Option[CountryCode],
                cum_recoveries: Option[Long],
                currency_code: Option[CurrencyCode],
                customer_id: Option[String],
                customers: Option[List[LoanCustomer]],
                ccf: Option[Ccf],
                encumbrance_amount: Option[Long],
                encumbrance_end_date: Option[LocalDateTime],
                encumbrance_type: Option[LoanEncumbranceType],
                end_date: Option[LocalDateTime],
                facility_currency_code: Option[CurrencyCode],
                fvh_level: Option[Long],
                first_payment_date: Option[LocalDateTime],
                guarantee_amount: Option[Long],
                guarantor_id: Option[String],
                impairment_amount: Option[Long],
                impairment_status: Option[ImpairmentStatus],
                impairment_type: Option[LoanImpairmentType],
                interest_repayment_frequency: Option[LoanInterestRepaymentFrequency],
                issuer_id: Option[String],
                last_payment_date: Option[LocalDateTime],
                ledger_code: Option[String],
                limit_amount: Option[Long],
                lnrf_amount: Option[Long],
                movement: Option[LoanMovement],
                next_payment_date: Option[LocalDateTime],
                notional_amount: Option[Long],
                on_balance_sheet: Option[Boolean],
                originator_id: Option[String],
                originator_type: Option[LoanOriginatorType],
                prev_payment_date: Option[LocalDateTime],
                product_name: Option[String],
                provision_amount: Option[Long],
                provision_type: Option[LoanProvisionType],
                purpose: Option[LoanPurpose],
                rate: Option[BigDecimal],
                rate_type: Option[LoanRateType],
                ref_income_amount: Option[Long],
                regulated: Option[Boolean],
                regulatory_book: Option[RegulatoryBook],
                repayment_frequency: Option[LoanRepaymentFrequency],
                repayment_type: Option[LoanRepaymentType],
                reporting_entity_name: Option[String],
                reporting_id: Option[String],
                risk_country_code: Option[CountryCode],
                risk_weight_std: Option[BigDecimal],
                risk_weight_irb: Option[BigDecimal],
                secured: Option[Boolean],
                source: Option[String],
                start_date: Option[LocalDateTime],
                status: Option[LoanStatus],
                trade_date: Option[LocalDateTime],
                `type`: Option[LoanType],
                version_id: Option[String],
                vol_adj: Option[BigDecimal],
                count: Option[Long],
                minimum_balance_eur: Option[Long],
                next_repricing_date: Option[LocalDateTime])