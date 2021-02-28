package jsonschema2scala.model.fire
package collateral

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class CollateralType(override val entryName: String) extends EnumEntry

object CollateralType extends Enum[CollateralType] {

  val values: IndexedSeq[CollateralType] = findValues

  case object Cash extends CollateralType("cash")

  case object CommercialProperty extends CollateralType("commercial_property")

  case object Debenture extends CollateralType("debenture")

  case object Farm extends CollateralType("farm")

  case object Guarantee extends CollateralType("guarantee")

  case object ImmovableProperty extends CollateralType("immovable_property")

  case object LifePolicy extends CollateralType("life_policy")

  case object Multifamily extends CollateralType("multifamily")

  case object Other extends CollateralType("other")

  case object ResidentialProperty extends CollateralType("residential_property")

}
