package com.alpha.stoki.model

import java.net.URL

interface ITicker {
    val tag: String
    val name: String
    var imageUrl: URL
    var stockPrice: Double
    var earningsPerShare: Double //per what period of time
    var bookValuePerShare: Double
    var sales: Double //per what period of time
    var sectorOfTheEconomy: SectorOfTheEconomy
    val competition: List<ITicker>
    val capitalization: Double
    val debt: Double
    val profit: Double
    val expenses: Double
    val booked: Boolean
}

fun ITicker.getPriceToEarningsRatio(): Double {
    return stockPrice/earningsPerShare
}

fun ITicker.getPriceToBookRatio(): Double {
    return stockPrice/bookValuePerShare
}

fun ITicker.getPriceToSalesRatio(): Double {
    return capitalization/sales
}

enum class SectorOfTheEconomy {
    IT,
    Food,
    Transit,
    Banking,
    AllOther
}

enum class TickerType {
    STOCKS,
    OPTIONS,
    INDICES,
    FOREX,
    CRYPTO
}
