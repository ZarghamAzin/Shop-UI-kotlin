package com.example.discount.ui.searchHistory

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.ui.util.DefaultSpacer
import com.example.discount.ui.util.DefaultTopActionBar
import com.example.discount.ui.util.PAD_L_R
import com.example.discount.ui.util.SearchBar

@Composable
fun SearchHistoryScreen(navController: NavController) {
    Column {
        DefaultSpacer()
        DefaultTopActionBar(title = "History") {
            navController.popBackStack()
        }
        Spacer(modifier = Modifier.height(32.dp))
        SearchBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = PAD_L_R, end = PAD_L_R),
            label ="Search purchase history",
            onSearch ={}
        )

    }


}