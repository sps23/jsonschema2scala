package jsonschema2scala.generated.loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanSchemaMovement(override val entryName: String) extends EnumEntry

object LoanSchemaMovement extends Enum[LoanSchemaMovement] {

  val values: IndexedSeq[LoanSchemaMovement] = findValues

  case object Acquired       extends LoanSchemaMovement("acquired")
  case object Sold           extends LoanSchemaMovement("sold")
  case object Securitised    extends LoanSchemaMovement("securitised")
  case object Syndicated     extends LoanSchemaMovement("syndicated")
  case object SyndicatedLead extends LoanSchemaMovement("syndicated_lead")
  case object Other          extends LoanSchemaMovement("other")
}
