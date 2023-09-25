package com.example.gonggubox.ui.items.inDept

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gonggubox.ui.theme.GongGuBoxTheme
import com.example.gonggubox.ui.theme.Typography

@Composable
fun InDeptTitle() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "환영합니다!",
            color = MaterialTheme.colorScheme.onSurface,
            style = Typography.displayMedium
        )
        Row(
            verticalAlignment = Alignment.Bottom,
            content = {
                Text(
                    text = "&User",
                    color = MaterialTheme.colorScheme.onSurface,
                    style = Typography.displayMedium
                )
                Spacer(modifier = Modifier.size(5.dp))
                Text(
                    text = "님의",
                    color = MaterialTheme.colorScheme.onSurface,
                    style = Typography.displaySmall
                )
            }
        )
        Text(
            text = "소속을 알려주세요!",
            color = MaterialTheme.colorScheme.onSurface,
            style = Typography.displaySmall
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInDept() {
    GongGuBoxTheme {
        InDeptTitle()
    }
}