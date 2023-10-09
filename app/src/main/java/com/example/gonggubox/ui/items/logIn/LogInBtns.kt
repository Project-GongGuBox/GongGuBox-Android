package com.example.gonggubox.ui.items.logIn

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.gonggubox.R
import com.example.gonggubox.ui.font.Pretendard_Kr
import com.example.gonggubox.ui.theme.GongGuBoxShape

@Composable
fun LogInBtnsView(
    onClickGoogle: () -> Unit,
    onClickKaKao: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        content = {
            GoogleLogInBtn(onClickGoogle)
            Spacer(modifier = Modifier.size(20.dp))
            KaKaoLogInBtn(onClickKaKao)
        }
    )
}

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

@Composable
fun GoogleLogInBtn(onClickGoogle: () -> Unit) {
    Button(
        onClick = onClickGoogle,
        modifier = Modifier
            .width(330.dp)
            .height(50.dp),
        shape = GongGuBoxShape.small,
        colors = ButtonDefaults.buttonColors(Color.White),
        elevation = ButtonDefaults.elevatedButtonElevation(10.dp),
        content = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                content = {
                    Icon(
                        painter = painterResource(id = R.drawable.logo_google),
                        contentDescription = "구글 로고"
                    )
                    Spacer(modifier = Modifier.size(24.dp))
                    Text(
                        text = "구글 계정으로 로그인하기",
                        color = MaterialTheme.colorScheme.onSurface,
                        fontWeight = FontWeight.Medium,
                        fontFamily = Pretendard_Kr
                    )
                }
            )
        }
    )
}