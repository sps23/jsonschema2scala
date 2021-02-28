package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanImpairmentType(override val entryName: String) extends EnumEntry

object LoanImpairmentType extends Enum[LoanImpairmentType] {

  val values: IndexedSeq[LoanImpairmentType] = findValues

  case object Collective extends LoanImpairmentType("collective")

  case object Individual extends LoanImpairmentType("individual")

  case object WriteOff extends LoanImpairmentType("write_off")

}
