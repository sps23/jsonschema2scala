package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanStatus(override val entryName: String) extends EnumEntry

object LoanStatus extends Enum[LoanStatus] {

  val values: IndexedSeq[LoanStatus] = findValues

  case object Actual extends LoanStatus("actual")

  case object Cancelled extends LoanStatus("cancelled")

  case object Committed extends LoanStatus("committed")

  case object Defaulted extends LoanStatus("defaulted")

}
