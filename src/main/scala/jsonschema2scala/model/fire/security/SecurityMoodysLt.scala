package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityMoodysLt(override val entryName: String) extends EnumEntry

object SecurityMoodysLt extends Enum[SecurityMoodysLt] {

  val values: IndexedSeq[SecurityMoodysLt] = findValues

  case object A1 extends SecurityMoodysLt("a1")

  case object A2 extends SecurityMoodysLt("a2")

  case object A3 extends SecurityMoodysLt("a3")

  case object Aa1 extends SecurityMoodysLt("aa1")

  case object Aa2 extends SecurityMoodysLt("aa2")

  case object Aa3 extends SecurityMoodysLt("aa3")

  case object Aaa extends SecurityMoodysLt("aaa")

  case object B1 extends SecurityMoodysLt("b1")

  case object B2 extends SecurityMoodysLt("b2")

  case object B3 extends SecurityMoodysLt("b3")

  case object Ba1 extends SecurityMoodysLt("ba1")

  case object Ba2 extends SecurityMoodysLt("ba2")

  case object Ba3 extends SecurityMoodysLt("ba3")

  case object Baa1 extends SecurityMoodysLt("baa1")

  case object Baa2 extends SecurityMoodysLt("baa2")

  case object Baa3 extends SecurityMoodysLt("baa3")

  case object C extends SecurityMoodysLt("c")

  case object Ca extends SecurityMoodysLt("ca")

  case object Caa1 extends SecurityMoodysLt("caa1")

  case object Caa2 extends SecurityMoodysLt("caa2")

  case object Caa3 extends SecurityMoodysLt("caa3")

}
