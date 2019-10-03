package jsonschema2scala.generated.security

import enumeratum._
import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySchemaImpairmentStatus(override val entryName: String) extends EnumEntry

object SecuritySchemaImpairmentStatus extends Enum[SecuritySchemaImpairmentStatus] {

  val values: IndexedSeq[SecuritySchemaImpairmentStatus] = findValues

  case object Stage1 extends SecuritySchemaImpairmentStatus("stage_1")
  case object Stage2 extends SecuritySchemaImpairmentStatus("stage_2")
  case object Stage3 extends SecuritySchemaImpairmentStatus("stage_3")
}
