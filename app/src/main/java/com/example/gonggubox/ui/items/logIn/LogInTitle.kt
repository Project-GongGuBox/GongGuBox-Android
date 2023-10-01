package com.example.gonggubox.ui.items.logIn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import com.example.gonggubox.ui.theme.Typography

@Composable
fun LogInTitle() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "환영합니다!",
            color = MaterialTheme.colorScheme.onSurface,
            fontWeight = FontWeight.Bold,
            style = Typography.displayMedium
        )
        Row(
            verticalAlignment = Alignment.Bottom,
            content = {
                Text(
                    text = "공구함",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontWeight = FontWeight.Bold,
                    style = Typography.displayLarge
                )
                Text(
                    text = "입니다!",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontWeight = FontWeight.Bold,
                    style = Typography.displayMedium
                )
            }
        )
    }
}