package com.example.agromart.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.agromart.view.screen.BuySellScreen
import com.example.agromart.view.screen.BuyerItemList
import com.example.agromart.view.screen.MainScreen
import com.example.agromart.view.screen.SplashScreen

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun AgroMartNavHost(
    navHostController: NavHostController,
    modifier: Modifier,
) {
    NavHost(navController = navHostController, startDestination = AgroMartScreen.SPLASH_SCREEN.name) {
        composable(route = AgroMartScreen.MAIN_SCREEN.name) {
            MainScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.PRODUCT_DESCRIPTION_SCREEN.name) {
            MainScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.SPLASH_SCREEN.name) {
            SplashScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.BUY_SELL_SCREEN.name) {
            BuySellScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.BUYER_ITEM_LIST_SCREEN.name) {
            BuyerItemList(modifier = modifier, navHostController = navHostController)
        }
    }
}