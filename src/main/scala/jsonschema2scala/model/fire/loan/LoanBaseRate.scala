package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed trait LoanBaseRate extends EnumEntry

object LoanBaseRate extends Enum[LoanBaseRate] {

  val values: IndexedSeq[LoanBaseRate] = findValues

  case object FDTR extends LoanBaseRate

  case object UKBRBASE extends LoanBaseRate

  case object ZERO extends LoanBaseRate

}
