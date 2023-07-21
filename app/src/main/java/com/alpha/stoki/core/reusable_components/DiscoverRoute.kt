package com.alpha.stoki.core.reusable_components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
//import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.alpha.stoki.viewmodel.DiscoverViewModel

@Composable
internal fun DiscoverRoute(
    modifier: Modifier = Modifier,
    viewModel: DiscoverViewModel = hiltViewModel(),
) {
    //val generalState by viewModel.discoverState.collectAsStateWithLifecycle()
    DiscoverScreen(
        modifier = modifier,
    )
}

@Composable
fun DiscoverScreen(
    modifier: Modifier = Modifier,
) {

}