package jsonschema2scala.generated
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityAssetLiability(override val entryName: String) extends EnumEntry

object SecurityAssetLiability extends Enum[SecurityAssetLiability] {

  val values: IndexedSeq[SecurityAssetLiability] = findValues

  case object Asset     extends SecurityAssetLiability("asset")
  case object Liability extends SecurityAssetLiability("liability")
}
