package com.example.discount.ui.history

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.R
import com.example.discount.navigation.Screen
import com.example.discount.ui.history.components.HistoryItems
import com.example.discount.ui.theme.PrimaryDark
import com.example.discount.ui.util.*


@Composable
fun HistoryScreen(navController: NavController) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(start = PAD_L_R, end = PAD_L_R)
    ) {
        DefaultSpacer()
        Text(text = "History", style = MaterialTheme.typography.h1)
        Spacer(modifier = Modifier.height(32.dp))

        Row(
            modifier = Modifier
                .clickable { navController.navigate(Screen.SearchHistoryScreen.route) }
                .fillMaxWidth()
                .border(
                    width = 0.5.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(15)
                )
                .padding(vertical = 16.dp, horizontal = 16.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                "search",
                tint = Color.LightGray
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Search purchase history", style = MaterialTheme.typography.body1)
            }

        }


        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "This Week", style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.height(8.dp))
        HistoryItems(historyItems) { navController.navigate(Screen.ProductInfoScreen.route) }
        //Spacer(modifier = Modifier.height(32.dp))
        // Text(text = "This Month", style = MaterialTheme.typography.body1)
        // Spacer(modifier = Modifier.height(8.dp))
        // HistoryItems(historyItems)

    }

}