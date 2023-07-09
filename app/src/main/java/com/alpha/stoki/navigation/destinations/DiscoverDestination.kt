package com.alpha.stoki.navigation.destinations

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.alpha.stoki.viewmodel.BookmarksViewModel
import androidx.lifecycle.viewmodel.compose.viewModel



const val discoverRoute = "discover_route"

fun NavController.navigateToDiscover(navOptions: NavOptions? = null) {
    this.navigate(discoverRoute, navOptions)
}

fun NavGraphBuilder.discoverScreen(
    onTopicClick: (String) -> Unit,
    onShowSnackbar: suspend (String, String?) -> Boolean,
) {
    composable(route = discoverRoute) {
        DiscoverRoute(onTopicClick, onShowSnackbar)
    }
}

@Composable
internal fun DiscoverRoute(
    onTopicClick: (String) -> Unit,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    viewModel: BookmarksViewModel = viewModel(),
) {
    val feedState by viewModel.feedUiState.collectAsStateWithLifecycle()
    BookmarksScreen(
        feedState = feedState,
        onShowSnackbar = onShowSnackbar,
        removeFromBookmarks = viewModel::removeFromSavedResources,
        onNewsResourceViewed = { viewModel.setNewsResourceViewed(it, true) },
        onTopicClick = onTopicClick,
        modifier = modifier,
        shouldDisplayUndoBookmark = viewModel.shouldDisplayUndoBookmark,
        undoBookmarkRemoval = viewModel::undoBookmarkRemoval,
        clearUndoState = viewModel::clearUndoState,
    )
}