package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySeniority(override val entryName: String) extends EnumEntry

object SecuritySeniority extends Enum[SecuritySeniority] {

  val values: IndexedSeq[SecuritySeniority] = findValues

  case object SeniorSecured extends SecuritySeniority("senior_secured")

  case object SeniorUnsecured extends SecuritySeniority("senior_unsecured")

  case object SubordinatedSecured extends SecuritySeniority("subordinated_secured")

  case object SubordinatedUnsecured extends SecuritySeniority("subordinated_unsecured")

}
