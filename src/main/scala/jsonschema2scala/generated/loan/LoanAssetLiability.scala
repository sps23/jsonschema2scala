package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanAssetLiability(override val entryName: String) extends EnumEntry

object LoanAssetLiability extends Enum[LoanAssetLiability] {

  val values: IndexedSeq[LoanAssetLiability] = findValues

  case object Asset     extends LoanAssetLiability("asset")
  case object Liability extends LoanAssetLiability("liability")
}
