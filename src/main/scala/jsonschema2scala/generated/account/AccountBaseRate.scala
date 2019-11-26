package jsonschema2scala.generated.account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed trait AccountBaseRate extends EnumEntry

object AccountBaseRate extends Enum[AccountBaseRate] {

  val values: IndexedSeq[AccountBaseRate] = findValues

  case object FDTR     extends AccountBaseRate
  case object UKBRBASE extends AccountBaseRate
  case object ZERO     extends AccountBaseRate
}
