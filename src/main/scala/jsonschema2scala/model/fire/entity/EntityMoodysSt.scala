package jsonschema2scala.model.fire
package entity

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntityMoodysSt(override val entryName: String) extends EnumEntry

object EntityMoodysSt extends Enum[EntityMoodysSt] {

  val values: IndexedSeq[EntityMoodysSt] = findValues

  case object Np extends EntityMoodysSt("np")

  case object P1 extends EntityMoodysSt("p1")

  case object P2 extends EntityMoodysSt("p2")

  case object P3 extends EntityMoodysSt("p3")

}
