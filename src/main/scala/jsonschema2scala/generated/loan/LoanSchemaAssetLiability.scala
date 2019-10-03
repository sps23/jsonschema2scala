package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaAssetLiability(override val entryName: String) extends EnumEntry

object LoanSchemaAssetLiability extends Enum[LoanSchemaAssetLiability] {

  val values: IndexedSeq[LoanSchemaAssetLiability] = findValues

  case object Asset     extends LoanSchemaAssetLiability("asset")
  case object Liability extends LoanSchemaAssetLiability("liability")
}
