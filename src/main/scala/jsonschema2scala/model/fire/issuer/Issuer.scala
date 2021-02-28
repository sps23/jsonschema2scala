package jsonschema2scala.model.fire
package issuer

import java.time.LocalDateTime

import jsonschema2scala.model.fire.entity._

case class Issuer(id: String,
                  date: LocalDateTime,
                  address_city: Option[String],
                  boe_industry_code: Option[String],
                  boe_sector_code: Option[String],
                  count: Option[Long],
                  country_code: Option[CountryCode],
                  credit_impaired: Option[Boolean],
                  cqs_standardised: Option[Long],
                  cqs_irb: Option[Long],
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
                  risk_group_id_2: Option[String],
                  risk_country_code: Option[CountryCode],
                  sic_code: Option[Long],
                  ssic_code: Option[Long],
                  snp_lt: Option[EntitySnpLt],
                  snp_st: Option[EntitySnpSt],
                  source: Option[String],
                  `type`: Option[EntityType],
                  version_id: Option[String],
                  national_reporting_code: Option[String])
    extends Entity
