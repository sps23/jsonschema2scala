package jsonschema2scala.generated.derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeAssetClass(override val entryName: String) extends EnumEntry

object DerivativeAssetClass extends Enum[DerivativeAssetClass] {

  val values: IndexedSeq[DerivativeAssetClass] = findValues

  case object Agri        extends DerivativeAssetClass("agri")
  case object Co          extends DerivativeAssetClass("co")
  case object Coal        extends DerivativeAssetClass("coal")
  case object Coffee      extends DerivativeAssetClass("coffee")
  case object Corn        extends DerivativeAssetClass("corn")
  case object Cr          extends DerivativeAssetClass("cr")
  case object CrIndex     extends DerivativeAssetClass("cr_index")
  case object CrSingle    extends DerivativeAssetClass("cr_single")
  case object Electricity extends DerivativeAssetClass("electricity")
  case object Energy      extends DerivativeAssetClass("energy")
  case object Eq          extends DerivativeAssetClass("eq")
  case object EqIndex     extends DerivativeAssetClass("eq_index")
  case object EqSingle    extends DerivativeAssetClass("eq_single")
  case object Fx          extends DerivativeAssetClass("fx")
  case object Gas         extends DerivativeAssetClass("gas")
  case object Gold        extends DerivativeAssetClass("gold")
  case object Ir          extends DerivativeAssetClass("ir")
  case object Metals      extends DerivativeAssetClass("metals")
  case object Oil         extends DerivativeAssetClass("oil")
  case object Other       extends DerivativeAssetClass("other")
  case object Silver      extends DerivativeAssetClass("silver")
  case object Sugar       extends DerivativeAssetClass("sugar")
}
