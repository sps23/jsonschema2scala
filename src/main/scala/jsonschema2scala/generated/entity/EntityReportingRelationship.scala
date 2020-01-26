package jsonschema2scala.generated.entity

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntityReportingRelationship(override val entryName: String) extends EnumEntry

object EntityReportingRelationship extends Enum[EntityReportingRelationship] {

  val values: IndexedSeq[EntityReportingRelationship] = findValues

  case object Branch     extends EntityReportingRelationship("branch")
  case object Jv         extends EntityReportingRelationship("jv")
  case object Parent     extends EntityReportingRelationship("parent")
  case object Subsidiary extends EntityReportingRelationship("subsidiary")
}
