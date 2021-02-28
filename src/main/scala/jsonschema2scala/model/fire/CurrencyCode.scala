package jsonschema2scala.model.fire

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed trait CurrencyCode extends EnumEntry

object CurrencyCode extends Enum[CurrencyCode] {

  val values: IndexedSeq[CurrencyCode] = findValues

  case object AED extends CurrencyCode

  case object AFN extends CurrencyCode

  case object ALL extends CurrencyCode

  case object AMD extends CurrencyCode

  case object ANG extends CurrencyCode

  case object AOA extends CurrencyCode

  case object ARS extends CurrencyCode

  case object AUD extends CurrencyCode

  case object AWG extends CurrencyCode

  case object AZN extends CurrencyCode

  case object BAM extends CurrencyCode

  case object BBD extends CurrencyCode

  case object BDT extends CurrencyCode

  case object BGN extends CurrencyCode

  case object BHD extends CurrencyCode

  case object BIF extends CurrencyCode

  case object BMD extends CurrencyCode

  case object BND extends CurrencyCode

  case object BOB extends CurrencyCode

  case object BOV extends CurrencyCode

  case object BRL extends CurrencyCode

  case object BSD extends CurrencyCode

  case object BTN extends CurrencyCode

  case object BWP extends CurrencyCode

  case object BYN extends CurrencyCode

  case object BZD extends CurrencyCode

  case object CAD extends CurrencyCode

  case object CDF extends CurrencyCode

  case object CHE extends CurrencyCode

  case object CHF extends CurrencyCode

  case object CHW extends CurrencyCode

  case object CLF extends CurrencyCode

  case object CLP extends CurrencyCode

  case object CNY extends CurrencyCode

  case object COP extends CurrencyCode

  case object COU extends CurrencyCode

  case object CRC extends CurrencyCode

  case object CUC extends CurrencyCode

  case object CUP extends CurrencyCode

  case object CVE extends CurrencyCode

  case object CZK extends CurrencyCode

  case object DJF extends CurrencyCode

  case object DKK extends CurrencyCode

  case object DOP extends CurrencyCode

  case object DZD extends CurrencyCode

  case object EGP extends CurrencyCode

  case object ERN extends CurrencyCode

  case object ETB extends CurrencyCode

  case object EUR extends CurrencyCode

  case object FJD extends CurrencyCode

  case object FKP extends CurrencyCode

  case object GBP extends CurrencyCode

  case object GEL extends CurrencyCode

  case object GHS extends CurrencyCode

  case object GIP extends CurrencyCode

  case object GMD extends CurrencyCode

  case object GNF extends CurrencyCode

  case object GTQ extends CurrencyCode

  case object GYD extends CurrencyCode

  case object HKD extends CurrencyCode

  case object HNL extends CurrencyCode

  case object HRK extends CurrencyCode

  case object HTG extends CurrencyCode

  case object HUF extends CurrencyCode

  case object IDR extends CurrencyCode

  case object ILS extends CurrencyCode

  case object INR extends CurrencyCode

  case object IQD extends CurrencyCode

  case object IRR extends CurrencyCode

  case object ISK extends CurrencyCode

  case object JMD extends CurrencyCode

  case object JOD extends CurrencyCode

  case object JPY extends CurrencyCode

  case object KES extends CurrencyCode

  case object KGS extends CurrencyCode

  case object KHR extends CurrencyCode

  case object KMF extends CurrencyCode

  case object KPW extends CurrencyCode

  case object KRW extends CurrencyCode

  case object KWD extends CurrencyCode

  case object KYD extends CurrencyCode

  case object KZT extends CurrencyCode

  case object LAK extends CurrencyCode

  case object LBP extends CurrencyCode

  case object LKR extends CurrencyCode

  case object LRD extends CurrencyCode

  case object LSL extends CurrencyCode

  case object LYD extends CurrencyCode

  case object MAD extends CurrencyCode

  case object MDL extends CurrencyCode

  case object MGA extends CurrencyCode

  case object MKD extends CurrencyCode

  case object MMK extends CurrencyCode

  case object MNT extends CurrencyCode

  case object MOP extends CurrencyCode

  case object MRU extends CurrencyCode

  case object MUR extends CurrencyCode

  case object MVR extends CurrencyCode

  case object MWK extends CurrencyCode

  case object MXN extends CurrencyCode

  case object MXV extends CurrencyCode

  case object MYR extends CurrencyCode

  case object MZN extends CurrencyCode

  case object NAD extends CurrencyCode

  case object NGN extends CurrencyCode

  case object NIO extends CurrencyCode

  case object NOK extends CurrencyCode

  case object NPR extends CurrencyCode

  case object NZD extends CurrencyCode

  case object OMR extends CurrencyCode

  case object PAB extends CurrencyCode

  case object PEN extends CurrencyCode

  case object PGK extends CurrencyCode

  case object PHP extends CurrencyCode

  case object PKR extends CurrencyCode

  case object PLN extends CurrencyCode

  case object PYG extends CurrencyCode

  case object QAR extends CurrencyCode

  case object RON extends CurrencyCode

  case object RSD extends CurrencyCode

  case object RUB extends CurrencyCode

  case object RWF extends CurrencyCode

  case object SAR extends CurrencyCode

  case object SBD extends CurrencyCode

  case object SCR extends CurrencyCode

  case object SDG extends CurrencyCode

  case object SEK extends CurrencyCode

  case object SGD extends CurrencyCode

  case object SHP extends CurrencyCode

  case object SLL extends CurrencyCode

  case object SOS extends CurrencyCode

  case object SRD extends CurrencyCode

  case object SSP extends CurrencyCode

  case object STN extends CurrencyCode

  case object SYP extends CurrencyCode

  case object SZL extends CurrencyCode

  case object THB extends CurrencyCode

  case object TJS extends CurrencyCode

  case object TMT extends CurrencyCode

  case object TND extends CurrencyCode

  case object TOP extends CurrencyCode

  case object TRY extends CurrencyCode

  case object TTD extends CurrencyCode

  case object TWD extends CurrencyCode

  case object TZS extends CurrencyCode

  case object UAH extends CurrencyCode

  case object UGX extends CurrencyCode

  case object USD extends CurrencyCode

  case object USN extends CurrencyCode

  case object USS extends CurrencyCode

  case object UYI extends CurrencyCode

  case object UYU extends CurrencyCode

  case object UYW extends CurrencyCode

  case object UZS extends CurrencyCode

  case object VES extends CurrencyCode

  case object VND extends CurrencyCode

  case object VUV extends CurrencyCode

  case object WST extends CurrencyCode

  case object XAF extends CurrencyCode

  case object XAG extends CurrencyCode

  case object XAU extends CurrencyCode

  case object XBA extends CurrencyCode

  case object XBB extends CurrencyCode

  case object XBC extends CurrencyCode

  case object XBD extends CurrencyCode

  case object XCD extends CurrencyCode

  case object XDR extends CurrencyCode

  case object XOF extends CurrencyCode

  case object XPD extends CurrencyCode

  case object XPF extends CurrencyCode

  case object XPT extends CurrencyCode

  case object XSU extends CurrencyCode

  case object XTS extends CurrencyCode

  case object XUA extends CurrencyCode

  case object XXX extends CurrencyCode

  case object YER extends CurrencyCode

  case object ZAR extends CurrencyCode

  case object ZMW extends CurrencyCode

  case object CNH extends CurrencyCode

}
