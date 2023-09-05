package com.example.gonggubox.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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

@Composable
fun InitPage1(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,
            content = {
                Text(
                    text = "혼자서 사용하기에는",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = modifier.size(10.dp))
                Text(
                    text = "너무 많은 양이라",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = modifier.size(10.dp))
                Text(
                    text = "고민 되신다고요?",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        )
    }
}

@Composable
fun InitPage2(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,
            content = {
                Text(
                    text = "혼자서 사용하기에는",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = modifier.size(10.dp))
                Text(
                    text = "너무 많은 양이라",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = modifier.size(10.dp))
                Text(
                    text = "고민 되신다고요?",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = modifier.size(10.dp))
                Text(
                    text = "고민 되신다고요?",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        )
    }
}

@Preview
@Composable
fun PreviewInitPage1() {
    InitPage1()
}