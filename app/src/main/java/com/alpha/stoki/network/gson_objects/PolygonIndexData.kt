package com.alpha.stoki.network.gson_objects

data class PolygonIndexData(
    val ticker: String,
    val name: String,
    val market: String,
    val locale: String,
    val active: Boolean,
    val sourceFeed: String
)
