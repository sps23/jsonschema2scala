package jsonschema2scala.generated.security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityStatus(override val entryName: String) extends EnumEntry

object SecurityStatus extends Enum[SecurityStatus] {

  val values: IndexedSeq[SecurityStatus] = findValues

  case object CalledUp extends SecurityStatus("called_up")
  case object PaidUp   extends SecurityStatus("paid_up")
}
