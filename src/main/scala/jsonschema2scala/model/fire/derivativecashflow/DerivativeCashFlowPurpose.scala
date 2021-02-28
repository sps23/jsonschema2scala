package jsonschema2scala.model.fire
package derivativecashflow

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeCashFlowPurpose(override val entryName: String) extends EnumEntry

object DerivativeCashFlowPurpose extends Enum[DerivativeCashFlowPurpose] {

  val values: IndexedSeq[DerivativeCashFlowPurpose] = findValues

  case object Reference extends DerivativeCashFlowPurpose("reference")

}
