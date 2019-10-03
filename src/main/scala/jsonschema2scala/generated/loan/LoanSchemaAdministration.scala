package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaAdministration(override val entryName: String) extends EnumEntry

object LoanSchemaAdministration extends Enum[LoanSchemaAdministration] {

  val values: IndexedSeq[LoanSchemaAdministration] = findValues

  case object Principal extends LoanSchemaAdministration("principal")
  case object Other     extends LoanSchemaAdministration("other")
}
