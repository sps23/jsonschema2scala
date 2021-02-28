package jsonschema2scala.model.fire
package derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeLegType(override val entryName: String) extends EnumEntry

object DerivativeLegType extends Enum[DerivativeLegType] {

  val values: IndexedSeq[DerivativeLegType] = findValues

  case object Call extends DerivativeLegType("call")

  case object Fixed extends DerivativeLegType("fixed")

  case object Floating extends DerivativeLegType("floating")

  case object Indexed extends DerivativeLegType("indexed")

  case object Put extends DerivativeLegType("put")

}
