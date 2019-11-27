package jsonschema2scala.generated.entity

import java.time.LocalDateTime

import jsonschema2scala.generated.CountryCode

trait Entity {
  def id: String
  def date: LocalDateTime
  def addressCity: Option[String]
  def boeIndustryCode: Option[String]
  def boeSectorCode: Option[String]
  def countryCode: Option[CountryCode]
  def creditImpaired: Option[Boolean]
  def cqsStandardised: Option[Int]
  def cqsIrb: Option[Int]
  def intraGroup: Option[Boolean]
  def leiCode: Option[String]
  def legalEntityName: Option[String]
  def name: Option[String]
  def parentId: Option[String]
  def riskCountryCode: Option[CountryCode]
  def sicCode: Option[Int]
  def source: Option[String]
  def `type`: Option[EntityType]
  def versionId: Option[String]
}
