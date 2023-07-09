package com.alpha.stoki.model

data class IndiceData(
    val ticker: String,
    val name: String,
    val market: String,
    val locale: String,
    val active: Boolean,
    val sourceFeed: String
)

data class Stock(
    val symbol: String,
    val company: Company,
    var price: Double
)

data class Company(
    val name: String
)