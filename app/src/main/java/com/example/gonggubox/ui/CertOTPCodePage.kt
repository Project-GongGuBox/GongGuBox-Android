package com.example.gonggubox.ui

import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.gonggubox.R
import com.example.gonggubox.ui.items.certOTPCode.CertOTPCodeInput
import com.example.gonggubox.ui.items.certOTPCode.CertOTPConfirmBtn
import com.example.gonggubox.ui.items.certOTPCode.CertOTPTitle
import com.example.gonggubox.ui.theme.Typography

@Composable
fun CertOTPCodePage() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            content = {
                CertOTPTitle()
                Spacer(modifier = Modifier.size(50.dp))
                Image(
                    painter = painterResource(id = R.drawable.logo_certificate),
                    contentDescription = "Logo_Certification"
                )
                Spacer(modifier = Modifier.size(20.dp))
                CertOTPCodeInput()
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    text = "인증 코드를 받지 못하셨나요?",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontWeight = FontWeight.SemiBold,
                    textDecoration = TextDecoration.Underline,
                    style = Typography.bodySmall
                )
                Spacer(modifier = Modifier.size(50.dp))
                CertOTPConfirmBtn(onClickConfirmBtn = { /*TODO*/ })
            }
        )
    }
}