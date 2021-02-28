package jsonschema2scala.model.fire
package account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountUkFundingType(override val entryName: String) extends EnumEntry

object AccountUkFundingType extends Enum[AccountUkFundingType] {

  val values: IndexedSeq[AccountUkFundingType] = findValues

  case object A extends AccountUkFundingType("a")

  case object B extends AccountUkFundingType("b")

}
