package com.example.gonggubox.ui.items.certOTPCode

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gonggubox.ui.theme.GongGuBoxShape
import com.example.gonggubox.ui.theme.GongGuBoxTheme

@Composable
fun CertOTPCodeInput() {
    var firstDigit by remember { mutableStateOf("") }
    var secondDigit by remember { mutableStateOf("") }
    var thirdDigit by remember { mutableStateOf("") }
    var fourthDigit by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .width(270.dp)
            .wrapContentHeight(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        OutlinedTextField(
            value = firstDigit,
            onValueChange = { firstDigit = it },
            modifier = Modifier
                .width(60.dp)
                .height(60.dp)
                .aspectRatio(1f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            singleLine = true,
            shape = GongGuBoxShape.extraLarge,
            colors = TextFieldDefaults.colors(Color.White)
        )
        OutlinedTextField(
            value = secondDigit,
            onValueChange = { secondDigit = it },
            modifier = Modifier
                .width(60.dp)
                .height(60.dp)
                .aspectRatio(1f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            singleLine = true,
            shape = GongGuBoxShape.extraLarge,
            colors = TextFieldDefaults.colors()
        )
        OutlinedTextField(
            value = thirdDigit,
            onValueChange = { thirdDigit = it },
            modifier = Modifier
                .width(60.dp)
                .height(60.dp)
                .aspectRatio(1f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            singleLine = true,
            shape = GongGuBoxShape.extraLarge,
            colors = TextFieldDefaults.colors()
        )
        OutlinedTextField(
            value = fourthDigit,
            onValueChange = { fourthDigit = it },
            modifier = Modifier
                .width(60.dp)
                .height(60.dp)
                .aspectRatio(1f),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            singleLine = true,
            shape = GongGuBoxShape.extraLarge,
            colors = TextFieldDefaults.colors()
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