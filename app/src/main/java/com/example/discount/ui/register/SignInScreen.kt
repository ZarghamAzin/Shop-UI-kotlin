package com.example.discount.ui.register

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.discount.navigation.Screen
import com.example.discount.ui.register.components.EmailField
import com.example.discount.ui.register.components.PasswordField
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.theme.PrimaryGray
import com.example.discount.ui.util.DefaultButton



@Composable
fun SignInScreen(navController: NavController,navigateToHome:()->Unit) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp, top = 97.dp)
            .verticalScroll(rememberScrollState())

    ) {
        Text(
            text = "Welcome Back!",
            style = MaterialTheme.typography.h1
        )
        Text(
            text = "Get started by \nLoggin into your account",
            style = MaterialTheme.typography.h1.copy(
                color = PrimaryGray,
                fontWeight = FontWeight(400),
                fontSize = 20.sp
            )
        )
        Spacer(modifier = Modifier.height(50.dp))

        EmailField(
            Modifier
                .fillMaxWidth().padding(vertical = 16.dp),
            label = "Email address"
        )

        Spacer(modifier = Modifier.height(16.dp))

        PasswordField(
            Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            label = "Password",
            isLastItem = true
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Forgot Password?",
            modifier = Modifier
                .clickable {navController.navigate(Screen.ForgetPasswordScreen.route) }
                .align(Alignment.End),
            style = MaterialTheme.typography.body2.copy(color = PrimaryBlue)
        )

        Spacer(modifier = Modifier.height(16.dp))

        DefaultButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Log in",
            textStyle = MaterialTheme.typography.body2.copy(color = Color.White),
            buttonColor = PrimaryBlue,
            onClick = navigateToHome,
            verticalPad = 19.dp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Don't have an account ?",
                style = MaterialTheme.typography.body2.copy(color = PrimaryGray)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                modifier = Modifier.clickable { navController.navigate(Screen.SignUpScreen.route) },
                text = "Sign Up",
                style = MaterialTheme.typography.body2.copy(color = PrimaryBlue)
            )
        }
    }

}