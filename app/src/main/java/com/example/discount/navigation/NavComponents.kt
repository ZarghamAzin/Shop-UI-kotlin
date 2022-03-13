package com.example.discount.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.discount.ui.editProfile.EditProfileScreen
import com.example.discount.ui.forgetPassword.ForgetPasswordScreen
import com.example.discount.ui.history.HistoryScreen
import com.example.discount.ui.home.HomeScreen
import com.example.discount.ui.location.LocationScreen
import com.example.discount.ui.notification.NotificationScreen
import com.example.discount.ui.notification.OptionsScreen
import com.example.discount.ui.onBoarding.OnBoardingScreen
import com.example.discount.ui.productInfo.ProductInfoScreen
import com.example.discount.ui.register.SignInScreen
import com.example.discount.ui.register.SignUpScreen
import com.example.discount.ui.registerAsPartner.RegisterAsPartnerScreen
import com.example.discount.ui.scan.ScanScreen
import com.example.discount.ui.searchBrand.SearchBrandScreen
import com.example.discount.ui.searchHistory.SearchHistoryScreen
import com.example.discount.ui.setting.SettingScreen
import com.example.discount.ui.successCode.SuccessCodeScreen
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.theme.PrimaryGray


fun NavGraphBuilder.addOnBoarding(
    navController: NavController
) {
    composable(route = Screen.OnBoardingScreen.route) {
        OnBoardingScreen(navController)
    }
}

  fun NavGraphBuilder.addSignIn(
    navController: NavController,
    navigateToHome: () -> Unit
) {
    composable(route = Screen.SignInScreen.route) {
        SignInScreen(
            navController = navController,
            navigateToHome = navigateToHome
        )
    }
}

  fun NavGraphBuilder.addSignUp(
    navController: NavController,
    navigateToHome: () -> Unit
) {
    composable(route = Screen.SignUpScreen.route) {
        SignUpScreen(
            navController = navController,
            navigateToHomeScreen = navigateToHome
        )
    }
}

  fun NavGraphBuilder.addForgetPassword(
    navController: NavController
) {
    composable(route = Screen.ForgetPasswordScreen.route) {
        ForgetPasswordScreen(navController)
    }
}

  fun NavGraphBuilder.addSuccessCode(
    navController: NavController
) {
    composable(route = Screen.SuccessCodeScreen.route) {
        SuccessCodeScreen(navController)
    }
}


  fun NavGraphBuilder.addHome(
    navController: NavController
) {

    composable(route = BottomBarScreen.Home.route) {
        /* if (!showBottomNavBar.value) {
             showBottomNavBar.value = true
         }*/
        HomeScreen(navController)
    }
}

  fun NavGraphBuilder.addScan(
    navController: NavController
) {
    composable(route = BottomBarScreen.Scan.route) {
        /* if (showBottomNavBar.value)
             showBottomNavBar.value = false*/
        ScanScreen(navController)
    }
}

  fun NavGraphBuilder.addHistory(
    navController: NavController

) {
    composable(route = BottomBarScreen.History.route) {
        /* if (!showBottomNavBar.value) {
             showBottomNavBar.value = true
         }*/
        HistoryScreen(navController)
    }
}

  fun NavGraphBuilder.addProductInfo(
    navController: NavController
) {
    composable(route = Screen.ProductInfoScreen.route) {
        /*if (showBottomNavBar.value)
            showBottomNavBar.value = false*/
        ProductInfoScreen(navController)
    }
}


  fun NavGraphBuilder.addSetting(
    navController: NavController
) {
    composable(route = Screen.SettingScreen.route) {
        /*if (showBottomNavBar.value)
            showBottomNavBar.value = false*/
        SettingScreen(navController = navController)
    }
}

  fun NavGraphBuilder.addRegisterAsPartner(
    navController: NavController
) {
    composable(route = Screen.RegisterAsPartnerScreen.route) {
        /* if (showBottomNavBar.value)
             showBottomNavBar.value = false*/

        RegisterAsPartnerScreen(navController = navController)
    }
}

  fun NavGraphBuilder.addSearchHistory(
    navController: NavController
) {
    composable(route = Screen.SearchHistoryScreen.route) {
        /*if (showBottomNavBar.value)
            showBottomNavBar.value = false*/

        SearchHistoryScreen(navController = navController)
    }
}

  fun NavGraphBuilder.addEditProfile(
    navController: NavController
) {
    composable(route = Screen.EditProfileScreen.route) {
        EditProfileScreen(navController = navController)
    }
}

  fun NavGraphBuilder.addLocation(
    navController: NavController
) {
    composable(route = Screen.LocationScreen.route) {
        LocationScreen(navController = navController)
    }
}

  fun NavGraphBuilder.addNotification(
    navController: NavController
) {
    composable(route = Screen.NotificationScreen.route) {
        NotificationScreen(navController = navController)
    }
}

  fun NavGraphBuilder.addOptions(
    navController: NavController
) {
    composable(route = Screen.OptionsScreen.route) {
        OptionsScreen(navController = navController)
    }
}

  fun NavGraphBuilder.addSearchBrand(
    navController: NavController
) {
    composable(route = Screen.SearchBrandScreen.route) {
        /*if (showBottomNavBar.value)
            showBottomNavBar.value = false*/
        SearchBrandScreen(navController = navController)
    }
}


@ExperimentalMaterialApi
@Composable
fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colors.primarySurface
) {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Scan,
        BottomBarScreen.History
    )
    val backStackEntry = navController.currentBackStackEntryAsState()


    BottomNavigation(
        modifier = modifier,
        backgroundColor = backgroundColor
    ) {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                backStackEntry = backStackEntry,
                navController = navController
            )

        }

    }

}

@ExperimentalMaterialApi
@Composable
private fun RowScope.AddItem(
    screen: BottomBarScreen,
    backStackEntry: State<NavBackStackEntry?>,
    navController: NavHostController
) {
    val selected = screen.route == backStackEntry.value?.destination?.route

    BottomNavigationItem(
        selected = selected,
        onClick = {

            if (!selected)
                navController.navigate(screen.route) {
                    popUpTo(navController.graph.findStartDestination().id)
                    launchSingleTop = true
                }
        },
        selectedContentColor = Color.Unspecified,
        unselectedContentColor = Color.Unspecified,
        icon = {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Icon(
                    painter = painterResource(id = if (selected) screen.selectedIcon else screen.unSelectedIcon),
                    contentDescription = screen.title
                )

                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = screen.title,
                    style = MaterialTheme.typography.body2.copy(
                        color = if (selected) {
                            if (backStackEntry.value?.destination?.route == "scan")
                                Color.Black
                            else
                                PrimaryBlue
                        } else {
                            PrimaryGray
                        },
                        fontSize = 10.sp
                    )
                )

                if (screen.title == "Scan") {
                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
        }
    )

}
