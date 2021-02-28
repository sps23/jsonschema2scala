package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySftType(override val entryName: String) extends EnumEntry

object SecuritySftType extends Enum[SecuritySftType] {

  val values: IndexedSeq[SecuritySftType] = findValues

  case object BondBorrow extends SecuritySftType("bond_borrow")

  case object BondLoan extends SecuritySftType("bond_loan")

  case object BuySellBack extends SecuritySftType("buy_sell_back")

  case object MarginLoan extends SecuritySftType("margin_loan")

  case object Repo extends SecuritySftType("repo")

  case object RevRepo extends SecuritySftType("rev_repo")

  case object SellBuyBack extends SecuritySftType("sell_buy_back")

  case object StockBorrow extends SecuritySftType("stock_borrow")

  case object StockLoan extends SecuritySftType("stock_loan")

}
