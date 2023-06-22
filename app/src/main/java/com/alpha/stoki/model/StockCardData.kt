package com.alpha.stoki.model

data class StockGroupData(
    val symbol: String,
    val name: String,
    val group: List<Stock>
)

data class Stock(
    val symbol: String,
    val company: Company,
    var price: Double
)

data class Company(
    val name: String
)