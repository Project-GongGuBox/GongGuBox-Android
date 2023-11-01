package com.example.gonggubox.ui

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.gonggubox.R
import com.example.gonggubox.navGraph.InputOTPCodePage
import com.example.gonggubox.ui.items.logIn.GoogleLogInBtn
import com.example.gonggubox.ui.items.logIn.KaKaoLogInBtn
import com.example.gonggubox.ui.items.logIn.LogInTitle

@Composable
fun SignInPage(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LogInTitle()
            Spacer(modifier = modifier.size(50.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_signin),
                modifier = modifier.width(300.dp).height(240.dp),
                contentDescription = "로고"
            )
            Spacer(modifier = modifier.size(50.dp))
            GoogleLogInBtn { navController.navigate(InputOTPCodePage.route) }
            Spacer(modifier = modifier.size(20.dp))
            KaKaoLogInBtn { navController.navigate(InputOTPCodePage.route) }
        }
    }
}