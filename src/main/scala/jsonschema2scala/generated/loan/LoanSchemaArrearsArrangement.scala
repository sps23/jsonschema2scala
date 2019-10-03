package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaArrearsArrangement(override val entryName: String) extends EnumEntry

object LoanSchemaArrearsArrangement extends Enum[LoanSchemaArrearsArrangement] {

  val values: IndexedSeq[LoanSchemaArrearsArrangement] = findValues

  case object Temporary extends LoanSchemaArrearsArrangement("temporary")
  case object Formal    extends LoanSchemaArrearsArrangement("formal")
  case object Possessed extends LoanSchemaArrearsArrangement("possessed")
  case object None      extends LoanSchemaArrearsArrangement("none")
}
