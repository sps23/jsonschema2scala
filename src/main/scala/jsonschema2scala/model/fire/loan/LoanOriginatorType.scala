package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanOriginatorType(override val entryName: String) extends EnumEntry

object LoanOriginatorType extends Enum[LoanOriginatorType] {

  val values: IndexedSeq[LoanOriginatorType] = findValues

  case object MortgageLender extends LoanOriginatorType("mortgage_lender")

  case object Other extends LoanOriginatorType("other")

  case object Spv extends LoanOriginatorType("spv")

}
