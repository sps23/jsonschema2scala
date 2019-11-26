package jsonschema2scala.generated.derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeSettlementType(override val entryName: String) extends EnumEntry

object DerivativeSettlementType extends Enum[DerivativeSettlementType] {

  val values: IndexedSeq[DerivativeSettlementType] = findValues

  case object Cash     extends DerivativeSettlementType("cash")
  case object Physical extends DerivativeSettlementType("physical")
}
