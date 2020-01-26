package jsonschema2scala.generated.security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityImpairmentStatus(override val entryName: String) extends EnumEntry

object SecurityImpairmentStatus extends Enum[SecurityImpairmentStatus] {

  val values: IndexedSeq[SecurityImpairmentStatus] = findValues

  case object Doubtful      extends SecurityImpairmentStatus("doubtful")
  case object Loss          extends SecurityImpairmentStatus("loss")
  case object NonPerforming extends SecurityImpairmentStatus("non_performing")
  case object Normal        extends SecurityImpairmentStatus("normal")
  case object Performing    extends SecurityImpairmentStatus("performing")
  case object Stage1        extends SecurityImpairmentStatus("stage_1")
  case object Stage2        extends SecurityImpairmentStatus("stage_2")
  case object Stage3        extends SecurityImpairmentStatus("stage_3")
  case object Substandard   extends SecurityImpairmentStatus("substandard")
  case object Watch         extends SecurityImpairmentStatus("watch")
}
