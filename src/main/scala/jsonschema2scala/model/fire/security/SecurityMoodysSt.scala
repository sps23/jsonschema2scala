package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityMoodysSt(override val entryName: String) extends EnumEntry

object SecurityMoodysSt extends Enum[SecurityMoodysSt] {

  val values: IndexedSeq[SecurityMoodysSt] = findValues

  case object Np extends SecurityMoodysSt("np")

  case object P1 extends SecurityMoodysSt("p1")

  case object P2 extends SecurityMoodysSt("p2")

  case object P3 extends SecurityMoodysSt("p3")

}
