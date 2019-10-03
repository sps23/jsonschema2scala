package jsonschema2scala.generated.entity

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntityType(override val entryName: String) extends EnumEntry

object EntityType extends Enum[EntityType] {

  val values: IndexedSeq[EntityType] = findValues

  case object Ccp               extends EntityType("ccp")
  case object Ceis              extends EntityType("ceis")
  case object CentralBank       extends EntityType("central_bank")
  case object CentralGovt       extends EntityType("central_govt")
  case object Charity           extends EntityType("charity")
  case object Ciu               extends EntityType("ciu")
  case object Corporate         extends EntityType("corporate")
  case object CreditInstitution extends EntityType("credit_institution")
  case object CreditUnion       extends EntityType("credit_union")
  case object DepositBroker     extends EntityType("deposit_broker")
  case object Financial         extends EntityType("financial")
  case object FinancialHolding  extends EntityType("financial_holding")
  case object Individual        extends EntityType("individual")
  case object Insurer           extends EntityType("insurer")
  case object IntlOrg           extends EntityType("intl_org")
  case object InvestmentFirm    extends EntityType("investment_firm")
  case object LocalAuthority    extends EntityType("local_authority")
  case object Mdb               extends EntityType("mdb")
  case object NaturalPerson     extends EntityType("natural_person")
  case object Other             extends EntityType("other")
  case object OtherFinancial    extends EntityType("other_financial")
  case object OtherPse          extends EntityType("other_pse")
  case object Partnership       extends EntityType("partnership")
  case object PensionFund       extends EntityType("pension_fund")
  case object Pic               extends EntityType("pic")
  case object PromotionalLender extends EntityType("promotional_lender")
  case object Pse               extends EntityType("pse")
  case object RegionalGovt      extends EntityType("regional_govt")
  case object Sme               extends EntityType("sme")
  case object Sovereign         extends EntityType("sovereign")
  case object Sspe              extends EntityType("sspe")
  case object SupportedSme      extends EntityType("supported_sme")
}
