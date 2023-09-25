package com.example.gonggubox.ui.items.init

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gonggubox.ui.theme.Typography

@Composable
fun InitPageTitle1() {
    Column(
        modifier = Modifier
            .padding(top = 70.dp, start = 15.dp, end = 15.dp)
            .wrapContentHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        content = {
            Text(
                text = "혼자서 사용하기에는",
                color = MaterialTheme.colorScheme.onSurface,
                style = Typography.displaySmall
            )
            Spacer(modifier = Modifier.size(25.dp))
            Text(
                text = "너무 많은 양이라",
                color = MaterialTheme.colorScheme.onSurface,
                style = Typography.displaySmall
            )
            Spacer(modifier = Modifier.size(25.dp))
            Text(
                text = "고민 되신다고요?",
                color = MaterialTheme.colorScheme.onSurface,
                style = Typography.displayMedium
            )
        }
    )
}