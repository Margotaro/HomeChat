package com.alpha.stoki.model

import java.net.URL

class Stock(
    override val tag: String,
    override val name: String,
    override var imageUrl: URL,
    override var stockPrice: Double,
    override var earningsPerShare: Double,
    override var bookValuePerShare: Double,
    override var sales: Double,
    override var sectorOfTheEconomy: SectorOfTheEconomy,
    override val competition: List<ITicker>,
    override val capitalization: Double,
    override val debt: Double,
    override val profit: Double,
    override val expenses: Double,
    override val booked: Boolean
) : ITicker