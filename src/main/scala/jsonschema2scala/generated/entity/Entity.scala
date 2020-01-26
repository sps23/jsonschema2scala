package jsonschema2scala.generated
package entity

import java.time.LocalDateTime

trait Entity {
  def id: String
  def date: LocalDateTime
  def address_city: Option[String]
  def boe_industry_code: Option[String]
  def boe_sector_code: Option[String]
  def count: Option[Int]
  def country_code: Option[CountryCode]
  def credit_impaired: Option[Boolean]
  def cqs_standardised: Option[Int]
  def cqs_irb: Option[Int]
  def fitch_lt: Option[EntityFitchLt]
  def fitch_st: Option[EntityFitchSt]
  def intra_group: Option[Boolean]
  def lei_code: Option[String]
  def legal_entity_name: Option[String]
  def moodys_lt: Option[EntityMoodysLt]
  def moodys_st: Option[EntityMoodysSt]
  def name: Option[String]
  def parent_id: Option[String]
  def relationship: Option[EntityRelationship]
  def reporting_relationship: Option[EntityReportingRelationship]
  def risk_group_id: Option[String]
  def risk_country_code: Option[CountryCode]
  def sic_code: Option[Int]
  def ssic_code: Option[Int]
  def snp_lt: Option[EntitySnpLt]
  def snp_st: Option[EntitySnpSt]
  def source: Option[String]
  def `type`: Option[EntityType]
  def version_id: Option[String]
}
