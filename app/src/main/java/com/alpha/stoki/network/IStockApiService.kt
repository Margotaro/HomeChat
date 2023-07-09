package com.alpha.stoki.network

import com.alpha.stoki.network.gson_objects.IndiceResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface IStockApiService {
    @GET("/v3/reference/tickers")
    suspend fun getAllTickers(@Query("apiKey") apiKey: String, @Query("market") market: String): IndiceResponse
}