package jsonschema2scala.model.fire
package loan

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanMovement(override val entryName: String) extends EnumEntry

object LoanMovement extends Enum[LoanMovement] {

  val values: IndexedSeq[LoanMovement] = findValues

  case object Acquired extends LoanMovement("acquired")

  case object Other extends LoanMovement("other")

  case object Securitised extends LoanMovement("securitised")

  case object Sold extends LoanMovement("sold")

  case object Syndicated extends LoanMovement("syndicated")

  case object SyndicatedLead extends LoanMovement("syndicated_lead")

}
