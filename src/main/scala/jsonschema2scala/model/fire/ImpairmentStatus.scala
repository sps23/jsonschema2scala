package jsonschema2scala.model.fire

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class ImpairmentStatus(override val entryName: String) extends EnumEntry

object ImpairmentStatus extends Enum[ImpairmentStatus] {

  val values: IndexedSeq[ImpairmentStatus] = findValues

  case object Performing extends ImpairmentStatus("performing")

  case object Stage1 extends ImpairmentStatus("stage_1")

  case object Normal extends ImpairmentStatus("normal")

  case object Watch extends ImpairmentStatus("watch")

  case object Stage2 extends ImpairmentStatus("stage_2")

  case object Substandard extends ImpairmentStatus("substandard")

  case object NonPerforming extends ImpairmentStatus("non_performing")

  case object Stage3 extends ImpairmentStatus("stage_3")

  case object Doubtful extends ImpairmentStatus("doubtful")

  case object Loss extends ImpairmentStatus("loss")

  case object Stage1Normal extends ImpairmentStatus("stage_1_normal")

  case object Stage1Watch extends ImpairmentStatus("stage_1_watch")

  case object Stage1Substandard extends ImpairmentStatus("stage_1_substandard")

  case object Stage1Doubtful extends ImpairmentStatus("stage_1_doubtful")

  case object Stage1Loss extends ImpairmentStatus("stage_1_loss")

  case object Stage2Normal extends ImpairmentStatus("stage_2_normal")

  case object Stage2Watch extends ImpairmentStatus("stage_2_watch")

  case object Stage2Substandard extends ImpairmentStatus("stage_2_substandard")

  case object Stage2Doubtful extends ImpairmentStatus("stage_2_doubtful")

  case object Stage2Loss extends ImpairmentStatus("stage_2_loss")

  case object Stage3Normal extends ImpairmentStatus("stage_3_normal")

  case object Stage3Watch extends ImpairmentStatus("stage_3_watch")

  case object Stage3Substandard extends ImpairmentStatus("stage_3_substandard")

  case object Stage3Doubtful extends ImpairmentStatus("stage_3_doubtful")

  case object Stage3Loss extends ImpairmentStatus("stage_3_loss")

}
