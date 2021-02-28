package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityFitchSt(override val entryName: String) extends EnumEntry

object SecurityFitchSt extends Enum[SecurityFitchSt] {

  val values: IndexedSeq[SecurityFitchSt] = findValues

  case object B extends SecurityFitchSt("b")

  case object C extends SecurityFitchSt("c")

  case object D extends SecurityFitchSt("d")

  case object F1 extends SecurityFitchSt("f1")

  case object F1Plus extends SecurityFitchSt("f1_plus")

  case object F2 extends SecurityFitchSt("f2")

  case object F3 extends SecurityFitchSt("f3")

  case object Rd extends SecurityFitchSt("rd")

}
