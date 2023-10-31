package com.example.gonggubox.ui.items.logIn

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gonggubox.R
import com.example.gonggubox.ui.font.Pretendard_Kr
import com.example.gonggubox.ui.theme.GongGuBoxShape
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.common.api.ApiException

@Composable
fun GoogleLogInBtn(onClickGoogle: () -> Unit) {
    val googleSignInLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult(),
        onResult = { result ->
            try {
                val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
                val idToken = task.result.idToken
                if (idToken != null) {
                    /* TODO */
                } else {
                    /* TODO */
                }
            } catch (e: ApiException) { /* TODO */ }
        }
    )

    Button(
        onClick = {  },
        modifier = Modifier
            .width(330.dp)
            .height(50.dp),
        shape = GongGuBoxShape.small,
        colors = ButtonDefaults.buttonColors(Color.White),
        elevation = ButtonDefaults.elevatedButtonElevation(10.dp),
        content = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                content = {
                    Image(
                        painter = painterResource(id = R.drawable.logo_google),
                        contentScale = ContentScale.Fit,
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

@Preview(showBackground = true)
@Composable
fun PreviewGoogleBtn() {
    GoogleLogInBtn {}
}