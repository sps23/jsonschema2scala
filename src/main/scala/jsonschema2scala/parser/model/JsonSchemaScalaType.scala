package jsonschema2scala.parser.model

import enumeratum.{Enum, EnumEntry}

import scala.collection.immutable.IndexedSeq

sealed abstract class JsonSchemaScalaType(override val entryName: String) extends EnumEntry

object AccountingTreatment extends Enum[JsonSchemaScalaType] {

  val values: IndexedSeq[JsonSchemaScalaType] = findValues

  case object CaseClass extends JsonSchemaScalaType("case_class")
  case object Trait     extends JsonSchemaScalaType("trait")
}
