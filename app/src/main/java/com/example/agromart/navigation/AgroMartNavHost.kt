package com.example.agromart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.agromart.view.screen.MainScreen

@Composable
fun AgroMartNavHost(
    navHostController: NavHostController,
    modifier: Modifier,
) {
    NavHost(navController = navHostController, startDestination = AgroMartScreen.MAIN_SCREEN.name) {
        composable(route = AgroMartScreen.MAIN_SCREEN.name) {
            MainScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.PRODUCT_DESCRIPTION_SCREEN.name) {
            MainScreen(modifier = modifier, navHostController = navHostController)
        }
    }
}