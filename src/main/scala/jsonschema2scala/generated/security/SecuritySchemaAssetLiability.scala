package jsonschema2scala.generated.security

import enumeratum._
import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySchemaAssetLiability(override val entryName: String) extends EnumEntry

object SecuritySchemaAssetLiability extends Enum[SecuritySchemaAssetLiability] {

  val values: IndexedSeq[SecuritySchemaAssetLiability] = findValues

  case object Asset     extends SecuritySchemaAssetLiability("asset")
  case object Liability extends SecuritySchemaAssetLiability("liability")
}
