package com.alpha.stoki.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DiscoverViewModel : ViewModel() {
    private val _discoverUiState = MutableStateFlow(DiscoverUiState.Success(emptyList()))
    val discoverState: StateFlow<DiscoverUiState> = _discoverUiState
}

sealed class DiscoverUiState {
    data class Success(val suggestions: List<Int>): DiscoverUiState()
    data class Error(val exception: Throwable): DiscoverUiState()
}