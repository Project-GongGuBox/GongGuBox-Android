package com.example.gonggubox.ui.items.init

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.gonggubox.ui.theme.Typography

@Composable
fun InitPageTitle2(modifier: Modifier) {
    Column(
        modifier = modifier.padding(top = 50.dp, start = 15.dp, end = 15.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        content = {
            Text(
                text = "주변 구성원들과 함께",
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold,
                style = Typography.displaySmall
            )
            Spacer(modifier = modifier.size(25.dp))
            Text(
                text = "필요한 만큼",
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold,
                style = Typography.displaySmall
            )
            Spacer(modifier = modifier.size(25.dp))
            Text(
                text = "나누어서",
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold,
                style = Typography.displayLarge
            )
            Spacer(modifier = modifier.size(25.dp))
            Text(
                text = "공동 구매 하세요!",
                color = MaterialTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold,
                style = Typography.displaySmall
            )
        }
    )
}