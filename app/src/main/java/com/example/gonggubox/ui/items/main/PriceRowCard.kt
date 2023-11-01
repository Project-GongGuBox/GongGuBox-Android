package com.example.gonggubox.ui.items.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.gonggubox.ui.theme.Typography

@Composable
fun PriceRowCard(
    modifier: Modifier,
    price: String,
    fundingRate: String
) {
    Row(
        modifier = modifier.fillMaxWidth().wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom
    ) {
        Text(text = price, style = Typography.labelSmall)
        Text(text = fundingRate, fontSize = 6.sp, style = Typography.labelSmall)
        CartBtn(modifier = modifier, onCartClick = { /* TODO */ })
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPriceRowCard() {
    PriceRowCard(modifier = Modifier, price = "15000원", fundingRate = "60% 펀딩 됨")
}