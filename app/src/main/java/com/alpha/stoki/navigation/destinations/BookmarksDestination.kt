package com.alpha.stoki.navigation.destinations

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val bookmarksDestination = "bookmarks"

fun NavController.navigateToBookmarks(navOptions: NavOptions? = null) {
    this.navigate(bookmarksDestination, navOptions)
}

fun NavGraphBuilder.bookmarksScreen() {
    composable(route = generalDestination) {
        BookmarksRoute()
    }
}