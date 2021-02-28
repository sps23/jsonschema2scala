package jsonschema2scala.model.fire
package derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativePurpose(override val entryName: String) extends EnumEntry

object DerivativePurpose extends Enum[DerivativePurpose] {

  val values: IndexedSeq[DerivativePurpose] = findValues

  case object BackToBack extends DerivativePurpose("back_to_back")

  case object CvaHedge extends DerivativePurpose("cva_hedge")

  case object Reference extends DerivativePurpose("reference")

}
