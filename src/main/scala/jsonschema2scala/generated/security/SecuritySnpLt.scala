package jsonschema2scala.generated.security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySnpLt(override val entryName: String) extends EnumEntry

object SecuritySnpLt extends Enum[SecuritySnpLt] {

  val values: IndexedSeq[SecuritySnpLt] = findValues

  case object A        extends SecuritySnpLt("a")
  case object AMinus   extends SecuritySnpLt("a_minus")
  case object APlus    extends SecuritySnpLt("a_plus")
  case object Aa       extends SecuritySnpLt("aa")
  case object AaMinus  extends SecuritySnpLt("aa_minus")
  case object AaPlus   extends SecuritySnpLt("aa_plus")
  case object Aaa      extends SecuritySnpLt("aaa")
  case object B        extends SecuritySnpLt("b")
  case object BMinus   extends SecuritySnpLt("b_minus")
  case object BPlus    extends SecuritySnpLt("b_plus")
  case object Bb       extends SecuritySnpLt("bb")
  case object BbMinus  extends SecuritySnpLt("bb_minus")
  case object BbPlus   extends SecuritySnpLt("bb_plus")
  case object Bbb      extends SecuritySnpLt("bbb")
  case object BbbMinus extends SecuritySnpLt("bbb_minus")
  case object BbbPlus  extends SecuritySnpLt("bbb_plus")
  case object C        extends SecuritySnpLt("c")
  case object Cc       extends SecuritySnpLt("cc")
  case object Ccc      extends SecuritySnpLt("ccc")
  case object CccMinus extends SecuritySnpLt("ccc_minus")
  case object CccPlus  extends SecuritySnpLt("ccc_plus")
  case object D        extends SecuritySnpLt("d")
}
