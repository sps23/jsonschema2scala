package jsonschema2scala.model.fire

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed trait CountryCode extends EnumEntry

object CountryCode extends Enum[CountryCode] {

  val values: IndexedSeq[CountryCode] = findValues

  case object AF extends CountryCode

  case object AX extends CountryCode

  case object AL extends CountryCode

  case object DZ extends CountryCode

  case object AS extends CountryCode

  case object AD extends CountryCode

  case object AO extends CountryCode

  case object AI extends CountryCode

  case object AQ extends CountryCode

  case object AG extends CountryCode

  case object AR extends CountryCode

  case object AM extends CountryCode

  case object AW extends CountryCode

  case object AU extends CountryCode

  case object AT extends CountryCode

  case object AZ extends CountryCode

  case object BS extends CountryCode

  case object BH extends CountryCode

  case object BD extends CountryCode

  case object BB extends CountryCode

  case object BY extends CountryCode

  case object BE extends CountryCode

  case object BZ extends CountryCode

  case object BJ extends CountryCode

  case object BM extends CountryCode

  case object BT extends CountryCode

  case object BO extends CountryCode

  case object BQ extends CountryCode

  case object BA extends CountryCode

  case object BW extends CountryCode

  case object BV extends CountryCode

  case object BR extends CountryCode

  case object IO extends CountryCode

  case object BN extends CountryCode

  case object BG extends CountryCode

  case object BF extends CountryCode

  case object BI extends CountryCode

  case object CV extends CountryCode

  case object KH extends CountryCode

  case object CM extends CountryCode

  case object CA extends CountryCode

  case object KY extends CountryCode

  case object CF extends CountryCode

  case object TD extends CountryCode

  case object CL extends CountryCode

  case object CN extends CountryCode

  case object CX extends CountryCode

  case object CC extends CountryCode

  case object CO extends CountryCode

  case object KM extends CountryCode

  case object CG extends CountryCode

  case object CD extends CountryCode

  case object CK extends CountryCode

  case object CR extends CountryCode

  case object CI extends CountryCode

  case object HR extends CountryCode

  case object CU extends CountryCode

  case object CW extends CountryCode

  case object CY extends CountryCode

  case object CZ extends CountryCode

  case object DK extends CountryCode

  case object DJ extends CountryCode

  case object DM extends CountryCode

  case object DO extends CountryCode

  case object EC extends CountryCode

  case object EG extends CountryCode

  case object SV extends CountryCode

  case object GQ extends CountryCode

  case object ER extends CountryCode

  case object EE extends CountryCode

  case object ET extends CountryCode

  case object FK extends CountryCode

  case object FO extends CountryCode

  case object FJ extends CountryCode

  case object FI extends CountryCode

  case object FR extends CountryCode

  case object GF extends CountryCode

  case object PF extends CountryCode

  case object TF extends CountryCode

  case object GA extends CountryCode

  case object GM extends CountryCode

  case object GE extends CountryCode

  case object DE extends CountryCode

  case object GH extends CountryCode

  case object GI extends CountryCode

  case object GR extends CountryCode

  case object GL extends CountryCode

  case object GD extends CountryCode

  case object GP extends CountryCode

  case object GU extends CountryCode

  case object GT extends CountryCode

  case object GG extends CountryCode

  case object GN extends CountryCode

  case object GW extends CountryCode

  case object GY extends CountryCode

  case object HT extends CountryCode

  case object HM extends CountryCode

  case object VA extends CountryCode

  case object HN extends CountryCode

  case object HK extends CountryCode

  case object HU extends CountryCode

  case object IS extends CountryCode

  case object IN extends CountryCode

  case object ID extends CountryCode

  case object IR extends CountryCode

  case object IQ extends CountryCode

  case object IE extends CountryCode

  case object IM extends CountryCode

  case object IL extends CountryCode

  case object IT extends CountryCode

  case object JM extends CountryCode

  case object JP extends CountryCode

  case object JE extends CountryCode

  case object JO extends CountryCode

  case object KZ extends CountryCode

  case object KE extends CountryCode

  case object KI extends CountryCode

  case object KP extends CountryCode

  case object KR extends CountryCode

  case object KW extends CountryCode

  case object KG extends CountryCode

  case object LA extends CountryCode

  case object LV extends CountryCode

  case object LB extends CountryCode

  case object LS extends CountryCode

  case object LR extends CountryCode

  case object LY extends CountryCode

  case object LI extends CountryCode

  case object LT extends CountryCode

  case object LU extends CountryCode

  case object MO extends CountryCode

  case object MK extends CountryCode

  case object MG extends CountryCode

  case object MW extends CountryCode

  case object MY extends CountryCode

  case object MV extends CountryCode

  case object ML extends CountryCode

  case object MT extends CountryCode

  case object MH extends CountryCode

  case object MQ extends CountryCode

  case object MR extends CountryCode

  case object MU extends CountryCode

  case object YT extends CountryCode

  case object MX extends CountryCode

  case object FM extends CountryCode

  case object MD extends CountryCode

  case object MC extends CountryCode

  case object MN extends CountryCode

  case object ME extends CountryCode

  case object MS extends CountryCode

  case object MA extends CountryCode

  case object MZ extends CountryCode

  case object MM extends CountryCode

  case object NA extends CountryCode

  case object NR extends CountryCode

  case object NP extends CountryCode

  case object NL extends CountryCode

  case object NC extends CountryCode

  case object NZ extends CountryCode

  case object NI extends CountryCode

  case object NE extends CountryCode

  case object NG extends CountryCode

  case object NU extends CountryCode

  case object NF extends CountryCode

  case object MP extends CountryCode

  case object NO extends CountryCode

  case object OM extends CountryCode

  case object PK extends CountryCode

  case object PW extends CountryCode

  case object PS extends CountryCode

  case object PA extends CountryCode

  case object PG extends CountryCode

  case object PY extends CountryCode

  case object PE extends CountryCode

  case object PH extends CountryCode

  case object PN extends CountryCode

  case object PL extends CountryCode

  case object PT extends CountryCode

  case object PR extends CountryCode

  case object QA extends CountryCode

  case object RE extends CountryCode

  case object RO extends CountryCode

  case object RU extends CountryCode

  case object RW extends CountryCode

  case object BL extends CountryCode

  case object SH extends CountryCode

  case object KN extends CountryCode

  case object LC extends CountryCode

  case object MF extends CountryCode

  case object PM extends CountryCode

  case object VC extends CountryCode

  case object WS extends CountryCode

  case object SM extends CountryCode

  case object ST extends CountryCode

  case object SA extends CountryCode

  case object SN extends CountryCode

  case object RS extends CountryCode

  case object SC extends CountryCode

  case object SL extends CountryCode

  case object SG extends CountryCode

  case object SX extends CountryCode

  case object SK extends CountryCode

  case object SI extends CountryCode

  case object SB extends CountryCode

  case object SO extends CountryCode

  case object ZA extends CountryCode

  case object GS extends CountryCode

  case object SS extends CountryCode

  case object ES extends CountryCode

  case object LK extends CountryCode

  case object SD extends CountryCode

  case object SR extends CountryCode

  case object SJ extends CountryCode

  case object SZ extends CountryCode

  case object SE extends CountryCode

  case object CH extends CountryCode

  case object SY extends CountryCode

  case object TW extends CountryCode

  case object TJ extends CountryCode

  case object TZ extends CountryCode

  case object TH extends CountryCode

  case object TL extends CountryCode

  case object TG extends CountryCode

  case object TK extends CountryCode

  case object TO extends CountryCode

  case object TT extends CountryCode

  case object TN extends CountryCode

  case object TR extends CountryCode

  case object TM extends CountryCode

  case object TC extends CountryCode

  case object TV extends CountryCode

  case object UG extends CountryCode

  case object UA extends CountryCode

  case object AE extends CountryCode

  case object GB extends CountryCode

  case object US extends CountryCode

  case object UM extends CountryCode

  case object UY extends CountryCode

  case object UZ extends CountryCode

  case object VU extends CountryCode

  case object VE extends CountryCode

  case object VN extends CountryCode

  case object VG extends CountryCode

  case object VI extends CountryCode

  case object WF extends CountryCode

  case object EH extends CountryCode

  case object YE extends CountryCode

  case object ZM extends CountryCode

  case object ZW extends CountryCode

  case object AA extends CountryCode

  case object QM extends CountryCode

  case object QN extends CountryCode

  case object QO extends CountryCode

  case object QP extends CountryCode

  case object QQ extends CountryCode

  case object QR extends CountryCode

  case object QS extends CountryCode

  case object QT extends CountryCode

  case object QU extends CountryCode

  case object QV extends CountryCode

  case object QW extends CountryCode

  case object QX extends CountryCode

  case object QY extends CountryCode

  case object QZ extends CountryCode

  case object XA extends CountryCode

  case object XB extends CountryCode

  case object XC extends CountryCode

  case object XD extends CountryCode

  case object XE extends CountryCode

  case object XF extends CountryCode

  case object XG extends CountryCode

  case object XH extends CountryCode

  case object XI extends CountryCode

  case object XJ extends CountryCode

  case object XK extends CountryCode

  case object XL extends CountryCode

  case object XM extends CountryCode

  case object XN extends CountryCode

  case object XO extends CountryCode

  case object XP extends CountryCode

  case object XQ extends CountryCode

  case object XR extends CountryCode

  case object XS extends CountryCode

  case object XT extends CountryCode

  case object XU extends CountryCode

  case object XV extends CountryCode

  case object XW extends CountryCode

  case object XX extends CountryCode

  case object XY extends CountryCode

  case object XZ extends CountryCode

  case object ZZ extends CountryCode

}
