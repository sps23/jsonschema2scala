package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaImpairmentType(override val entryName: String) extends EnumEntry

object LoanSchemaImpairmentType extends Enum[LoanSchemaImpairmentType] {

  val values: IndexedSeq[LoanSchemaImpairmentType] = findValues

  case object Collective extends LoanSchemaImpairmentType("collective")
  case object Individual extends LoanSchemaImpairmentType("individual")
  case object WriteOff   extends LoanSchemaImpairmentType("write_off")
}
