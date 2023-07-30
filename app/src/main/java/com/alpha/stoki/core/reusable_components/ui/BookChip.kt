package com.alpha.stoki.core.reusable_components.ui

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import com.alpha.stoki.core.reusable_components.data.ReusableIcons

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookChip(
    selected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
    label: @Composable () -> Unit,
) {
    FilterChip(
        selected = selected,
        onClick = { onSelectedChange(!selected) },
        leadingIcon = if (selected) {
            {
                Icon(
                    imageVector = ReusableIcons.BookmarkSelected,
                    contentDescription = null,
                )
            }
        } else {
            null
        },
        label = label,
        shape = CircleShape,
    )
}