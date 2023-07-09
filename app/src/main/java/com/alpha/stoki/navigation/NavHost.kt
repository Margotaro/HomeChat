package com.alpha.stoki.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.alpha.stoki.core.AppState
import androidx.navigation.compose.NavHost


@Composable
fun NiaNavHost(
    appState: AppState,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    startDestination: String = forYouNavigationRoute,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        // TODO: handle topic clicks from each top level destination
        forYouScreen(onTopicClick = {})
        bookmarksScreen(
            onTopicClick = navController::navigateToTopic,
            onShowSnackbar = onShowSnackbar,
        )
        searchScreen(
            onBackClick = navController::popBackStack,
            onInterestsClick = { appState.navigateToTopLevelDestination(INTERESTS) },
            onTopicClick = navController::navigateToTopic,
        )
        interestsGraph(
            onTopicClick = { topicId ->
                navController.navigateToTopic(topicId)
            },
            nestedGraphs = {
                topicScreen(
                    onBackClick = navController::popBackStack,
                    onTopicClick = {},
                )
            },
        )
    }
}
