package jsonschema2scala.model.fire
package derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeType(override val entryName: String) extends EnumEntry

object DerivativeType extends Enum[DerivativeType] {

  val values: IndexedSeq[DerivativeType] = findValues

  case object CapFloor extends DerivativeType("cap_floor")

  case object Ccds extends DerivativeType("ccds")

  case object Cds extends DerivativeType("cds")

  case object Forward extends DerivativeType("forward")

  case object Fra extends DerivativeType("fra")

  case object Future extends DerivativeType("future")

  case object MtmSwap extends DerivativeType("mtm_swap")

  case object Ndf extends DerivativeType("ndf")

  case object Nds extends DerivativeType("nds")

  case object Ois extends DerivativeType("ois")

  case object Option extends DerivativeType("option")

  case object Spot extends DerivativeType("spot")

  case object Swaption extends DerivativeType("swaption")

  case object VanillaSwap extends DerivativeType("vanilla_swap")

  case object VarianceSwap extends DerivativeType("variance_swap")

  case object Xccy extends DerivativeType("xccy")

}
