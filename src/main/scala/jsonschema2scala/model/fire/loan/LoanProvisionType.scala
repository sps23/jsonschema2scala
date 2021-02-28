package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanProvisionType(override val entryName: String) extends EnumEntry

object LoanProvisionType extends Enum[LoanProvisionType] {

  val values: IndexedSeq[LoanProvisionType] = findValues

  case object None extends LoanProvisionType("none")

  case object Other extends LoanProvisionType("other")

}
