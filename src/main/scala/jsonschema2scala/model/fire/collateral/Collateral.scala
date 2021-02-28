package jsonschema2scala.model.fire
package collateral

import java.time.LocalDateTime

case class Collateral(id: String,
                      date: LocalDateTime,
                      loan_ids: Option[List[String]],
                      account_ids: Option[List[String]],
                      charge: Option[Long],
                      currency_code: Option[CurrencyCode],
                      encumbrance_amount: Option[Long],
                      encumbrance_type: Option[CollateralEncumbranceType],
                      end_date: Option[LocalDateTime],
                      regulatory_book: Option[RegulatoryBook],
                      source: Option[String],
                      start_date: Option[LocalDateTime],
                      `type`: Option[CollateralType],
                      value: Long,
                      value_date: Option[LocalDateTime],
                      version_id: Option[String],
                      vol_adj: Option[BigDecimal],
                      vol_adj_fx: Option[BigDecimal])
