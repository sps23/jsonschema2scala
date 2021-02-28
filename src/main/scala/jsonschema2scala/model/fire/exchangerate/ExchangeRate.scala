package jsonschema2scala.model.fire
package exchangerate

import java.time.LocalDateTime

case class ExchangeRate(id: String,
                        date: LocalDateTime,
                        base_currency_code: CurrencyCode,
                        quote: BigDecimal,
                        quote_currency_code: CurrencyCode,
                        source: Option[String],
                        version_id: Option[String])
