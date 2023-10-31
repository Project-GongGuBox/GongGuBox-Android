package com.example.gonggubox.ui.items.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gonggubox.ui.theme.GongGuBoxShape
import com.example.gonggubox.ui.theme.Typography

@Composable
fun MainRowCard(modifier: Modifier) {
    Card(
        modifier = modifier
            .width(160.dp)
            .height(240.dp),
        shape = GongGuBoxShape.extraLarge,
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(5.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = modifier.size(150.dp),
                colors = CardDefaults.cardColors(Color.White),
                shape = GongGuBoxShape.extraLarge,
                content = {  }
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Top,
                    content = {
                        Spacer(modifier = modifier.size(3.dp))
                        Text(
                            text = "출근 전 간단한 한 끼! 치즈 스프레드",
                            overflow = TextOverflow.Ellipsis,
                            maxLines = 2,
                            style = Typography.labelMedium
                        )
                        RatingRow(modifier = modifier, rating = "4.3", ratingPeoples = "60")
                    }
                )
            }

        }
    }
}

@Preview
@Composable
fun PreviewMainRowCard() {
    MainRowCard(Modifier)
}