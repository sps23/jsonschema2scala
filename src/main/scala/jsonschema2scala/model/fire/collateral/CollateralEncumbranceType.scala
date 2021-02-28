package jsonschema2scala.model.fire
package collateral

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class CollateralEncumbranceType(override val entryName: String) extends EnumEntry

object CollateralEncumbranceType extends Enum[CollateralEncumbranceType] {

  val values: IndexedSeq[CollateralEncumbranceType] = findValues

  case object CoveredBond extends CollateralEncumbranceType("covered_bond")

  case object Derivative extends CollateralEncumbranceType("derivative")

  case object None extends CollateralEncumbranceType("none")

  case object Other extends CollateralEncumbranceType("other")

  case object RealEstate extends CollateralEncumbranceType("real_estate")

  case object Repo extends CollateralEncumbranceType("repo")

}
