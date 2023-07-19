package com.alpha.stoki.core.reusable_components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.alpha.stoki.MainStockIndicesFeed
import com.alpha.stoki.viewmodel.GeneralViewModel
import com.alpha.stoki.viewmodel.IndicesViewModel
import androidx.activity.viewModels

@Composable
internal fun GeneralRoute(
    modifier: Modifier = Modifier,
    viewModel: GeneralViewModel = hiltViewModel(),
    indicesViewModel: IndicesViewModel = hiltViewModel(),
) {
    val generalState by viewModel.generalState.collectAsStateWithLifecycle()
    GeneralScreen(
        modifier = modifier,
        indicesViewModel = indicesViewModel
    )
}

@Composable
fun GeneralScreen(
    modifier: Modifier = Modifier,
    indicesViewModel: IndicesViewModel
) {
    MainStockIndicesFeed(
        modifier = Modifier,
        viewModel = indicesViewModel
    )
}