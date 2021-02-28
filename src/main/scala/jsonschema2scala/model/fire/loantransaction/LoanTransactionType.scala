package jsonschema2scala.model.fire
package loantransaction

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class LoanTransactionType(override val entryName: String) extends EnumEntry

object LoanTransactionType extends Enum[LoanTransactionType] {

  val values: IndexedSeq[LoanTransactionType] = findValues

  case object Advance extends LoanTransactionType("advance")

  case object CapitalRepayment extends LoanTransactionType("capital_repayment")

  case object Capitalisation extends LoanTransactionType("capitalisation")

  case object Due extends LoanTransactionType("due")

  case object FurtherAdvance extends LoanTransactionType("further_advance")

  case object Interest extends LoanTransactionType("interest")

  case object InterestRepayment extends LoanTransactionType("interest_repayment")

  case object Other extends LoanTransactionType("other")

  case object Received extends LoanTransactionType("received")

  case object Sale extends LoanTransactionType("sale")

  case object WriteOff extends LoanTransactionType("write_off")

}
