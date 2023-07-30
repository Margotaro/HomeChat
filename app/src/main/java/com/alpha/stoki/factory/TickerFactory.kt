package com.alpha.stoki.factory

import com.alpha.stoki.model.ITicker
import com.alpha.stoki.model.SectorOfTheEconomy
import com.alpha.stoki.model.Stock
import com.alpha.stoki.network.gson_objects.PolygonDetailedTickerData
import com.alpha.stoki.network.gson_objects.PolygonTickerType
import java.lang.Exception
import java.net.URL

class TickerFactory {

    fun toITicker(polygonTickerData: PolygonDetailedTickerData): ITicker {
        if(polygonTickerData.market == PolygonTickerType.STOCKS.marketTag)
            return toStock(polygonTickerData)
        else
            throw Exception()
    }

    private fun toStock(polygonTickerData: PolygonDetailedTickerData): Stock {
        return Stock(
            tag = polygonTickerData.ticker,
            name = polygonTickerData.name,
            imageUrl = URL(polygonTickerData.branding.logo_url),
            capitalization = polygonTickerData.market_cap.toDouble(),
            //TODO: A mock data, needs to be redone asap
            stockPrice = 0.0,
            earningsPerShare = 0.0,
            bookValuePerShare = 0.0,
            sales = 0.0,
            sectorOfTheEconomy = SectorOfTheEconomy.IT,
            competition = listOf(),
            debt = 0.0,
            profit = 0.0,
            expenses = 0.0,
            booked = true
        )
    }
}