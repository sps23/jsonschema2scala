package jsonschema2scala.model.fire
package derivative

import enumeratum._

import scala.collection.immutable.IndexedSeq

sealed abstract class DerivativeUnderlyingIndexTenor(override val entryName: String) extends EnumEntry

object DerivativeUnderlyingIndexTenor extends Enum[DerivativeUnderlyingIndexTenor] {

  val values: IndexedSeq[DerivativeUnderlyingIndexTenor] = findValues

  case object `12m` extends DerivativeUnderlyingIndexTenor("12m")

  case object `1d` extends DerivativeUnderlyingIndexTenor("1d")

  case object `1m` extends DerivativeUnderlyingIndexTenor("1m")

  case object `2m` extends DerivativeUnderlyingIndexTenor("2m")

  case object `3m` extends DerivativeUnderlyingIndexTenor("3m")

  case object `4m` extends DerivativeUnderlyingIndexTenor("4m")

  case object `5m` extends DerivativeUnderlyingIndexTenor("5m")

  case object `6m` extends DerivativeUnderlyingIndexTenor("6m")

  case object `7d` extends DerivativeUnderlyingIndexTenor("7d")

  case object `7m` extends DerivativeUnderlyingIndexTenor("7m")

  case object `8m` extends DerivativeUnderlyingIndexTenor("8m")

  case object `9m` extends DerivativeUnderlyingIndexTenor("9m")

}
