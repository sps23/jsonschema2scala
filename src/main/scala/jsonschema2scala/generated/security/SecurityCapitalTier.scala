package jsonschema2scala.generated
package security

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class SecurityCapitalTier(override val entryName: String) extends EnumEntry

object SecurityCapitalTier extends Enum[SecurityCapitalTier] {

  val values: IndexedSeq[SecurityCapitalTier] = findValues

  case object AddTier1 extends SecurityCapitalTier("add_tier_1")
  case object AncTier2 extends SecurityCapitalTier("anc_tier_2")
  case object AncTier3 extends SecurityCapitalTier("anc_tier_3")
  case object BasTier2 extends SecurityCapitalTier("bas_tier_2")
  case object BasTier3 extends SecurityCapitalTier("bas_tier_3")
  case object CeTier1  extends SecurityCapitalTier("ce_tier_1")
  case object Tier1    extends SecurityCapitalTier("tier_1")
  case object Tier2    extends SecurityCapitalTier("tier_2")
  case object Tier3    extends SecurityCapitalTier("tier_3")
}
