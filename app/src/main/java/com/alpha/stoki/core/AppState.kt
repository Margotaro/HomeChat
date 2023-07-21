package com.alpha.stoki.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.alpha.stoki.navigation.destinations.TopLevelDestination
import com.alpha.stoki.navigation.destinations.bookmarksDestinationRoute
import com.alpha.stoki.navigation.destinations.discoverDestinationRoute
import com.alpha.stoki.navigation.destinations.generalDestinationRoute
import com.alpha.stoki.navigation.destinations.navigateToBookmarks
import com.alpha.stoki.navigation.destinations.navigateToDiscover
import com.alpha.stoki.navigation.destinations.navigateToGeneral
import androidx.tracing.trace

@Composable
fun rememberAppState(
    navController: NavHostController = rememberNavController(),
): AppState {
    return remember(
        navController
    ) {
        AppState(
            navController
        )
    }
}

@Stable
class AppState(
    val navController: NavHostController
) {
    val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val currentTopLevelDestination: TopLevelDestination?
        @Composable get() = when (currentDestination?.route) {
            generalDestinationRoute -> TopLevelDestination.GENERAL
            discoverDestinationRoute -> TopLevelDestination.DISCOVER
            bookmarksDestinationRoute -> TopLevelDestination.BOOKMARKS
            else -> null
        }
    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.values().asList()

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        val topLevelNavOptions = navOptions {

            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }

            launchSingleTop = true
            restoreState = true
        }

        when (topLevelDestination) {
            TopLevelDestination.GENERAL -> navController.navigateToGeneral(topLevelNavOptions)
            TopLevelDestination.DISCOVER -> navController.navigateToDiscover(topLevelNavOptions)
            TopLevelDestination.BOOKMARKS -> navController.navigateToBookmarks(
                topLevelNavOptions
            )
        }
    }
}