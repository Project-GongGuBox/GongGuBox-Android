package com.example.gonggubox.ui

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
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonggubox.ui.font.Pretendard_Kr
import com.example.gonggubox.ui.theme.GongGuBoxTheme

@Composable
fun LogInPage() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 15.dp, top = 75.dp, end = 15.dp),
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
            content = {
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
                Column(
                    modifier = Modifier.wrapContentHeight().fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    content = {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .width(320.dp)
                                .height(50.dp)
                                .clip(ShapeDefaults.ExtraSmall),
                            content = {  }
                        )
                        Spacer(modifier = Modifier.size(20.dp))
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .width(320.dp)
                                .height(50.dp)
                                .clip(ShapeDefaults.ExtraSmall),
                            content = {  }
                        )
                    }
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLogInPage() {
    GongGuBoxTheme { LogInPage() }
}