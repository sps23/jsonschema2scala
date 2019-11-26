package jsonschema2scala.generated.account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountAssetLiability(override val entryName: String) extends EnumEntry

object AccountAssetLiability extends Enum[AccountAssetLiability] {

  val values: IndexedSeq[AccountAssetLiability] = findValues

  case object Asset     extends AccountAssetLiability("asset")
  case object Liability extends AccountAssetLiability("liability")
}
