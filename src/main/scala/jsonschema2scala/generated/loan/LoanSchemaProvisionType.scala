package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaProvisionType(override val entryName: String) extends EnumEntry

object LoanSchemaProvisionType extends Enum[LoanSchemaProvisionType] {

  val values: IndexedSeq[LoanSchemaProvisionType] = findValues

  case object None  extends LoanSchemaProvisionType("none")
  case object Other extends LoanSchemaProvisionType("other")
}
