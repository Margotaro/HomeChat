package com.alpha.stoki.core.reusable_components.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
//import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.alpha.stoki.MainStockIndicesFeed
import com.alpha.stoki.viewmodel.GeneralViewModel
import com.alpha.stoki.viewmodel.TickerScreenViewModel

@Composable
internal fun GeneralRoute(
    modifier: Modifier = Modifier,
    viewModel: GeneralViewModel = hiltViewModel(),
    tickerScreenViewModel: TickerScreenViewModel = hiltViewModel(),
) {
    //val generalState by viewModel.generalState.collectAsStateWithLifecycle()
    GeneralScreen(
        modifier = modifier,
        tickerScreenViewModel = tickerScreenViewModel
    )
}

@Composable
fun GeneralScreen(
    modifier: Modifier = Modifier,
    tickerScreenViewModel: TickerScreenViewModel
) {
    MainStockIndicesFeed(
        modifier = Modifier,
        viewModel = tickerScreenViewModel
    )
}