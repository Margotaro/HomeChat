package com.alpha.stoki.network

import com.alpha.stoki.model.IndiceData
import com.alpha.stoki.network.gson_objects.IndiceResponse
import retrofit2.http.Query

class IndicesRepository: IStockApiService {
    override suspend fun getAllTickers(
        @Query(value = "apiKey") apiKey: String,
        @Query(value = "market") market: String
    ): IndiceResponse {
        return RestAPI.apiService.getAllTickers(apiKey, market)
    }

}

