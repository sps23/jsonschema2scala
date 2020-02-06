package jsonschema2scala.generated

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AssetLiability(override val entryName: String) extends EnumEntry

object AssetLiability extends Enum[AssetLiability] {

  val values: IndexedSeq[AssetLiability] = findValues

  case object Asset     extends AssetLiability("asset")
  case object Liability extends AssetLiability("liability")
  case object Equity    extends AssetLiability("equity")
  case object Pnl       extends AssetLiability("pnl")
}
