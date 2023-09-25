package com.example.gonggubox.ui.items.certOTPCode

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gonggubox.ui.theme.GongGuBoxShape
import com.example.gonggubox.ui.theme.GongGuBoxTheme
import com.example.gonggubox.ui.theme.Typography

@Composable
fun CertOTPConfirmBtn(onClickConfirmBtn: () -> Unit) {
    Button(
        onClick = onClickConfirmBtn,
        modifier = Modifier
            .width(270.dp)
            .wrapContentHeight(),
        shape = GongGuBoxShape.extraLarge,
        content = {
            Text(
                text = "확인",
                color = MaterialTheme.colorScheme.onPrimary,
                style = Typography.bodyMedium
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewCertOTPConfirmBtn() {
    GongGuBoxTheme { CertOTPConfirmBtn(onClickConfirmBtn = {}) }
}