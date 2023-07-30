package com.alpha.stoki
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alpha.stoki.viewmodel.TickerScreenViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.alpha.stoki.core.reusable_components.ui.TickerListItem
import com.alpha.stoki.core.reusable_components.ui.TickerListItemData
import com.alpha.stoki.model.ITicker

@Preview
@Composable
internal fun MainStockIndicesFeed(
    modifier: Modifier = Modifier,
    viewModel: TickerScreenViewModel = viewModel(),
) {
    val list by viewModel.indices.observeAsState()
    list?.let { strongList ->
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {
            items(items = strongList, itemContent = {
                Column {
                    TickerListItem(listItemData = it.toTickerListItemData())
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                }
            })
        }
    }
}

fun ITicker.toTickerListItemData(): TickerListItemData {
    return TickerListItemData(
        this,
        false
    )
}

