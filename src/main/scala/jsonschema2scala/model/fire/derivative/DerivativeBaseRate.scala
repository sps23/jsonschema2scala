package jsonschema2scala.model.fire
package derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed trait DerivativeBaseRate extends EnumEntry

object DerivativeBaseRate extends Enum[DerivativeBaseRate] {

  val values: IndexedSeq[DerivativeBaseRate] = findValues

  case object FDTR extends DerivativeBaseRate

  case object UKBRBASE extends DerivativeBaseRate

  case object ZERO extends DerivativeBaseRate

}
