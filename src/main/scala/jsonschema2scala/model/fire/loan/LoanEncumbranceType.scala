package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanEncumbranceType(override val entryName: String) extends EnumEntry

object LoanEncumbranceType extends Enum[LoanEncumbranceType] {

  val values: IndexedSeq[LoanEncumbranceType] = findValues

  case object Abs extends LoanEncumbranceType("abs")

  case object CbFunding extends LoanEncumbranceType("cb_funding")

  case object CoveredBond extends LoanEncumbranceType("covered_bond")

}
