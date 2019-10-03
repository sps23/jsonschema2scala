package jsonschema2scala.generated.security

import enumeratum._
import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySchemaType(override val entryName: String) extends EnumEntry

object SecuritySchemaType extends Enum[SecuritySchemaType] {

  val values: IndexedSeq[SecuritySchemaType] = findValues

  case object Cash             extends SecuritySchemaType("cash")
  case object CbReserve        extends SecuritySchemaType("cb_reserve")
  case object CbFacility       extends SecuritySchemaType("cb_facility")
  case object CashRatioDeposit extends SecuritySchemaType("cash_ratio_deposit")
  case object Equity           extends SecuritySchemaType("equity")
  case object Share            extends SecuritySchemaType("share")
  case object ShareAgg         extends SecuritySchemaType("share_agg")
  case object PrefShare        extends SecuritySchemaType("pref_share")
  case object Debt             extends SecuritySchemaType("debt")
  case object Bond             extends SecuritySchemaType("bond")
  case object CoveredBond      extends SecuritySchemaType("covered_bond")
  case object ConvertibleBond  extends SecuritySchemaType("convertible_bond")
  case object Abs              extends SecuritySchemaType("abs")
  case object Rmbs             extends SecuritySchemaType("rmbs")
  case object RmbsTrans        extends SecuritySchemaType("rmbs_trans")
  case object Cmbs             extends SecuritySchemaType("cmbs")
  case object Frn              extends SecuritySchemaType("frn")
  case object Mbs              extends SecuritySchemaType("mbs")
  case object AbsAuto          extends SecuritySchemaType("abs_auto")
  case object AbsConsumer      extends SecuritySchemaType("abs_consumer")
  case object AbsSme           extends SecuritySchemaType("abs_sme")
  case object AbsOther         extends SecuritySchemaType("abs_other")
  case object Emtn             extends SecuritySchemaType("emtn")
  case object Mtn              extends SecuritySchemaType("mtn")
  case object CommercialPaper  extends SecuritySchemaType("commercial_paper")
  case object Cd               extends SecuritySchemaType("cd")
  case object StructNote       extends SecuritySchemaType("struct_note")
  case object SpvMortgages     extends SecuritySchemaType("spv_mortgages")
  case object SpvOther         extends SecuritySchemaType("spv_other")
  case object Other            extends SecuritySchemaType("other")
}
