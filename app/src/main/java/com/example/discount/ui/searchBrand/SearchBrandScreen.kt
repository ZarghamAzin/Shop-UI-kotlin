package com.example.discount.ui.searchBrand

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.ui.searchBrand.components.BrandItem
import com.example.discount.ui.searchBrand.components.searchBrandItem
import com.example.discount.ui.util.DefaultSpacer
import com.example.discount.ui.util.DefaultTopActionBar
import com.example.discount.ui.util.PAD_L_R
import com.example.discount.ui.util.SearchBar


@Composable
fun SearchBrandScreen(navController: NavController) {
    Column {
        DefaultSpacer()
        DefaultTopActionBar(title = "Search Brand", iconClick = { navController.popBackStack() })
        Spacer(modifier = Modifier.height(40.dp))

        Column(
            Modifier
                .fillMaxSize()
                .padding(start = PAD_L_R, end = PAD_L_R)
        ) {
            SearchBar(
                modifier = Modifier.fillMaxWidth(),
                label = "Search for brands",
                onSearch = {}
            )
            Spacer(modifier = Modifier.height(32.dp))
            BrandItem(searchBrandItem)

        }
    }


}