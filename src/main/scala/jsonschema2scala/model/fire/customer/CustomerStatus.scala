package jsonschema2scala.model.fire
package customer

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class CustomerStatus(override val entryName: String) extends EnumEntry

object CustomerStatus extends Enum[CustomerStatus] {

  val values: IndexedSeq[CustomerStatus] = findValues

  case object Established extends CustomerStatus("established")

}
