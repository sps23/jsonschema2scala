package jsonschema2scala.generated.entity

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntitySnpLt(override val entryName: String) extends EnumEntry

object EntitySnpLt extends Enum[EntitySnpLt] {

  val values: IndexedSeq[EntitySnpLt] = findValues

  case object A        extends EntitySnpLt("a")
  case object AMinus   extends EntitySnpLt("a_minus")
  case object APlus    extends EntitySnpLt("a_plus")
  case object Aa       extends EntitySnpLt("aa")
  case object AaMinus  extends EntitySnpLt("aa_minus")
  case object AaPlus   extends EntitySnpLt("aa_plus")
  case object Aaa      extends EntitySnpLt("aaa")
  case object B        extends EntitySnpLt("b")
  case object BMinus   extends EntitySnpLt("b_minus")
  case object BPlus    extends EntitySnpLt("b_plus")
  case object Bb       extends EntitySnpLt("bb")
  case object BbMinus  extends EntitySnpLt("bb_minus")
  case object BbPlus   extends EntitySnpLt("bb_plus")
  case object Bbb      extends EntitySnpLt("bbb")
  case object BbbMinus extends EntitySnpLt("bbb_minus")
  case object BbbPlus  extends EntitySnpLt("bbb_plus")
  case object C        extends EntitySnpLt("c")
  case object Cc       extends EntitySnpLt("cc")
  case object Ccc      extends EntitySnpLt("ccc")
  case object CccMinus extends EntitySnpLt("ccc_minus")
  case object CccPlus  extends EntitySnpLt("ccc_plus")
  case object D        extends EntitySnpLt("d")
}
