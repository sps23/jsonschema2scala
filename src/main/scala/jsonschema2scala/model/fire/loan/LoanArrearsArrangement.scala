package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanArrearsArrangement(override val entryName: String) extends EnumEntry

object LoanArrearsArrangement extends Enum[LoanArrearsArrangement] {

  val values: IndexedSeq[LoanArrearsArrangement] = findValues

  case object Formal extends LoanArrearsArrangement("formal")

  case object ModifiedTnc extends LoanArrearsArrangement("modified_tnc")

  case object None extends LoanArrearsArrangement("none")

  case object Possessed extends LoanArrearsArrangement("possessed")

  case object Refinancing extends LoanArrearsArrangement("refinancing")

  case object Temporary extends LoanArrearsArrangement("temporary")

}
