package jsonschema2scala.generated.derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeType(override val entryName: String) extends EnumEntry

object DerivativeType extends Enum[DerivativeType] {

  val values: IndexedSeq[DerivativeType] = findValues

  case object CallOption   extends DerivativeType("call_option")
  case object CallSwaption extends DerivativeType("call_swaption")
  case object Cds          extends DerivativeType("cds")
  case object Forward      extends DerivativeType("forward")
  case object Future       extends DerivativeType("future")
  case object MtmSwap      extends DerivativeType("mtm_swap")
  case object Option       extends DerivativeType("option")
  case object PutOption    extends DerivativeType("put_option")
  case object PutSwaption  extends DerivativeType("put_swaption")
  case object Tarf         extends DerivativeType("tarf")
  case object VanillaSwap  extends DerivativeType("vanilla_swap")
  case object Xccy         extends DerivativeType("xccy")
}
