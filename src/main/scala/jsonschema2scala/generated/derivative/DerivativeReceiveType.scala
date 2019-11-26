package jsonschema2scala.generated.derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeReceiveType(override val entryName: String) extends EnumEntry

object DerivativeReceiveType extends Enum[DerivativeReceiveType] {

  val values: IndexedSeq[DerivativeReceiveType] = findValues

  case object Fixed    extends DerivativeReceiveType("fixed")
  case object Floating extends DerivativeReceiveType("floating")
}
