package com.alpha.stoki.core.reusable_components.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.alpha.stoki.viewmodel.BookmarksViewModel
//import androidx.lifecycle.compose.collectAsStateWithLifecycle
//import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
//import com.alpha.stoki.viewmodel.BookmarksUiState


@Composable
internal fun BookmarksRoute(
    onBookmarkClick: (String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: BookmarksViewModel = hiltViewModel(),
) {
    //val bookmarksState by viewModel.bookmarksState.collectAsStateWithLifecycle()
    BookmarksScreen(
        //bookmarksState = bookmarksState,
        removeFromBookmarks = viewModel::removeFromSavedResources,
        onBookmarkClick = onBookmarkClick,
        modifier = modifier,
    )
}

@Composable
fun BookmarksScreen(
    //bookmarksState: BookmarksUiState,
    removeFromBookmarks: (String) -> Unit,
    onBookmarkClick: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Bookmarks",
            modifier = Modifier.padding(16.dp)
        )
    }
}