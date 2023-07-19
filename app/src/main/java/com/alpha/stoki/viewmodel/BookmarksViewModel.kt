package com.alpha.stoki.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class BookmarksViewModel : ViewModel() {
    private val _bookmarksUiState = MutableStateFlow(BookmarksUiState.Success(emptyList()))
    val bookmarksState: StateFlow<BookmarksUiState> = _bookmarksUiState

    fun removeFromSavedResources(ticker: String) {
    }
}

sealed class BookmarksUiState {
    data class Success(val bookmarks: List<Int>): BookmarksUiState()
    data class Error(val exception: Throwable): BookmarksUiState()
}
