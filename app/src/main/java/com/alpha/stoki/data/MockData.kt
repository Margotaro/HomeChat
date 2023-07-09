package com.alpha.stoki

import com.alpha.stoki.model.IndiceData

val mockStockGroupCardDataList: List<IndiceData> = listOf(
    IndiceData("I:A1BSC", "Dow Jones Americas Basic Materials Index", "indices", "us", true, "CMEMarketDataPlatformDowJones"),
    IndiceData("I:A2CDE", "S&P 500 Technology Sector Index", "indices", "us", true, "CMEMarketDataPlatformS&P"),
    IndiceData("I:B3FGH", "NASDAQ Biotechnology Index", "indices", "us", true, "CMEMarketDataPlatformNASDAQ")
)