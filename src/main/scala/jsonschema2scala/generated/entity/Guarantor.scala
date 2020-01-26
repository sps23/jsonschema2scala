package jsonschema2scala.generated
package entity

import java.time.LocalDateTime

case class Guarantor(
    id: String,
    date: LocalDateTime,
    address_city: Option[String],
    boe_industry_code: Option[String],
    boe_sector_code: Option[String],
    count: Option[Int],
    country_code: Option[CountryCode],
    credit_impaired: Option[Boolean],
    cqs_standardised: Option[Int],
    cqs_irb: Option[Int],
    fitch_lt: Option[EntityFitchLt],
    fitch_st: Option[EntityFitchSt],
    intra_group: Option[Boolean],
    lei_code: Option[String],
    legal_entity_name: Option[String],
    moodys_lt: Option[EntityMoodysLt],
    moodys_st: Option[EntityMoodysSt],
    name: Option[String],
    parent_id: Option[String],
    relationship: Option[EntityRelationship],
    reporting_relationship: Option[EntityReportingRelationship],
    risk_group_id: Option[String],
    risk_country_code: Option[CountryCode],
    sic_code: Option[Int],
    ssic_code: Option[Int],
    snp_lt: Option[EntitySnpLt],
    snp_st: Option[EntitySnpSt],
    source: Option[String],
    `type`: Option[EntityType],
    version_id: Option[String]
) extends Entity
