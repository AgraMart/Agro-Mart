package com.example.agromart.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.agromart.view.screen.BuySellScreen
import com.example.agromart.view.screen.BuyerItemListScreen
import com.example.agromart.view.screen.Category
import com.example.agromart.view.screen.ChatbotScreen
import com.example.agromart.view.screen.DeliveryAgentTrackingScreen
import com.example.agromart.view.screen.LoginScreen
import com.example.agromart.view.screen.MainScreen
import com.example.agromart.view.screen.NearbySellerScreen
import com.example.agromart.view.screen.ProductDescriptionSellerScreen
import com.example.agromart.view.screen.ProductDescriptionSellerScreenSecond
import com.example.agromart.view.screen.ProfileScreen
import com.example.agromart.view.screen.SplashScreen

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun AgroMartNavHost(
    navHostController: NavHostController,
    modifier: Modifier,
) {
    NavHost(
        navController = navHostController,
        startDestination = AgroMartScreen.SPLASH_SCREEN.name
    ) {
        composable(route = AgroMartScreen.MAIN_SCREEN.name) {
            MainScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(
            route = "${AgroMartScreen.PRODUCT_DESCRIPTION_SCREEN.name}/{categoryType}",
            arguments = listOf(
                navArgument("categoryType") { type = NavType.StringType },
            )
        ) {
            ProductDescriptionSellerScreen(
                modifier = modifier,
                navHostController = navHostController,
                it.arguments?.getString("categoryType")
            )
        }
        composable(route = AgroMartScreen.CATEGORY_SCREEN.name) {
            Category(
                modifier = modifier,
                navHostController = navHostController
            )
        }
        composable(route = AgroMartScreen.SPLASH_SCREEN.name) {
            SplashScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.BUY_SELL_SCREEN.name) {
            BuySellScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.BUYER_ITEM_LIST_SCREEN.name) {
            BuyerItemListScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.PROFILE_SCREEN.name) {
            ProfileScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.LOGIN_SCREEN.name) {
            LoginScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.NEARBY_SELLER_SCREEN.name) {
            NearbySellerScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.DELIVERY_AGENT_SCREEN.name) {
            DeliveryAgentTrackingScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.CHAT_BOT_SCREEN.name) {
            ChatbotScreen(modifier = modifier, navHostController = navHostController)
        }
        composable(
            route = "${AgroMartScreen.PRODUCT_DESCRIPTION_SELLER_SCREEN_SECOND.name}/{categoryType}",
            arguments = listOf(
                navArgument("categoryType") { type = NavType.StringType },
            )
        ) {
            ProductDescriptionSellerScreenSecond(
                modifier = modifier,
                navHostController = navHostController,
                it.arguments?.getString("categoryType")!!
            )
        }
        composable(route = AgroMartScreen.LIST_OF_PROD.name) {
            ListOfProd(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.BLOG_SCREEN.name) {
            BlogPage(modifier = modifier, navHostController = navHostController)
        }
        composable(route = AgroMartScreen.BUYING_SCREEN.name) {
            BuyingScreen(modifier = modifier, navHostController = navHostController)
        }
    }
}