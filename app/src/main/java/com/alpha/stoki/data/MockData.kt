package com.alpha.stoki

import com.alpha.stoki.model.Company
import com.alpha.stoki.model.Stock
import com.alpha.stoki.model.StockGroupData

val mockStockGroupCardDataList: List<StockGroupData> = listOf(
    StockGroupData(
        symbol = "GROUP1",
        name = "Technology Stocks",
        group = listOf(
            Stock(
                symbol = "AAPL",
                company = Company("Apple Inc."),
                price = 1350.25
            ),
            Stock(
                symbol = "GOOGL",
                company = Company("Alphabet Inc."),
                price = 2500.75
            ),
            Stock(
                symbol = "MSFT",
                company = Company("Microsoft Corporation"),
                price = 305.50
            )
        )
    ),
    StockGroupData(
        symbol = "GROUP2",
        name = "Financial Stocks",
        group = listOf(
            Stock(
                symbol = "JPM",
                company = Company("JPMorgan Chase & Co."),
                price = 160.80
            ),
            Stock(
                symbol = "BAC",
                company = Company("Bank of America Corporation"),
                price = 40.50
            ),
            Stock(
                symbol = "WFC",
                company = Company("Wells Fargo & Company"),
                price = 55.20
            )
        )
    ),
    // Add more elements here if needed
)