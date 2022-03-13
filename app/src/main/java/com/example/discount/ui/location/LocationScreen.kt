package com.example.discount.ui.location

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.ui.location.components.LocationItemSection
import com.example.discount.ui.location.components.locationItems
import com.example.discount.ui.util.*


@Composable
fun LocationScreen(navController: NavController) {
    Column {
        DefaultSpacer()
        DefaultTopActionBar(title = "Location", iconClick = { navController.popBackStack() })

        Column(
            Modifier
                .fillMaxSize()
                .padding(start = PAD_L_R, end = PAD_L_R)
        ) {

            Spacer(modifier = Modifier.height(35.dp))
            SearchBar(modifier = Modifier.fillMaxWidth(), label = "Search for location") {}
            Spacer(modifier = Modifier.height(24.dp))
            LocationItemSection(locationItems)

        }

    }
}