package com.alpha.stoki.network

import com.alpha.stoki.network.gson_objects.TickerResponse
import retrofit2.http.Query

class TickerRepository: IStockApiService {
    override suspend fun getAllTickers(
        @Query(value = "apiKey") apiKey: String,
        @Query(value = "market") market: String
    ): TickerResponse {
        return RestAPI.apiService.getAllTickers(apiKey, market)
    }

}

