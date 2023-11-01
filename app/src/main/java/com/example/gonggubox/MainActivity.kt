package com.example.gonggubox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gonggubox.ui.theme.GongGuBoxTheme
import com.example.gonggubox.navGraph.GongGuBoxNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController: NavHostController = rememberNavController()
            GongGuBoxTheme { GongGuBoxNavHost(navController = navController) }
        }
    }
}