package jsonschema2scala.generated.collateral

import java.time.LocalDateTime

import jsonschema2scala.generated.{CurrencyCode, RegulatoryBook}

case class Collateral(
    id: String,
    date: LocalDateTime,
    loanIds: Option[List[String]],
    accountIds: Option[List[String]],
    charge: Option[Int],
    currencyCode: Option[CurrencyCode],
    encumbranceAmount: Option[Int],
    encumbranceType: Option[CollateralEncumbranceType],
    endDate: Option[LocalDateTime],
    regulatoryBook: Option[RegulatoryBook],
    source: Option[String],
    startDate: Option[LocalDateTime],
    `type`: Option[CollateralType],
    value: Int,
    valueDate: Option[LocalDateTime],
    versionId: Option[String],
    volAdj: Option[BigDecimal],
    volAdjFx: Option[BigDecimal]
)
