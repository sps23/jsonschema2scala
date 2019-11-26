package jsonschema2scala.generated.derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativePurpose(override val entryName: String) extends EnumEntry

object DerivativePurpose extends Enum[DerivativePurpose] {

  val values: IndexedSeq[DerivativePurpose] = findValues

  case object Reference extends DerivativePurpose("reference")
}
