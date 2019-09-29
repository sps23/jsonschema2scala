package jsonschema2scala.generated

import java.time.LocalDateTime

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed trait CustomerSchemaStatus extends EnumEntry

object CustomerSchemaStatus extends Enum[CustomerSchemaStatus] {

  val values: IndexedSeq[CustomerSchemaStatus] = findValues

  case object Established extends CustomerSchemaStatus
}

case class CustomerSchema(
    productCount: Integer,
    startDate: LocalDateTime,
    status: CustomerSchemaStatus
)
