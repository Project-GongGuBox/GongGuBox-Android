package com.example.gonggubox.welcomePage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonggubox.ui.font.Pretendard_Kr
import com.example.gonggubox.ui.theme.GongGuBoxTheme

@Composable
fun WelcomePage() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 70.dp, start = 15.dp),
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
            content = {
                Text(
                    text = "혼자서 사용하기에는",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Pretendard_Kr
                )
                Spacer(modifier = Modifier.size(25.dp))
                Text(
                    text = "너무 많은 양이라",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Pretendard_Kr
                )
                Spacer(modifier = Modifier.size(25.dp))
                Text(
                    text = "고민 되신다고요?",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Pretendard_Kr
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWelcomePage() {
    GongGuBoxTheme { WelcomePage() }
}