package com.example.discount.ui.registerAsPartner

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.discount.ui.util.*


@Composable
fun RegisterAsPartnerScreen(navController: NavController) {
    Column {
        DefaultSpacer()
        DefaultTopActionBar(
            icon = Icons.Default.KeyboardArrowLeft,
            title = "Register as partner",
            iconClick = { navController.popBackStack() }
        )
        Spacer(modifier = Modifier.height(35.dp))

        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(start = PAD_L_R, end = PAD_L_R)
        ) {
            DefaultTextField(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 16.dp), label = "Company Name",
                imeAction = ImeAction.Next
            )
            DefaultTextField(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 16.dp), label = "Company Email",
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Email
            )
            DefaultTextField(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 16.dp), label = "Phone Number",
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Phone
            )
            DefaultTextField(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 16.dp), label = "your Name",
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Text,
                isLastItem = true
            )
            Spacer(modifier = Modifier.height(20.dp))

            DefaultButton(
                modifier = Modifier.fillMaxWidth(),
                text = "Submit",
                textStyle = MaterialTheme.typography.body2.copy(
                    color = Color.White,
                    fontSize = 16.sp
                ),
                verticalPad = 24.dp
            ) {

            }

        }
    }
}