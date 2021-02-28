package jsonschema2scala.model.fire

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AssetClass(override val entryName: String) extends EnumEntry

object AssetClass extends Enum[AssetClass] {

  val values: IndexedSeq[AssetClass] = findValues

  case object Co extends AssetClass("co")

  case object Energy extends AssetClass("energy")

  case object Coal extends AssetClass("coal")

  case object Electricity extends AssetClass("electricity")

  case object Gas extends AssetClass("gas")

  case object Oil extends AssetClass("oil")

  case object Metals extends AssetClass("metals")

  case object PreciousMetals extends AssetClass("precious_metals")

  case object Gold extends AssetClass("gold")

  case object Palladium extends AssetClass("palladium")

  case object Platinum extends AssetClass("platinum")

  case object Silver extends AssetClass("silver")

  case object Agri extends AssetClass("agri")

  case object Coffee extends AssetClass("coffee")

  case object Corn extends AssetClass("corn")

  case object Sugar extends AssetClass("sugar")

  case object CoOther extends AssetClass("co_other")

  case object Cr extends AssetClass("cr")

  case object CrIndex extends AssetClass("cr_index")

  case object CrSingle extends AssetClass("cr_single")

  case object Eq extends AssetClass("eq")

  case object EqIndex extends AssetClass("eq_index")

  case object EqSingle extends AssetClass("eq_single")

  case object Fx extends AssetClass("fx")

  case object Ir extends AssetClass("ir")

  case object Inflation extends AssetClass("inflation")

  case object Other extends AssetClass("other")

}
