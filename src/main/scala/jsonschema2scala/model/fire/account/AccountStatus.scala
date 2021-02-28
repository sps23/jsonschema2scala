package jsonschema2scala.model.fire
package account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountStatus(override val entryName: String) extends EnumEntry

object AccountStatus extends Enum[AccountStatus] {

  val values: IndexedSeq[AccountStatus] = findValues

  case object Active extends AccountStatus("active")

  case object Cancelled extends AccountStatus("cancelled")

  case object CancelledPayoutAgreed extends AccountStatus("cancelled_payout_agreed")

  case object Other extends AccountStatus("other")

  case object Transactional extends AccountStatus("transactional")

}
