package com.example.discount.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.R
import com.example.discount.navigation.Screen
import com.example.discount.ui.home.components.*
import com.example.discount.ui.util.DefaultSpacer


@Composable
fun HomeScreen(navController: NavController) {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(
                rememberScrollState()
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DefaultSpacer()
        RegisterAsPartnerSection(navController)
        Spacer(modifier = Modifier.height(20.dp))
        ProfileBarSection(
            title = "",
            body = "",
            profileImage = R.drawable.avatar,
            searchClick = { navController.navigate(Screen.SearchBrandScreen.route) },
            profileClick = { navController.navigate(Screen.SettingScreen.route) }
        )
        Spacer(modifier = Modifier.height(20.dp))

        BrandListSection(brandItems)

        Spacer(modifier = Modifier.height(20.dp))

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            PagerSection()
        }
    }
}