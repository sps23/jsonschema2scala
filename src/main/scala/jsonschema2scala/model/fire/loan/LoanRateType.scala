package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanRateType(override val entryName: String) extends EnumEntry

object LoanRateType extends Enum[LoanRateType] {

  val values: IndexedSeq[LoanRateType] = findValues

  case object Combined extends LoanRateType("combined")

  case object Fixed extends LoanRateType("fixed")

  case object Tracker extends LoanRateType("tracker")

  case object Variable extends LoanRateType("variable")

}
