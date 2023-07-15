package com.alpha.stoki.navigation.destinations

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable


const val discoverRoute = "discover"

fun NavController.navigateToDiscover(navOptions: NavOptions? = null) {
    this.navigate(discoverRoute, navOptions)
}

fun NavGraphBuilder.discoverScreen() {
    composable(route = discoverRoute) {
        DiscoverRoute()
    }
}