package jsonschema2scala.generated
package entity

import java.time.LocalDateTime

case class EntitySchema(
    id: String,
    date: LocalDateTime,
    addressCity: Option[String],
    boeIndustryCode: Option[String],
    boeSectorCode: Option[String],
    countryCode: Option[CountryCode],
    creditImpaired: Option[Boolean],
    cqsStandardised: Option[Int],
    cqsIrb: Option[Int],
    intraGroup: Option[Boolean],
    leiCode: Option[String],
    legalEntityName: Option[String],
    name: Option[String],
    parentId: Option[String],
    riskCountryCode: Option[CountryCode],
    sicCode: Option[Int],
    source: Option[String],
    `type`: Option[EntitySchemaType],
    versionId: Option[String]
)
