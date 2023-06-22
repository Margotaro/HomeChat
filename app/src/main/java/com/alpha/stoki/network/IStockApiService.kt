package com.alpha.stoki.network

import com.alpha.stoki.network.gson_objects.TickerResponse
import retrofit2.http.GET

interface IStockApiService {
    @GET("/v3/reference/indices")
    suspend fun getIndiceRating(): List<TickerResponse>
}