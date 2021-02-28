package jsonschema2scala.model.fire
package curve

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class CurveType(override val entryName: String) extends EnumEntry

object CurveType extends Enum[CurveType] {

  val values: IndexedSeq[CurveType] = findValues

  case object Behavioral extends CurveType("behavioral")

  case object Rate extends CurveType("rate")

  case object Volatility extends CurveType("volatility")

}
