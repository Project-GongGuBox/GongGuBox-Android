package com.example.gonggubox.ui.items.main

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddShoppingCart
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun CartFabBtn(
    modifier: Modifier,
    onCartClick: () -> Unit
) {
    ExtendedFloatingActionButton(
        onClick = onCartClick,
        modifier = modifier.wrapContentSize(),
        shape = CircleShape,
        contentColor = MaterialTheme.colorScheme.primary,
        content = {
            Icon(
                imageVector = Icons.Default.AddShoppingCart,
                contentDescription = "Add On Cart",
                modifier = modifier.wrapContentSize(),
                tint = Color.White
            )
        }
    )
}