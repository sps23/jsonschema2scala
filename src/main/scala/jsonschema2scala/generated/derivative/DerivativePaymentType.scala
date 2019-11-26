package jsonschema2scala.generated.derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativePaymentType(override val entryName: String) extends EnumEntry

object DerivativePaymentType extends Enum[DerivativePaymentType] {

  val values: IndexedSeq[DerivativePaymentType] = findValues

  case object Fixed    extends DerivativePaymentType("fixed")
  case object Floating extends DerivativePaymentType("floating")
}
