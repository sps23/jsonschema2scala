package jsonschema2scala.generated.entity

import java.time.LocalDateTime

import jsonschema2scala.generated.CountryCode

case class Issuer(
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
    `type`: Option[EntityType],
    versionId: Option[String]
) extends Entity
