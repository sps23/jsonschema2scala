package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanAdministration(override val entryName: String) extends EnumEntry

object LoanAdministration extends Enum[LoanAdministration] {

  val values: IndexedSeq[LoanAdministration] = findValues

  case object Other     extends LoanAdministration("other")
  case object Principal extends LoanAdministration("principal")
}
