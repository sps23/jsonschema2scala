package jsonschema2scala.generated.derivativecashflow

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeCashFlowAssetClass(override val entryName: String) extends EnumEntry

object DerivativeCashFlowAssetClass extends Enum[DerivativeCashFlowAssetClass] {

  val values: IndexedSeq[DerivativeCashFlowAssetClass] = findValues

  case object Agri        extends DerivativeCashFlowAssetClass("agri")
  case object Co          extends DerivativeCashFlowAssetClass("co")
  case object Coal        extends DerivativeCashFlowAssetClass("coal")
  case object Coffee      extends DerivativeCashFlowAssetClass("coffee")
  case object Corn        extends DerivativeCashFlowAssetClass("corn")
  case object Cr          extends DerivativeCashFlowAssetClass("cr")
  case object CrIndex     extends DerivativeCashFlowAssetClass("cr_index")
  case object CrSingle    extends DerivativeCashFlowAssetClass("cr_single")
  case object Electricity extends DerivativeCashFlowAssetClass("electricity")
  case object Energy      extends DerivativeCashFlowAssetClass("energy")
  case object Eq          extends DerivativeCashFlowAssetClass("eq")
  case object EqIndex     extends DerivativeCashFlowAssetClass("eq_index")
  case object EqSingle    extends DerivativeCashFlowAssetClass("eq_single")
  case object Fx          extends DerivativeCashFlowAssetClass("fx")
  case object Gas         extends DerivativeCashFlowAssetClass("gas")
  case object Gold        extends DerivativeCashFlowAssetClass("gold")
  case object Ir          extends DerivativeCashFlowAssetClass("ir")
  case object Metals      extends DerivativeCashFlowAssetClass("metals")
  case object Oil         extends DerivativeCashFlowAssetClass("oil")
  case object Other       extends DerivativeCashFlowAssetClass("other")
  case object Silver      extends DerivativeCashFlowAssetClass("silver")
  case object Sugar       extends DerivativeCashFlowAssetClass("sugar")
}
