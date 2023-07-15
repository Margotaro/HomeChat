package com.alpha.stoki.navigation.destinations

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink


const val generalDestination = "general"

fun NavController.navigateToGeneral(navOptions: NavOptions? = null) {
    this.navigate(generalDestination, navOptions)
}

fun NavGraphBuilder.generalScreen() {
    composable(route = generalDestination) {
        GeneralRoute()
    }
}
