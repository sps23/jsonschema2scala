package jsonschema2scala.model.fire
package customer

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class CustomerClearingThreshold(override val entryName: String) extends EnumEntry

object CustomerClearingThreshold extends Enum[CustomerClearingThreshold] {

  val values: IndexedSeq[CustomerClearingThreshold] = findValues

  case object Above extends CustomerClearingThreshold("above")

  case object Below extends CustomerClearingThreshold("below")

}
