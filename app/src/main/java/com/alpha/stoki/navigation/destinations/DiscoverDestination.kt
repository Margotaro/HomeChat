package com.alpha.stoki.navigation.destinations

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.alpha.stoki.core.reusable_components.navigation.DiscoverRoute


const val discoverDestinationRoute = "discover"

fun NavController.navigateToDiscover(navOptions: NavOptions? = null) {
    this.navigate(discoverDestinationRoute, navOptions)
}

fun NavGraphBuilder.discoverScreen() {
    composable(route = discoverDestinationRoute) {
        DiscoverRoute()
    }
}