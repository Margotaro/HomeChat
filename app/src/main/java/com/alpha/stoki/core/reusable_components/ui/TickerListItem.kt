package com.alpha.stoki.core.reusable_components.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.alpha.stoki.model.ITicker

@Composable
internal fun TickerListItem(
    modifier: Modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFDBECF4), RoundedCornerShape(12.dp)),
    listItemData: TickerListItemData
) {
    Box(modifier = modifier.clickable {

    }) {
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            modifier = Modifier
                .padding(start = 10.dp)
                .fillMaxHeight()
                .align(Alignment.CenterStart),
            text = listItemData.cardData.name
        )
        BookChip(
            selected = listItemData.selected,
            onSelectedChange = { listItemData.changeSelectedStatus() },
            label = { Text("") }
        )
    }
}

class TickerListItemData(val cardData: ITicker, var selected: Boolean) {
    fun changeSelectedStatus() {
        selected = !selected
    }
}