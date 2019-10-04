package jsonschema2scala.generated
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityPurpose(override val entryName: String) extends EnumEntry

object SecurityPurpose extends Enum[SecurityPurpose] {

  val values: IndexedSeq[SecurityPurpose] = findValues

  case object Collateral           extends SecurityPurpose("collateral")
  case object DerivativeCollateral extends SecurityPurpose("derivative_collateral")
  case object Investment           extends SecurityPurpose("investment")
  case object Other                extends SecurityPurpose("other")
  case object Reference            extends SecurityPurpose("reference")
}
