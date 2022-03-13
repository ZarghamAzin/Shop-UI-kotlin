package com.example.discount.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.navigation.Screen
import com.example.discount.ui.theme.PrimaryBlue


@Composable
fun RegisterAsPartnerSection(navController: NavController) {

    Row(
        Modifier
            .fillMaxWidth()
            .clickable { navController.navigate(Screen.RegisterAsPartnerScreen.route) }
            .background(PrimaryBlue)
            .padding(vertical = 12.dp)
        ,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append("Register ")
                }

                append("as partner")
            },
            style = MaterialTheme.typography.body2.copy(color = Color.White)
        )

    }

}