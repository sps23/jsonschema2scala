package jsonschema2scala.model.fire
package loantransaction

import java.time.LocalDateTime

case class LoanTransaction(id: String,
                           date: LocalDateTime,
                           amount: Long,
                           currency_code: Option[CurrencyCode],
                           loan_id: Option[String],
                           source: Option[String],
                           `type`: Option[LoanTransactionType],
                           value_date: Option[LocalDateTime],
                           version_id: Option[String])
