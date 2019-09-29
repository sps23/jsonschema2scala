package jsonschema2scala.generated

import java.time.LocalDateTime

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntitySchemaType(override val entryName: String) extends EnumEntry

object State extends Enum[EntitySchemaType] {

  val values: IndexedSeq[EntitySchemaType] = findValues

  case object Individual        extends EntitySchemaType("individual")
  case object Sme               extends EntitySchemaType("sme")
  case object SupportedSme      extends EntitySchemaType("supported_sme")
  case object Charity           extends EntitySchemaType("charity")
  case object Corporate         extends EntitySchemaType("corporate")
  case object Other             extends EntitySchemaType("other")
  case object Financial         extends EntitySchemaType("financial")
  case object NaturalPerson     extends EntitySchemaType("natural_person")
  case object IntlOrg           extends EntitySchemaType("intl_org")
  case object Sovereign         extends EntitySchemaType("sovereign")
  case object CentralBank       extends EntitySchemaType("central_bank")
  case object LocalAuthority    extends EntitySchemaType("local_authority")
  case object RegionalGovt      extends EntitySchemaType("regional_govt")
  case object CentralGovt       extends EntitySchemaType("central_govt")
  case object OtherPse          extends EntitySchemaType("other_pse")
  case object Pse               extends EntitySchemaType("pse")
  case object Mdb               extends EntitySchemaType("mdb")
  case object CreditInstitution extends EntitySchemaType("credit_institution")
  case object InvestmentFirm    extends EntitySchemaType("investment_firm")
  case object Sspe              extends EntitySchemaType("sspe")
  case object Ciu               extends EntitySchemaType("ciu")
  case object Ceis              extends EntitySchemaType("ceis")
  case object Insurer           extends EntitySchemaType("insurer")
  case object FinancialHolding  extends EntitySchemaType("financial_holding")
  case object OtherFinancial    extends EntitySchemaType("other_financial")
  case object PromotionalLender extends EntitySchemaType("promotional_lender")
  case object Pic               extends EntitySchemaType("pic")
  case object CreditUnion       extends EntitySchemaType("credit_union")
  case object DepositBroker     extends EntitySchemaType("deposit_broker")
  case object PensionFund       extends EntitySchemaType("pension_fund")
  case object Partnership       extends EntitySchemaType("partnership")
  case object Ccp               extends EntitySchemaType("ccp")
}

case class EntitySchema(
    id: String,
    date: LocalDateTime,
    addressCity: String,
    boeIndustryCode: String,
    boeSectorCode: String,
    countryCode: CountryCode,
    creditImpaired: Boolean,
    cqsStandardised: Integer,
    cqsIrb: Integer,
    intraGroup: Boolean,
    leiCode: String,
    legalEntityName: String,
    name: String,
    parentId: String,
    riskCountryCode: CountryCode,
    sicCode: Integer,
    source: String,
    `type`: EntitySchemaType,
    versionId: String
)
