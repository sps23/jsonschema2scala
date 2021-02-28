package jsonschema2scala.model.fire
package entity

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class EntityRelationship(override val entryName: String) extends EnumEntry

object EntityRelationship extends Enum[EntityRelationship] {

  val values: IndexedSeq[EntityRelationship] = findValues

  case object Branch extends EntityRelationship("branch")

  case object HeadOffice extends EntityRelationship("head_office")

  case object Jv extends EntityRelationship("jv")

  case object Parent extends EntityRelationship("parent")

  case object ParentBranch extends EntityRelationship("parent_branch")

  case object ParentSubsidiary extends EntityRelationship("parent_subsidiary")

  case object Subsidiary extends EntityRelationship("subsidiary")

}
