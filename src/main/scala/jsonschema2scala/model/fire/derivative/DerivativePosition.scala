package jsonschema2scala.model.fire
package derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativePosition(override val entryName: String) extends EnumEntry

object DerivativePosition extends Enum[DerivativePosition] {

  val values: IndexedSeq[DerivativePosition] = findValues

  case object Long extends DerivativePosition("long")

  case object Short extends DerivativePosition("short")

}
