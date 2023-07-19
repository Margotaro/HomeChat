package com.alpha.stoki.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class GeneralViewModel : ViewModel() {
    private val _generalUiState = MutableStateFlow(GeneralUiState.Success(emptyList()))
    val generalState: StateFlow<GeneralUiState> = _generalUiState
}

sealed class GeneralUiState {
    data class Success(val suggestions: List<Int>): GeneralUiState()
    data class Error(val exception: Throwable): GeneralUiState()
}