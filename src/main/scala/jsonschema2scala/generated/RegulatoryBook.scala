package jsonschema2scala.generated

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class RegulatoryBook(override val entryName: String) extends EnumEntry

object RegulatoryBook extends Enum[RegulatoryBook] {

  val values: IndexedSeq[RegulatoryBook] = findValues

  case object TradingBook extends RegulatoryBook("trading_book")
  case object BankingBook extends RegulatoryBook("banking_book")
}
