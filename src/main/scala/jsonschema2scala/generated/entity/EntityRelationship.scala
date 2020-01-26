package jsonschema2scala.generated.entity

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntityRelationship(override val entryName: String) extends EnumEntry

object EntityRelationship extends Enum[EntityRelationship] {

  val values: IndexedSeq[EntityRelationship] = findValues

  case object Branch     extends EntityRelationship("branch")
  case object Jv         extends EntityRelationship("jv")
  case object Parent     extends EntityRelationship("parent")
  case object Subsidiary extends EntityRelationship("subsidiary")
}
