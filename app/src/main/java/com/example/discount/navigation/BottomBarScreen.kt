package com.example.discount.navigation

import com.example.discount.R


sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val unSelectedIcon: Int,
    val selectedIcon: Int
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        unSelectedIcon = R.drawable.ic_home,
        selectedIcon = R.drawable.ic_home_fill
    )

    object Scan : BottomBarScreen(
        route = "scan",
        title = "Scan",
        unSelectedIcon = R.drawable.ic_scan,
        selectedIcon = R.drawable.ic_scan
    )

    object History : BottomBarScreen(
        route = "history",
        title = "History",
        unSelectedIcon = R.drawable.ic_history,
        selectedIcon = R.drawable.ic_history_fill
    )

}
