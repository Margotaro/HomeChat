package com.alpha.stoki.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.alpha.stoki.core.state.NavigationState
import androidx.navigation.compose.NavHost
import com.alpha.stoki.navigation.destinations.bookmarksScreen
import com.alpha.stoki.navigation.destinations.discoverScreen
import com.alpha.stoki.navigation.destinations.generalDestinationRoute
import com.alpha.stoki.navigation.destinations.generalScreen

@Composable
fun StokiNavHost(
    navState: NavigationState,
    modifier: Modifier = Modifier,
    startDestination: String = generalDestinationRoute,
) {
    val navController = navState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        generalScreen()
        discoverScreen()
        bookmarksScreen()
    }
}
