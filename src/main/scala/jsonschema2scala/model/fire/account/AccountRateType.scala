package jsonschema2scala.model.fire
package account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountRateType(override val entryName: String) extends EnumEntry

object AccountRateType extends Enum[AccountRateType] {

  val values: IndexedSeq[AccountRateType] = findValues

  case object Combined extends AccountRateType("combined")

  case object Fixed extends AccountRateType("fixed")

  case object Preferential extends AccountRateType("preferential")

  case object Tracker extends AccountRateType("tracker")

  case object Variable extends AccountRateType("variable")

}
