package jsonschema2scala.generated

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed trait AccountingTreatmentSimple extends EnumEntry

object AccountingTreatmentSimple extends Enum[AccountingTreatmentSimple] {

  val values: IndexedSeq[AccountingTreatmentSimple] = findValues

  case object CbOrDemand       extends AccountingTreatmentSimple
  case object HeldForTrading   extends AccountingTreatmentSimple
  case object FvThruPnl        extends AccountingTreatmentSimple
  case object FvMandatorily    extends AccountingTreatmentSimple
  case object FvOci            extends AccountingTreatmentSimple
  case object AmortisedCost    extends AccountingTreatmentSimple
  case object HeldForHedge     extends AccountingTreatmentSimple
  case object AvailableForSale extends AccountingTreatmentSimple
  case object LoansAndRecs     extends AccountingTreatmentSimple
  case object HeldToMaturity   extends AccountingTreatmentSimple
}
