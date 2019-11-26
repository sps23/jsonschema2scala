package jsonschema2scala.generated.derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeAssetLiability(override val entryName: String) extends EnumEntry

object DerivativeAssetLiability extends Enum[DerivativeAssetLiability] {

  val values: IndexedSeq[DerivativeAssetLiability] = findValues

  case object Asset     extends DerivativeAssetLiability("asset")
  case object Liability extends DerivativeAssetLiability("liability")
}
