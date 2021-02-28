package jsonschema2scala.model.fire
package curve

import java.time.LocalDateTime

case class Curve(id: String,
                 date: LocalDateTime,
                 currency_code: Option[CurrencyCode],
                 name: Option[String],
                 source: Option[String],
                 values: List[CurveValue],
                 version_id: Option[String],
                 `type`: Option[CurveType])
