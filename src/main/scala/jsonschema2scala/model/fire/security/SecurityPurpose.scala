package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityPurpose(override val entryName: String) extends EnumEntry

object SecurityPurpose extends Enum[SecurityPurpose] {

  val values: IndexedSeq[SecurityPurpose] = findValues

  case object AircraftFinance extends SecurityPurpose("aircraft_finance")

  case object BackToBack extends SecurityPurpose("back_to_back")

  case object Collateral extends SecurityPurpose("collateral")

  case object Custody extends SecurityPurpose("custody")

  case object DefaultFund extends SecurityPurpose("default_fund")

  case object DerivativeCollateral extends SecurityPurpose("derivative_collateral")

  case object IndependentCollateralAmount extends SecurityPurpose("independent_collateral_amount")

  case object Insurance extends SecurityPurpose("insurance")

  case object Investment extends SecurityPurpose("investment")

  case object NonControlling extends SecurityPurpose("non_controlling")

  case object Other extends SecurityPurpose("other")

  case object Reference extends SecurityPurpose("reference")

  case object SegregatedCollateral extends SecurityPurpose("segregated_collateral")

  case object ShareCapital extends SecurityPurpose("share_capital")

  case object TradeFinance extends SecurityPurpose("trade_finance")

}
