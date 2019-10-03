package jsonschema2scala.generated.security

import enumeratum._
import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySchemaSeniority(override val entryName: String) extends EnumEntry

object SecuritySchemaSeniority extends Enum[SecuritySchemaSeniority] {

  val values: IndexedSeq[SecuritySchemaSeniority] = findValues

  case object SeniorSecured         extends SecuritySchemaSeniority("senior_secured")
  case object SeniorUnsecured       extends SecuritySchemaSeniority("senior_unsecured")
  case object SubordinatedSecured   extends SecuritySchemaSeniority("subordinated_secured")
  case object SubordinatedUnsecured extends SecuritySchemaSeniority("subordinated_unsecured")
}
