package com.example.discount.ui.notification

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.ui.notification.components.NotificationItem
import com.example.discount.ui.util.DefaultSpacer
import com.example.discount.ui.util.DefaultTopActionBar
import com.example.discount.ui.util.PAD_L_R


@Composable
fun OptionsScreen(navController: NavController) {
    Column {
        DefaultSpacer()
        DefaultTopActionBar(title = "Options", iconClick = { navController.popBackStack() })
        Spacer(modifier = Modifier.height(40.dp))

        Column(
            Modifier
                .fillMaxSize()
                .padding(start = PAD_L_R, end = PAD_L_R)
        ) {
            NotificationItem(items = notificationItems)
        }

    }
}