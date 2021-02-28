package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityHqlaClass(override val entryName: String) extends EnumEntry

object SecurityHqlaClass extends Enum[SecurityHqlaClass] {

  val values: IndexedSeq[SecurityHqlaClass] = findValues

  case object Exclude extends SecurityHqlaClass("exclude")

  case object I extends SecurityHqlaClass("i")

  case object INonOp extends SecurityHqlaClass("i_non_op")

  case object Iia extends SecurityHqlaClass("iia")

  case object IiaNonOp extends SecurityHqlaClass("iia_non_op")

  case object Iib extends SecurityHqlaClass("iib")

  case object IibNonOp extends SecurityHqlaClass("iib_non_op")

  case object Ineligible extends SecurityHqlaClass("ineligible")

}
