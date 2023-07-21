package com.alpha.stoki.model

data class Stock(
    val symbol: String,
    val company: Company,
    var price: Double
)

