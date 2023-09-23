package com.example.gonggubox.ui.items.logIn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.gonggubox.ui.font.Pretendard_Kr

@Composable
fun LogInTitle() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "환영합니다!",
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = Pretendard_Kr
        )
        Row(
            verticalAlignment = Alignment.Bottom,
            content = {
                Text(
                    text = "공구함",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Pretendard_Kr
                )
                Text(
                    text = "입니다!",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Pretendard_Kr
                )
            }
        )
    }
}