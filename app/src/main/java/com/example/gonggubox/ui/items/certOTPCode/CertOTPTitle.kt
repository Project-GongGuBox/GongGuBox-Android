package com.example.gonggubox.ui.items.certOTPCode

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.gonggubox.ui.theme.GongGuBoxTheme
import com.example.gonggubox.ui.theme.Typography

@Composable
fun CertOTPTitle() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "등록해주신 소속의 이메일로",
            color = MaterialTheme.colorScheme.onSurface,
            style = Typography.headlineSmall
        )
        Text(
            text = "인증 코드를",
            color = MaterialTheme.colorScheme.onSurface,
            style = Typography.displayMedium
        )
        Text(
            text = "발송하였습니다!",
            color = MaterialTheme.colorScheme.onSurface,
            style = Typography.headlineLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCertOTPTitle() {
    GongGuBoxTheme {
        CertOTPTitle()
    }
}