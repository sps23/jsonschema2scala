package jsonschema2scala.generated.entity

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntityFitchLt(override val entryName: String) extends EnumEntry

object EntityFitchLt extends Enum[EntityFitchLt] {

  val values: IndexedSeq[EntityFitchLt] = findValues

  case object A        extends EntityFitchLt("a")
  case object AMinus   extends EntityFitchLt("a_minus")
  case object APlus    extends EntityFitchLt("a_plus")
  case object Aa       extends EntityFitchLt("aa")
  case object AaMinus  extends EntityFitchLt("aa_minus")
  case object AaPlus   extends EntityFitchLt("aa_plus")
  case object Aaa      extends EntityFitchLt("aaa")
  case object B        extends EntityFitchLt("b")
  case object BMinus   extends EntityFitchLt("b_minus")
  case object BPlus    extends EntityFitchLt("b_plus")
  case object Bb       extends EntityFitchLt("bb")
  case object BbMinus  extends EntityFitchLt("bb_minus")
  case object BbPlus   extends EntityFitchLt("bb_plus")
  case object Bbb      extends EntityFitchLt("bbb")
  case object BbbMinus extends EntityFitchLt("bbb_minus")
  case object BbbPlus  extends EntityFitchLt("bbb_plus")
  case object C        extends EntityFitchLt("c")
  case object Cc       extends EntityFitchLt("cc")
  case object Ccc      extends EntityFitchLt("ccc")
  case object CccMinus extends EntityFitchLt("ccc_minus")
  case object CccPlus  extends EntityFitchLt("ccc_plus")
  case object D        extends EntityFitchLt("d")
}
