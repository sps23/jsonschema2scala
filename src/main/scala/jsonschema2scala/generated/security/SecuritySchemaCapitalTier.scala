package jsonschema2scala.generated.security

import enumeratum._
import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySchemaCapitalTier(override val entryName: String) extends EnumEntry

object SecuritySchemaCapitalTier extends Enum[SecuritySchemaCapitalTier] {

  val values: IndexedSeq[SecuritySchemaCapitalTier] = findValues

  case object Tier1    extends SecuritySchemaCapitalTier("tier_1")
  case object CeTier1  extends SecuritySchemaCapitalTier("ce_tier_1")
  case object AddTier1 extends SecuritySchemaCapitalTier("add_tier_1")
  case object Tier2    extends SecuritySchemaCapitalTier("tier_2")
  case object AncTier2 extends SecuritySchemaCapitalTier("anc_tier_2")
  case object BasTier2 extends SecuritySchemaCapitalTier("bas_tier_2")
  case object Tier3    extends SecuritySchemaCapitalTier("tier_3")
  case object AncTier3 extends SecuritySchemaCapitalTier("anc_tier_3")
  case object BasTier3 extends SecuritySchemaCapitalTier("bas_tier_3")
}
