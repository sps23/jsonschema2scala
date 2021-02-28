package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityMovement(override val entryName: String) extends EnumEntry

object SecurityMovement extends Enum[SecurityMovement] {

  val values: IndexedSeq[SecurityMovement] = findValues

  case object Asset extends SecurityMovement("asset")

  case object Cash extends SecurityMovement("cash")

  case object CbOmo extends SecurityMovement("cb_omo")

  case object DebtIssue extends SecurityMovement("debt_issue")

  case object Issuance extends SecurityMovement("issuance")

  case object Other extends SecurityMovement("other")

}
