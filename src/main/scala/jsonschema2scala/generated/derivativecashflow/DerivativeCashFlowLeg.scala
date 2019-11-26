package jsonschema2scala.generated.derivativecashflow

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeCashFlowLeg(override val entryName: String) extends EnumEntry

object DerivativeCashFlowLeg extends Enum[DerivativeCashFlowLeg] {

  val values: IndexedSeq[DerivativeCashFlowLeg] = findValues

  case object Pay     extends DerivativeCashFlowLeg("pay")
  case object Receive extends DerivativeCashFlowLeg("receive")
}
