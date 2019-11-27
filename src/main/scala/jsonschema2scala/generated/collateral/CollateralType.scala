package jsonschema2scala.generated.collateral

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class CollateralType(override val entryName: String) extends EnumEntry

object CollateralType extends Enum[CollateralType] {

  val values: IndexedSeq[CollateralType] = findValues

  case object Cash                extends CollateralType("cash")
  case object CommercialProperty  extends CollateralType("commercial_property")
  case object Debenture           extends CollateralType("debenture")
  case object Guarantee           extends CollateralType("guarantee")
  case object LifePolicy          extends CollateralType("life_policy")
  case object Other               extends CollateralType("other")
  case object ResidentialProperty extends CollateralType("residential_property")
}
