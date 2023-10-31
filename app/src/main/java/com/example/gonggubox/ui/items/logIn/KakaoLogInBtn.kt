package com.example.gonggubox.ui.items.logIn

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gonggubox.R
import com.example.gonggubox.ui.theme.GongGuBoxShape

@Composable
fun KaKaoLogInBtn(onClickKaKao: () -> Unit) {
    Surface(
        modifier = Modifier
            .width(330.dp)
            .height(50.dp)
            .clickable(onClick = onClickKaKao),
        shape = GongGuBoxShape.small,
        tonalElevation = 10.dp,
        content = {
            Image(
                painter = painterResource(id = R.drawable.login_kakao),
                contentDescription = "카카오 로그인 버튼",
                contentScale = ContentScale.Fit
            )
        }
    )
}