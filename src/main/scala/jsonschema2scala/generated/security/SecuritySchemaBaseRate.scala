package jsonschema2scala.generated.security

import enumeratum._
import scala.collection.immutable.IndexedSeq

sealed trait SecuritySchemaBaseRate extends EnumEntry

object SecuritySchemaBaseRate extends Enum[SecuritySchemaBaseRate] {

  val values: IndexedSeq[SecuritySchemaBaseRate] = findValues

  case object ZERO     extends SecuritySchemaBaseRate
  case object UKBRBASE extends SecuritySchemaBaseRate
  case object FDTR     extends SecuritySchemaBaseRate
}
