package com.alpha.stoki.navigation.destinations

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.alpha.stoki.core.reusable_components.BookmarksRoute

const val bookmarksDestinationRoute = "bookmarks"

fun NavController.navigateToBookmarks(navOptions: NavOptions? = null) {
    this.navigate(bookmarksDestinationRoute, navOptions)
}

fun NavGraphBuilder.bookmarksScreen() {
    composable(route = generalDestinationRoute) {
        BookmarksRoute({})
    }
}