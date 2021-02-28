package jsonschema2scala.model.fire
package derivativecashflow

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeCashFlowSettlementType(override val entryName: String) extends EnumEntry

object DerivativeCashFlowSettlementType extends Enum[DerivativeCashFlowSettlementType] {

  val values: IndexedSeq[DerivativeCashFlowSettlementType] = findValues

  case object Cash extends DerivativeCashFlowSettlementType("cash")

  case object Physical extends DerivativeCashFlowSettlementType("physical")

}
