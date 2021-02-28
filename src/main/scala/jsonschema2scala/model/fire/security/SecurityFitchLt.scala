package jsonschema2scala.model.fire
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityFitchLt(override val entryName: String) extends EnumEntry

object SecurityFitchLt extends Enum[SecurityFitchLt] {

  val values: IndexedSeq[SecurityFitchLt] = findValues

  case object A extends SecurityFitchLt("a")

  case object AMinus extends SecurityFitchLt("a_minus")

  case object APlus extends SecurityFitchLt("a_plus")

  case object Aa extends SecurityFitchLt("aa")

  case object AaMinus extends SecurityFitchLt("aa_minus")

  case object AaPlus extends SecurityFitchLt("aa_plus")

  case object Aaa extends SecurityFitchLt("aaa")

  case object B extends SecurityFitchLt("b")

  case object BMinus extends SecurityFitchLt("b_minus")

  case object BPlus extends SecurityFitchLt("b_plus")

  case object Bb extends SecurityFitchLt("bb")

  case object BbMinus extends SecurityFitchLt("bb_minus")

  case object BbPlus extends SecurityFitchLt("bb_plus")

  case object Bbb extends SecurityFitchLt("bbb")

  case object BbbMinus extends SecurityFitchLt("bbb_minus")

  case object BbbPlus extends SecurityFitchLt("bbb_plus")

  case object C extends SecurityFitchLt("c")

  case object Cc extends SecurityFitchLt("cc")

  case object Ccc extends SecurityFitchLt("ccc")

  case object CccMinus extends SecurityFitchLt("ccc_minus")

  case object CccPlus extends SecurityFitchLt("ccc_plus")

  case object D extends SecurityFitchLt("d")

  case object Rd extends SecurityFitchLt("rd")

}
