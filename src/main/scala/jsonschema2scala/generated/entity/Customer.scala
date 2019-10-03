package jsonschema2scala.generated
package entity

import java.time.LocalDateTime

case class Customer(
    override val id: String,
    override val date: LocalDateTime,
    override val addressCity: Option[String],
    override val boeIndustryCode: Option[String],
    override val boeSectorCode: Option[String],
    override val countryCode: Option[CountryCode],
    override val creditImpaired: Option[Boolean],
    override val cqsStandardised: Option[Int],
    override val cqsIrb: Option[Int],
    override val intraGroup: Option[Boolean],
    override val leiCode: Option[String],
    override val legalEntityName: Option[String],
    override val name: Option[String],
    override val parentId: Option[String],
    override val riskCountryCode: Option[CountryCode],
    override val sicCode: Option[Int],
    override val source: Option[String],
    override val `type`: Option[EntityType],
    override val versionId: Option[String],
    productCount: Option[Int],
    startDate: Option[LocalDateTime],
    status: Option[CustomerStatus]
) extends Entity(
      id,
      date,
      addressCity,
      boeIndustryCode,
      boeSectorCode,
      countryCode,
      creditImpaired,
      cqsStandardised,
      cqsIrb,
      intraGroup,
      leiCode,
      legalEntityName,
      name,
      parentId,
      riskCountryCode,
      sicCode,
      source,
      `type`,
      versionId
    )
