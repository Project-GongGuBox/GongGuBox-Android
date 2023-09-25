package com.example.gonggubox.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import com.example.gonggubox.R
import com.example.gonggubox.ui.items.certOTPCode.CertOTPCodeInput
import com.example.gonggubox.ui.items.certOTPCode.CertOTPConfirmBtn
import com.example.gonggubox.ui.items.certOTPCode.CertOTPTitle
import com.example.gonggubox.ui.theme.GongGuBoxTheme
import com.example.gonggubox.ui.theme.Typography

@Preview(showBackground = true)
@Composable
fun CertOTPCodePage() {
    GongGuBoxTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.surface
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                content = {
                    CertOTPTitle()
                    Image(
                        painter = painterResource(id = R.drawable.logo_certificate),
                        contentDescription = ""
                    )
                    CertOTPCodeInput()
                    Text(
                        text = "인증 코드를 받지 못하셨나요?",
                        color = MaterialTheme.colorScheme.onSurface,
                        textDecoration = TextDecoration.Underline,
                        style = Typography.bodySmall
                    )
                    CertOTPConfirmBtn {}
                }
            )
        }
    }
}