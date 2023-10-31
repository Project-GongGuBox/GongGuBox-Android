package com.example.gonggubox.ui

import android.content.Context
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gonggubox.R
import com.example.gonggubox.ui.items.logIn.GoogleLogInBtn
import com.example.gonggubox.ui.items.logIn.KaKaoLogInBtn
import com.example.gonggubox.ui.items.logIn.LogInTitle
import com.kakao.sdk.auth.model.OAuthToken
import com.kakao.sdk.common.model.ClientError
import com.kakao.sdk.user.UserApiClient

@Composable
fun SignInPage() {
    val localContext: Context = LocalContext.current
    val kakaoInstance: UserApiClient = UserApiClient.instance
    val kakaoCallback: (OAuthToken?, Throwable?) -> Unit = { token, error ->
        if (error != null) {
            Log.e("로그", "카카오 계정으로 로그인 실패", error)
        } else if (token != null) {
            Log.i("로그", "카키오 계정으로 로그인 성공 ${token.accessToken}")
        }
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LogInTitle()
            Spacer(modifier = Modifier.size(50.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_signin),
                modifier = Modifier
                    .width(300.dp)
                    .height(240.dp),
                contentDescription = "로고"
            )
            Spacer(modifier = Modifier.size(50.dp))
            GoogleLogInBtn { /* TODO("insert LogIn Function") */ }
            Spacer(modifier = Modifier.size(20.dp))
            KaKaoLogInBtn {
                if (kakaoInstance.isKakaoTalkLoginAvailable(localContext)) {
                    kakaoInstance.loginWithKakaoTalk(localContext) { token, error ->
                        if (error is ClientError) {
                            return@loginWithKakaoTalk
                        }
                        kakaoInstance.loginWithKakaoAccount(localContext, callback = kakaoCallback)
                        Log.d("토큰", "${token?.accessToken} \n ${token?.idToken}")
                    }
                } else {
                    kakaoInstance.loginWithKakaoAccount(localContext, callback = kakaoCallback)
                }
            }
        }
    }
}