package jsonschema2scala.generated.security

import enumeratum._
import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySchemaMovement(override val entryName: String) extends EnumEntry

object SecuritySchemaMovement extends Enum[SecuritySchemaMovement] {

  val values: IndexedSeq[SecuritySchemaMovement] = findValues

  case object Cash      extends SecuritySchemaMovement("cash")
  case object Asset     extends SecuritySchemaMovement("asset")
  case object Issuance  extends SecuritySchemaMovement("issuance")
  case object DebtIssue extends SecuritySchemaMovement("debt_issue")
  case object CbOmo     extends SecuritySchemaMovement("cb_omo")
  case object Other     extends SecuritySchemaMovement("other")
}
