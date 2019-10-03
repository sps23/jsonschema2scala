package jsonschema2scala.generated.security

import enumeratum._
import scala.collection.immutable.IndexedSeq

sealed abstract class SecuritySchemaHqlaClass(override val entryName: String) extends EnumEntry

object SecuritySchemaHqlaClass extends Enum[SecuritySchemaHqlaClass] {

  val values: IndexedSeq[SecuritySchemaHqlaClass] = findValues

  case object I          extends SecuritySchemaHqlaClass("i")
  case object Iia        extends SecuritySchemaHqlaClass("iia")
  case object Iib        extends SecuritySchemaHqlaClass("iib")
  case object Ineligible extends SecuritySchemaHqlaClass("ineligible")
  case object Exclude    extends SecuritySchemaHqlaClass("exclude")
}
