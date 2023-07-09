package com.alpha.stoki.navigation.destinations

import com.alpha.stoki.R
import com.alpha.stoki.navigation.NavIcons

enum class TopLevelDestination(
    val selectedIcon: Int,
    val iconTextId: Int,
) {
    GENERAL(
        selectedIcon = NavIcons.GeneralPageVectorImage,
        iconTextId = R.string.general,
    ),
    DISCOVER(
        selectedIcon = NavIcons.DiscoverPageVectorimage,
        iconTextId = R.string.discover,
    ),
    BOOKMARKS(
        selectedIcon = NavIcons.BookmarksPageVectorimage,
        iconTextId = R.string.bookmarks,
    ),
}
