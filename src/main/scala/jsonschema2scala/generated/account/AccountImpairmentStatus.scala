package jsonschema2scala.generated.account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountImpairmentStatus(override val entryName: String) extends EnumEntry

object AccountImpairmentStatus extends Enum[AccountImpairmentStatus] {

  val values: IndexedSeq[AccountImpairmentStatus] = findValues

  case object Doubtful      extends AccountImpairmentStatus("doubtful")
  case object Loss          extends AccountImpairmentStatus("loss")
  case object NonPerforming extends AccountImpairmentStatus("non_performing")
  case object Normal        extends AccountImpairmentStatus("normal")
  case object Performing    extends AccountImpairmentStatus("performing")
  case object Stage1        extends AccountImpairmentStatus("stage_1")
  case object Stage2        extends AccountImpairmentStatus("stage_2")
  case object Stage3        extends AccountImpairmentStatus("stage_3")
  case object Substandard   extends AccountImpairmentStatus("substandard")
  case object Watch         extends AccountImpairmentStatus("watch")
}
