package jsonschema2scala.generated.security

import enumeratum._
import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySchemaSftType(override val entryName: String) extends EnumEntry

object SecuritySchemaSftType extends Enum[SecuritySchemaSftType] {

  val values: IndexedSeq[SecuritySchemaSftType] = findValues

  case object Repo        extends SecuritySchemaSftType("repo")
  case object RevRepo     extends SecuritySchemaSftType("rev_repo")
  case object SellBuyBack extends SecuritySchemaSftType("sell_buy_back")
  case object BuySellBack extends SecuritySchemaSftType("buy_sell_back")
  case object BondLoan    extends SecuritySchemaSftType("bond_loan")
  case object BondBorrow  extends SecuritySchemaSftType("bond_borrow")
  case object StockLoan   extends SecuritySchemaSftType("stock_loan")
  case object StockBorrow extends SecuritySchemaSftType("stock_borrow")
  case object MarginLoan  extends SecuritySchemaSftType("margin_loan")
}
