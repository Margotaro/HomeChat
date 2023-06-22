package com.alpha.stoki.network.gson_objects

data class TickerResponse(
    val count: Int,
    val next_url: String?,
    val request_id: String,
    val results: List<Ticker>,
    val status: String
)