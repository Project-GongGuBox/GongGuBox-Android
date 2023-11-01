package com.example.gonggubox.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gonggubox.R
import com.example.gonggubox.ui.items.init.InitPageTitle1

@Composable
fun InitPage1(modifier: Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start,
            content = {
                InitPageTitle1(modifier = modifier)
                Image(
                    painter = painterResource(id = R.drawable.logo_init1),
                    modifier = modifier.size(400.dp),
                    contentDescription = "Init-page1 Logo"
                )
            }
        )
    }
}