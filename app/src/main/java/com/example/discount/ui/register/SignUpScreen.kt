package com.example.discount.ui.register

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.discount.navigation.Screen
import com.example.discount.ui.register.components.EmailField
import com.example.discount.ui.register.components.PasswordField
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.theme.PrimaryGray
import com.example.discount.ui.util.DefaultButton


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SignUpScreen(navController: NavController, navigateToHomeScreen: () -> Unit) {

    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(start = 16.dp, end = 16.dp, top = 97.dp)
    ) {
        Text(
            text = "Welcome!",
            style = MaterialTheme.typography.h1
        )
        Text(
            text = "Get started by \nCreating into your account",
            style = MaterialTheme.typography.h1.copy(
                color = PrimaryGray,
                fontWeight = FontWeight(400),
                fontSize = 20.sp
            )
        )
        Spacer(modifier = Modifier.height(50.dp))

        EmailField(
            Modifier
                .fillMaxWidth()
                .height(60.dp),
            label = "Email address"
        )

        Spacer(modifier = Modifier.height(16.dp))

        PasswordField(
            Modifier
                .fillMaxWidth()
                .height(60.dp),
            label = "Password",
            imeAction = ImeAction.Next
        )

        Spacer(modifier = Modifier.height(16.dp))

        PasswordField(
            Modifier
                .fillMaxWidth()
                .height(60.dp),
            label = "Confirm password",
            isLastItem = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        DefaultButton(
            modifier = Modifier.fillMaxWidth().height(60.dp),
            text = "Create an account",
            textStyle = MaterialTheme.typography.body2.copy(color = Color.White),
            buttonColor = PrimaryBlue,
            onClick = navigateToHomeScreen
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Already have an account ?",
                style = MaterialTheme.typography.body2.copy(color = PrimaryGray)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                modifier = Modifier.clickable { navController.navigate(Screen.SignInScreen.route) },
                text = "Sign in",
                style = MaterialTheme.typography.body2.copy(color = PrimaryBlue)
            )
        }
    }


}