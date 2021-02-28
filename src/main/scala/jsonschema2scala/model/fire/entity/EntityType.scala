package jsonschema2scala.model.fire
package entity

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntityType(override val entryName: String) extends EnumEntry

object EntityType extends Enum[EntityType] {

  val values: IndexedSeq[EntityType] = findValues

  case object BuildingSociety extends EntityType("building_society")

  case object Ccp extends EntityType("ccp")

  case object CentralBank extends EntityType("central_bank")

  case object CentralGovt extends EntityType("central_govt")

  case object Charity extends EntityType("charity")

  case object Ciu extends EntityType("ciu")

  case object CommunityCharity extends EntityType("community_charity")

  case object Corporate extends EntityType("corporate")

  case object CreditInstitution extends EntityType("credit_institution")

  case object CreditUnion extends EntityType("credit_union")

  case object DepositBroker extends EntityType("deposit_broker")

  case object Financial extends EntityType("financial")

  case object FinancialHolding extends EntityType("financial_holding")

  case object Individual extends EntityType("individual")

  case object Insurer extends EntityType("insurer")

  case object IntlOrg extends EntityType("intl_org")

  case object InvestmentFirm extends EntityType("investment_firm")

  case object LocalAuthority extends EntityType("local_authority")

  case object Mdb extends EntityType("mdb")

  case object MmktFund extends EntityType("mmkt_fund")

  case object NaturalPerson extends EntityType("natural_person")

  case object Other extends EntityType("other")

  case object OtherFinancial extends EntityType("other_financial")

  case object OtherPse extends EntityType("other_pse")

  case object Partnership extends EntityType("partnership")

  case object PensionFund extends EntityType("pension_fund")

  case object Pic extends EntityType("pic")

  case object PromotionalLender extends EntityType("promotional_lender")

  case object Pse extends EntityType("pse")

  case object PublicCorporation extends EntityType("public_corporation")

  case object Qccp extends EntityType("qccp")

  case object RegionalGovt extends EntityType("regional_govt")

  case object Sme extends EntityType("sme")

  case object SocialSecurityFund extends EntityType("social_security_fund")

  case object Sovereign extends EntityType("sovereign")

  case object Sspe extends EntityType("sspe")

  case object StateOwnedBank extends EntityType("state_owned_bank")

  case object StatutoryBoard extends EntityType("statutory_board")

  case object SupportedSme extends EntityType("supported_sme")

  case object UnincorporatedBiz extends EntityType("unincorporated_biz")

}
