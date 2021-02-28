package jsonschema2scala.model.fire
package account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountEncumbranceType(override val entryName: String) extends EnumEntry

object AccountEncumbranceType extends Enum[AccountEncumbranceType] {

  val values: IndexedSeq[AccountEncumbranceType] = findValues

  case object CoveredBond extends AccountEncumbranceType("covered_bond")

  case object Derivative extends AccountEncumbranceType("derivative")

  case object None extends AccountEncumbranceType("none")

  case object Other extends AccountEncumbranceType("other")

  case object Repo extends AccountEncumbranceType("repo")

}
