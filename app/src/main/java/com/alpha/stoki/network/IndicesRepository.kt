package com.alpha.stoki.network

import com.alpha.stoki.network.gson_objects.TickerResponse

class IndicesRepository(val network: IStockApiService): IStockApiService {
    override suspend fun getIndiceRating(): List<TickerResponse> {
        return network.getIndiceRating()
    }
}

