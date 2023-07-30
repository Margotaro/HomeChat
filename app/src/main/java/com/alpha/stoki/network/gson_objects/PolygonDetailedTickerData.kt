package com.alpha.stoki.network.gson_objects


data class PolygonAddress(
    val address1: String,
    val city: String,
    val postal_code: String,
    val state: String
)

data class PolygonBranding(
    val icon_url: String,
    val logo_url: String
)

data class PolygonDetailedTickerData(
    val active: Boolean,
    val address: PolygonAddress,
    val branding: PolygonBranding,
    val cik: String,
    val composite_figi: String,
    val currency_name: String,
    val description: String,
    val homepage_url: String,
    val list_date: String,
    val locale: String,
    val market: String,
    val market_cap: Long,
    val name: String,
    val phone_number: String,
    val primary_exchange: String,
    val round_lot: Int,
    val share_class_figi: String,
    val share_class_shares_outstanding: Long,
    val sic_code: String,
    val sic_description: String,
    val ticker: String,
    val ticker_root: String,
    val total_employees: Int,
    val type: String,
    val weighted_shares_outstanding: Long
)

data class PolygonDetailedTickerResponse(
    val request_id: String,
    val results: PolygonDetailedTickerData,
    val status: String
)

enum class PolygonTickerType(
    val marketTag: String
) {
    STOCKS("stocks"),
    OPTIONS("otc"),
    INDICES("indices"),
    FOREX("fx"),
    CRYPTO("crypto")
}

