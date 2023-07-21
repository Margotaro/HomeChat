package com.alpha.stoki

import com.alpha.stoki.network.PolygonIndexData

val mockStockGroupCardDataList: List<PolygonIndexData> = listOf(
    PolygonIndexData("I:A1BSC", "Dow Jones Americas Basic Materials Index", "indices", "us", true, "CMEMarketDataPlatformDowJones"),
    PolygonIndexData("I:A2CDE", "S&P 500 Technology Sector Index", "indices", "us", true, "CMEMarketDataPlatformS&P"),
    PolygonIndexData("I:B3FGH", "NASDAQ Biotechnology Index", "indices", "us", true, "CMEMarketDataPlatformNASDAQ")
)