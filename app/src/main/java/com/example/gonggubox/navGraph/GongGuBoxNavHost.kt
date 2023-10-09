package com.example.gonggubox.navGraph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gonggubox.ui.CertOTPCodePage
import com.example.gonggubox.ui.InitPage1
import com.example.gonggubox.ui.InitPage2
import com.example.gonggubox.ui.SignInPage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay

@Composable
fun GongGuBoxNavHost(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = FirstInitPage.route
    ) {
        composable(FirstInitPage.route) {
            InitPage1()

            LaunchedEffect(Dispatchers.Main) {
                delay(3000L)
                navController.navigate(SecondInitPage.route)
            }
        }
        composable(SecondInitPage.route) {
            InitPage2()

            LaunchedEffect(Dispatchers.Main) {
                delay(3000L)
                navController.navigate(SignInPage.route) {
                    popUpTo(FirstInitPage.route) {
                        inclusive = true
                    }
                }
            }
        }
        composable(SignInPage.route) { SignInPage() }
        composable(InputOTPCodePage.route) { CertOTPCodePage() }
    }
}