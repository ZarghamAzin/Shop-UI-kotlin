package com.example.discount.ui.setting

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.R
import com.example.discount.navigation.Screen
import com.example.discount.ui.setting.components.ProfileBarSection
import com.example.discount.ui.setting.components.RegisterSection
import com.example.discount.ui.setting.components.SettingItem
import com.example.discount.ui.theme.CyanNotification
import com.example.discount.ui.theme.GreenPrivacy
import com.example.discount.ui.theme.Orange
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.util.DefaultSpacer
import com.example.discount.ui.util.DefaultTopActionBar
import com.example.discount.ui.util.PAD_L_R


@Composable
fun SettingScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        DefaultSpacer()

        DefaultTopActionBar(
            icon = Icons.Default.KeyboardArrowLeft,
            title = "Settings",
            iconClick = { navController.popBackStack() })


        Column(
            Modifier
                .fillMaxSize()
                .padding(start = PAD_L_R, end = PAD_L_R, bottom = PAD_L_R)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "Account",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(top = 40.dp, bottom = 30.dp)
            )

            ProfileBarSection(
                title = "Saber ali",
                body = "Personal account",
                profileImage = R.drawable.avatar,
                itemClick = { navController.navigate(Screen.EditProfileScreen.route) }
            )

            RegisterSection(
                title = "Register as partner",
                icon = R.drawable.ic_add,
                tintIcon = PrimaryBlue,
                backgroundIconColor = PrimaryBlue.copy(alpha = 0.2f),
                itemClick = { navController.navigate(Screen.RegisterAsPartnerScreen.route) }
            )

            Text(
                text = "Setting",
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(top = 10.dp, bottom = 0.dp)
            )


            SettingItem(
                title = "Location",
                icon = R.drawable.ic_loacation_setting,
                tintIcon = Orange,
                backgroundIconColor = Orange.copy(alpha = 0.2f),
                itemClick = { navController.navigate(Screen.LocationScreen.route) }
            )

            SettingItem(
                title = "Notification",
                icon = R.drawable.ic_notification,
                tintIcon = CyanNotification,
                backgroundIconColor = CyanNotification.copy(alpha = 0.2f),
                itemClick = { navController.navigate(Screen.NotificationScreen.route) }
            )

            SettingItem(
                title = "Privacy",
                icon = R.drawable.ic_privacy,
                tintIcon = GreenPrivacy,
                backgroundIconColor = GreenPrivacy.copy(alpha = 0.2f),
                itemClick = {}
            )

        }
    }
}