package jsonschema2scala.generated.loan

import enumeratum._

// TODO duplicated, should be part of common
import scala.collection.immutable.IndexedSeq

sealed trait LoanSchemaBaseRate extends EnumEntry

object LoanSchemaBaseRate extends Enum[LoanSchemaBaseRate] {

  val values: IndexedSeq[LoanSchemaBaseRate] = findValues

  case object ZERO     extends LoanSchemaBaseRate
  case object UKBRBASE extends LoanSchemaBaseRate
  case object FDTR     extends LoanSchemaBaseRate
}
