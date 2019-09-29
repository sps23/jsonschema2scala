package jsonschema2scala.generated

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountingTreatment(override val entryName: String) extends EnumEntry

object State extends Enum[AccountingTreatment] {

  val values: IndexedSeq[AccountingTreatment] = findValues

  case object CbOrDemand       extends AccountingTreatment("cb_or_demand")
  case object HeldForTrading   extends AccountingTreatment("held_for_trading")
  case object FvThruPnl        extends AccountingTreatment("fv_thru_pnl")
  case object FvMandatorily    extends AccountingTreatment("fv_mandatorily")
  case object FvOci            extends AccountingTreatment("fv_oci")
  case object AmortisedCost    extends AccountingTreatment("amortised_cost")
  case object HeldForHedge     extends AccountingTreatment("held_for_hedge")
  case object AvailableForSale extends AccountingTreatment("available_for_sale")
  case object LoansAndRecs     extends AccountingTreatment("loans_and_recs")
  case object HeldToMaturity   extends AccountingTreatment("held_to_maturity")
}
