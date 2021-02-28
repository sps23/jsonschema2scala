package jsonschema2scala.model.fire
package account

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class AccountGuaranteeScheme(override val entryName: String) extends EnumEntry

object AccountGuaranteeScheme extends Enum[AccountGuaranteeScheme] {

  val values: IndexedSeq[AccountGuaranteeScheme] = findValues

  case object BePf extends AccountGuaranteeScheme("be_pf")

  case object BgDif extends AccountGuaranteeScheme("bg_dif")

  case object CyDps extends AccountGuaranteeScheme("cy_dps")

  case object CzDif extends AccountGuaranteeScheme("cz_dif")

  case object DeEdb extends AccountGuaranteeScheme("de_edb")

  case object DeEdo extends AccountGuaranteeScheme("de_edo")

  case object DeEdw extends AccountGuaranteeScheme("de_edw")

  case object DkGdfi extends AccountGuaranteeScheme("dk_gdfi")

  case object EeDgs extends AccountGuaranteeScheme("ee_dgs")

  case object EsFgd extends AccountGuaranteeScheme("es_fgd")

  case object FiDgf extends AccountGuaranteeScheme("fi_dgf")

  case object FrFdg extends AccountGuaranteeScheme("fr_fdg")

  case object GbFscs extends AccountGuaranteeScheme("gb_fscs")

  case object GrDgs extends AccountGuaranteeScheme("gr_dgs")

  case object HrDi extends AccountGuaranteeScheme("hr_di")

  case object HuNdif extends AccountGuaranteeScheme("hu_ndif")

  case object IeDgs extends AccountGuaranteeScheme("ie_dgs")

  case object ItFitd extends AccountGuaranteeScheme("it_fitd")

  case object LtVi extends AccountGuaranteeScheme("lt_vi")

  case object LuFgdl extends AccountGuaranteeScheme("lu_fgdl")

  case object LvDgf extends AccountGuaranteeScheme("lv_dgf")

  case object MtDcs extends AccountGuaranteeScheme("mt_dcs")

  case object NlDgs extends AccountGuaranteeScheme("nl_dgs")

  case object PlBfg extends AccountGuaranteeScheme("pl_bfg")

  case object PtFgd extends AccountGuaranteeScheme("pt_fgd")

  case object RoFgdb extends AccountGuaranteeScheme("ro_fgdb")

  case object SeNdo extends AccountGuaranteeScheme("se_ndo")

  case object SiDgs extends AccountGuaranteeScheme("si_dgs")

  case object SkDpf extends AccountGuaranteeScheme("sk_dpf")

  case object UsFdic extends AccountGuaranteeScheme("us_fdic")

}
