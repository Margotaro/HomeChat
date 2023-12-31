package com.alpha.stoki
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import com.alpha.stoki.model.StockGroupData
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alpha.stoki.viewmodel.IndicesViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Preview
@Composable
internal fun MainStockIndicesFeed(
    modifier: Modifier = Modifier,
    feed: List<StockGroupData> = mockStockGroupCardDataList,
    viewModel: IndicesViewModel = viewModel()
) {
    LazyColumn(modifier = modifier
        .fillMaxSize()
        .padding(20.dp)) {
        items(items = viewModel.fetchIndices(), itemContent = {
            Column {
                StockIndice(cardData = it)
                Spacer(modifier = Modifier.padding(vertical = 5.dp))
            }
        })
    }
}

@Composable
internal fun StockIndice(
    modifier: Modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFDBECF4), RoundedCornerShape(12.dp)),
    cardData: StockGroupData
) {
    Box(modifier = modifier.clickable {
        
    }) {
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            modifier = Modifier.padding(start = 10.dp)
                .fillMaxHeight()
                .align(Alignment.CenterStart),
            text = cardData.name
        )
    }
}