package com.example.gonggubox.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.gonggubox.ui.FirstInitPage
import com.example.gonggubox.ui.LogoPage
import com.example.gonggubox.ui.SecondInitPage

@Composable
fun GongGuBoxNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = LogoPage.route
    ) {
        composable(LogoPage.route) {
            LogoPage()
        }
        composable(FirstInitPage.route) {
            FirstInitPage()
        }
        composable(SecondInitPage.route) {
            SecondInitPage()
        }
    }
}