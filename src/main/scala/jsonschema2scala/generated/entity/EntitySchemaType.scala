package jsonschema2scala.generated.entity

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntitySchemaType(override val entryName: String) extends EnumEntry

object EntitySchemaType extends Enum[EntitySchemaType] {

  val values: IndexedSeq[EntitySchemaType] = findValues

  case object Ccp               extends EntitySchemaType("ccp")
  case object Ceis              extends EntitySchemaType("ceis")
  case object CentralBank       extends EntitySchemaType("central_bank")
  case object CentralGovt       extends EntitySchemaType("central_govt")
  case object Charity           extends EntitySchemaType("charity")
  case object Ciu               extends EntitySchemaType("ciu")
  case object Corporate         extends EntitySchemaType("corporate")
  case object CreditInstitution extends EntitySchemaType("credit_institution")
  case object CreditUnion       extends EntitySchemaType("credit_union")
  case object DepositBroker     extends EntitySchemaType("deposit_broker")
  case object Financial         extends EntitySchemaType("financial")
  case object FinancialHolding  extends EntitySchemaType("financial_holding")
  case object Individual        extends EntitySchemaType("individual")
  case object Insurer           extends EntitySchemaType("insurer")
  case object IntlOrg           extends EntitySchemaType("intl_org")
  case object InvestmentFirm    extends EntitySchemaType("investment_firm")
  case object LocalAuthority    extends EntitySchemaType("local_authority")
  case object Mdb               extends EntitySchemaType("mdb")
  case object NaturalPerson     extends EntitySchemaType("natural_person")
  case object Other             extends EntitySchemaType("other")
  case object OtherFinancial    extends EntitySchemaType("other_financial")
  case object OtherPse          extends EntitySchemaType("other_pse")
  case object Partnership       extends EntitySchemaType("partnership")
  case object PensionFund       extends EntitySchemaType("pension_fund")
  case object Pic               extends EntitySchemaType("pic")
  case object PromotionalLender extends EntitySchemaType("promotional_lender")
  case object Pse               extends EntitySchemaType("pse")
  case object RegionalGovt      extends EntitySchemaType("regional_govt")
  case object Sme               extends EntitySchemaType("sme")
  case object Sovereign         extends EntitySchemaType("sovereign")
  case object Sspe              extends EntitySchemaType("sspe")
  case object SupportedSme      extends EntitySchemaType("supported_sme")
}
