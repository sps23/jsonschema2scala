package jsonschema2scala.generated.derivativecashflow

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeCashFlowAssetLiability(override val entryName: String) extends EnumEntry

object DerivativeCashFlowAssetLiability extends Enum[DerivativeCashFlowAssetLiability] {

  val values: IndexedSeq[DerivativeCashFlowAssetLiability] = findValues

  case object Asset     extends DerivativeCashFlowAssetLiability("asset")
  case object Liability extends DerivativeCashFlowAssetLiability("liability")
}
