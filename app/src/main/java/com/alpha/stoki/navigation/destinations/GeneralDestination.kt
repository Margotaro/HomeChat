package com.alpha.stoki.navigation.destinations

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.alpha.stoki.core.reusable_components.GeneralRoute


const val generalDestinationRoute = "general"

fun NavController.navigateToGeneral(navOptions: NavOptions? = null) {
    this.navigate(generalDestinationRoute, navOptions)
}

fun NavGraphBuilder.generalScreen() {
    composable(route = generalDestinationRoute) {
        GeneralRoute()
    }
}
