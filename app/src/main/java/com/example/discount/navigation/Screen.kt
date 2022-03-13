package com.example.discount.navigation

sealed class Screen(val route: String/*, val arguments: List<NamedNavArgument> = emptyList()*/) {

    companion object {
        const val _KEY = "{arg}"
    }

    object OnBoardingScreen : Screen(route = "on_boarding_screen")

    object SignInScreen : Screen(route = "sign_in_screen")

    object SignUpScreen : Screen(route = "sign_up_screen")

    object ForgetPasswordScreen : Screen(route = "forget_password_screen")

    object SettingScreen : Screen(route = "setting_screen")

    object EditProfileScreen : Screen(route = "edit_profile_screen")

    object RegisterAsPartnerScreen : Screen(route = "register_as_partner")

    object LocationScreen : Screen(route = "location_screen")

    object NotificationScreen : Screen(route = "notification_screen")

    object OptionsScreen : Screen(route = "options_screen")

    object ProductInfoScreen : Screen(route = "product_info_screen")

    object SearchBrandScreen : Screen(route = "search_brand_screen")

    object SuccessCodeScreen : Screen(route = "success_code_screen")

    object SearchHistoryScreen : Screen(route = "search_history_screen")

}