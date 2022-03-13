package com.example.discount.ui.notification

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.navigation.Screen
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.util.DefaultSpacer
import com.example.discount.ui.util.DefaultTopActionBar
import com.example.discount.ui.util.PAD_L_R


@Composable
fun NotificationScreen(navController: NavController) {
    Column {
        var switchChange by remember {
            mutableStateOf(true)

        }
        DefaultSpacer()
        DefaultTopActionBar(title = "Notification", iconClick = { navController.popBackStack() })
        Spacer(modifier = Modifier.height(40.dp))

        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = PAD_L_R, end = 35.dp)
                .clickable { navController.navigate(Screen.OptionsScreen.route) },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column {
                Text(
                    text = "Notify me for Discounts\nin nearby shop",
                    style = MaterialTheme.typography.body2
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur " +
                            "adipiscing elit. Proin viverra",
                    style = MaterialTheme.typography.body1
                )
            }

            Switch(
                checked = switchChange,
                onCheckedChange = { switchChange = it },
                colors = SwitchDefaults.colors(checkedThumbColor = PrimaryBlue)
            )

        }
    }
}