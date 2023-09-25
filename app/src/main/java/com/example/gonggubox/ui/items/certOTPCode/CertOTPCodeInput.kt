package com.example.gonggubox.ui.items.certOTPCode

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gonggubox.ui.theme.GongGuBoxShape
import com.example.gonggubox.ui.theme.GongGuBoxTheme

@Composable
fun CertOTPCodeInput() {
    Row(
        modifier = Modifier.width(270.dp).wrapContentHeight(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.width(60.dp)
                .height(60.dp)
                .aspectRatio(1f),
            singleLine = true,
            shape = GongGuBoxShape.extraLarge
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.width(60.dp)
                .height(60.dp)
                .aspectRatio(1f),
            singleLine = true,
            shape = GongGuBoxShape.extraLarge
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.width(60.dp)
                .height(60.dp)
                .aspectRatio(1f),
            singleLine = true,
            shape = GongGuBoxShape.extraLarge
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.width(60.dp)
                .height(60.dp)
                .aspectRatio(1f),
            singleLine = true,
            shape = GongGuBoxShape.extraLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCertCodeInput() {
    GongGuBoxTheme {
        CertOTPCodeInput()
    }
}