package jsonschema2scala.model.fire
package adjustment

import java.time.LocalDateTime

case class Adjustment(id: Option[String],
                      date: Option[LocalDateTime],
                      col: Option[String],
                      comment: Option[String],
                      contribution_amount: Option[Long],
                      contribution_text: Option[String],
                      currency_code: Option[CurrencyCode],
                      page: Option[String],
                      report_type: Option[String],
                      reporting_entity_name: Option[String],
                      row: Option[String],
                      source: Option[String],
                      version_id: Option[String])
