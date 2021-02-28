package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed trait SecurityBaseRate extends EnumEntry

object SecurityBaseRate extends Enum[SecurityBaseRate] {

  val values: IndexedSeq[SecurityBaseRate] = findValues

  case object FDTR extends SecurityBaseRate

  case object UKBRBASE extends SecurityBaseRate

  case object ZERO extends SecurityBaseRate

}
