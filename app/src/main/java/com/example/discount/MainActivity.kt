package com.example.discount

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.discount.navigation.BottomBarScreen
import com.example.discount.navigation.Screen
import com.example.discount.navigation.*
import com.example.discount.ui.theme.DiscountTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.transparent)

        setContent {
            var register by remember {
                mutableStateOf(false)
            }

            val showBottomNavBar = remember {
                mutableStateOf(true)
            }

            DiscountTheme {
                val navController = rememberNavController()

                if (!register) {
                    NavHost(
                        navController = navController,
                        startDestination = Screen.OnBoardingScreen.route
                    ) {
                        addOnBoarding(navController)
                        addSignIn(navController) {
                            register = true
                        }
                        addSignUp(navController) {
                            register = true
                        }
                        addForgetPassword(navController)
                        addSuccessCode(navController)
                    }

                } else {
                    Scaffold(
                        bottomBar = {
                            if (showBottomNavBar.value)
                                BottomBar(
                                    navController = navController,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(80.dp),
                                    backgroundColor = Color.White
                                )
                        }
                    ) { innerPadding ->

                        Box(
                            modifier = Modifier.padding(
                                PaddingValues(
                                    0.dp,
                                    0.dp,
                                    0.dp,
                                    innerPadding.calculateBottomPadding()
                                )
                            )
                        )
                        {
                            NavHost(
                                navController = navController,
                                startDestination = BottomBarScreen.Home.route
                            ) {
                                addHome(navController)
                                addScan(navController)
                                addHistory(navController = navController)
                                addSetting(navController)
                                addEditProfile(navController)
                                addRegisterAsPartner(navController)
                                addLocation(navController)
                                addNotification(navController)
                                addOptions(navController)
                                addProductInfo(navController)
                                addSearchBrand(navController)
                                addSearchHistory(navController)
                            }

                        }


                    }
                }

            }
        }
    }


}

