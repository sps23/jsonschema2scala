package jsonschema2scala.model.fire
package entity

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntityFitchSt(override val entryName: String) extends EnumEntry

object EntityFitchSt extends Enum[EntityFitchSt] {

  val values: IndexedSeq[EntityFitchSt] = findValues

  case object B extends EntityFitchSt("b")

  case object C extends EntityFitchSt("c")

  case object D extends EntityFitchSt("d")

  case object F1 extends EntityFitchSt("f1")

  case object F1Plus extends EntityFitchSt("f1_plus")

  case object F2 extends EntityFitchSt("f2")

  case object F3 extends EntityFitchSt("f3")

  case object Rd extends EntityFitchSt("rd")

}
