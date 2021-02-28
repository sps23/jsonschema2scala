package jsonschema2scala.model.fire
package curve

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class CurveValueReference(override val entryName: String) extends EnumEntry

object CurveValueReference extends Enum[CurveValueReference] {

  val values: IndexedSeq[CurveValueReference] = findValues

  case object `10d` extends CurveValueReference("10d")

  case object `11d` extends CurveValueReference("11d")

  case object `12d` extends CurveValueReference("12d")

  case object `12m` extends CurveValueReference("12m")

  case object `13d` extends CurveValueReference("13d")

  case object `14d` extends CurveValueReference("14d")

  case object `15d` extends CurveValueReference("15d")

  case object `16d` extends CurveValueReference("16d")

  case object `17d` extends CurveValueReference("17d")

  case object `18d` extends CurveValueReference("18d")

  case object `19d` extends CurveValueReference("19d")

  case object `1d` extends CurveValueReference("1d")

  case object `1m` extends CurveValueReference("1m")

  case object `20d` extends CurveValueReference("20d")

  case object `21d` extends CurveValueReference("21d")

  case object `22d` extends CurveValueReference("22d")

  case object `23d` extends CurveValueReference("23d")

  case object `24d` extends CurveValueReference("24d")

  case object `24m` extends CurveValueReference("24m")

  case object `25d` extends CurveValueReference("25d")

  case object `26d` extends CurveValueReference("26d")

  case object `27d` extends CurveValueReference("27d")

  case object `28d` extends CurveValueReference("28d")

  case object `29d` extends CurveValueReference("29d")

  case object `2d` extends CurveValueReference("2d")

  case object `2m` extends CurveValueReference("2m")

  case object `30d` extends CurveValueReference("30d")

  case object `31d` extends CurveValueReference("31d")

  case object `32d` extends CurveValueReference("32d")

  case object `33d` extends CurveValueReference("33d")

  case object `34d` extends CurveValueReference("34d")

  case object `35d` extends CurveValueReference("35d")

  case object `36d` extends CurveValueReference("36d")

  case object `36m` extends CurveValueReference("36m")

  case object `37d` extends CurveValueReference("37d")

  case object `38d` extends CurveValueReference("38d")

  case object `39d` extends CurveValueReference("39d")

  case object `3d` extends CurveValueReference("3d")

  case object `3m` extends CurveValueReference("3m")

  case object `40d` extends CurveValueReference("40d")

  case object `41d` extends CurveValueReference("41d")

  case object `42d` extends CurveValueReference("42d")

  case object `43d` extends CurveValueReference("43d")

  case object `44d` extends CurveValueReference("44d")

  case object `45d` extends CurveValueReference("45d")

  case object `46d` extends CurveValueReference("46d")

  case object `47d` extends CurveValueReference("47d")

  case object `48d` extends CurveValueReference("48d")

  case object `49d` extends CurveValueReference("49d")

  case object `4d` extends CurveValueReference("4d")

  case object `4m` extends CurveValueReference("4m")

  case object `50d` extends CurveValueReference("50d")

  case object `51d` extends CurveValueReference("51d")

  case object `52d` extends CurveValueReference("52d")

  case object `53d` extends CurveValueReference("53d")

  case object `54d` extends CurveValueReference("54d")

  case object `55d` extends CurveValueReference("55d")

  case object `56d` extends CurveValueReference("56d")

  case object `57d` extends CurveValueReference("57d")

  case object `58d` extends CurveValueReference("58d")

  case object `59d` extends CurveValueReference("59d")

  case object `5d` extends CurveValueReference("5d")

  case object `5m` extends CurveValueReference("5m")

  case object `60d` extends CurveValueReference("60d")

  case object `60m` extends CurveValueReference("60m")

  case object `61d` extends CurveValueReference("61d")

  case object `62d` extends CurveValueReference("62d")

  case object `63d` extends CurveValueReference("63d")

  case object `64d` extends CurveValueReference("64d")

  case object `65d` extends CurveValueReference("65d")

  case object `66d` extends CurveValueReference("66d")

  case object `67d` extends CurveValueReference("67d")

  case object `68d` extends CurveValueReference("68d")

  case object `69d` extends CurveValueReference("69d")

  case object `6d` extends CurveValueReference("6d")

  case object `6m` extends CurveValueReference("6m")

  case object `70d` extends CurveValueReference("70d")

  case object `71d` extends CurveValueReference("71d")

  case object `72d` extends CurveValueReference("72d")

  case object `73d` extends CurveValueReference("73d")

  case object `74d` extends CurveValueReference("74d")

  case object `75d` extends CurveValueReference("75d")

  case object `76d` extends CurveValueReference("76d")

  case object `77d` extends CurveValueReference("77d")

  case object `78d` extends CurveValueReference("78d")

  case object `79d` extends CurveValueReference("79d")

  case object `7d` extends CurveValueReference("7d")

  case object `80d` extends CurveValueReference("80d")

  case object `81d` extends CurveValueReference("81d")

  case object `82d` extends CurveValueReference("82d")

  case object `83d` extends CurveValueReference("83d")

  case object `84d` extends CurveValueReference("84d")

  case object `85d` extends CurveValueReference("85d")

  case object `86d` extends CurveValueReference("86d")

  case object `87d` extends CurveValueReference("87d")

  case object `88d` extends CurveValueReference("88d")

  case object `89d` extends CurveValueReference("89d")

  case object `8d` extends CurveValueReference("8d")

  case object `90d` extends CurveValueReference("90d")

  case object `91d` extends CurveValueReference("91d")

  case object `92d` extends CurveValueReference("92d")

  case object `9d` extends CurveValueReference("9d")

  case object `9m` extends CurveValueReference("9m")

  case object InitialStock extends CurveValueReference("initial_stock")

  case object ON extends CurveValueReference("o_n")

  case object OpenMaturity extends CurveValueReference("open_maturity")

}
