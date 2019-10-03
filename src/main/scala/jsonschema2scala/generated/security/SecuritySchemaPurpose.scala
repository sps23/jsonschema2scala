package jsonschema2scala.generated.security

import enumeratum._
import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySchemaPurpose(override val entryName: String) extends EnumEntry

object SecuritySchemaPurpose extends Enum[SecuritySchemaPurpose] {

  val values: IndexedSeq[SecuritySchemaPurpose] = findValues

  case object Investment           extends SecuritySchemaPurpose("investment")
  case object Collateral           extends SecuritySchemaPurpose("collateral")
  case object Reference            extends SecuritySchemaPurpose("reference")
  case object DerivativeCollateral extends SecuritySchemaPurpose("derivative_collateral")
  case object Other                extends SecuritySchemaPurpose("other")
}
