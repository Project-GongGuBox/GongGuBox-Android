package com.example.gonggubox.ui.items.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonggubox.ui.theme.Typography

@Composable
fun PriceRowCard(modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(5.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom
    ) {
        Text(text = "15000원", style = Typography.labelSmall)
        Text(text = "60% 펀딩 됨", fontSize = 6.sp, style = Typography.labelSmall)
        CartFabBtn(modifier = modifier, onCartClick = { /* TODO */ })
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPriceRowCard() {
    PriceRowCard(modifier = Modifier)
}