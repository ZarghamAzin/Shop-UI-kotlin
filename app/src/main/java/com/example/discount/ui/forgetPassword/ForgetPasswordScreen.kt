package com.example.discount.ui.forgetPassword

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
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
import com.example.discount.navigation.Screen
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.theme.PrimaryDark
import com.example.discount.ui.theme.PrimaryGray
import com.example.discount.ui.util.*


@Composable
fun ForgetPasswordScreen(navController: NavController) {


        Column(
            Modifier
                .fillMaxSize()
                .padding(start = PAD_L_R, end = PAD_L_R)
                .verticalScroll(rememberScrollState())
        ) {
            DefaultSpacer()
            IconButton(onClick = {navController.popBackStack()}) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "",
                    modifier = Modifier
                        .border(
                            width = 0.5.dp, color = Color.LightGray,
                            CircleShape
                        )
                        .padding(12.dp),
                    tint = Color.Unspecified
                )
            }
            Spacer(modifier = Modifier.height(100.dp))


        Text(text = "Forget password!", style = MaterialTheme.typography.h1)
        Text(
            text = "Please enter your email\nto reset your password",
            style = MaterialTheme.typography.h2.copy(color = PrimaryGray)
        )
            Spacer(modifier = Modifier.height(48.dp))
        DefaultTextField(
            modifier = Modifier
                .fillMaxWidth(),
            label = "Email address",
            imeAction = ImeAction.Done,
            keyboardType = KeyboardType.Email,
            isLastItem = true,
            textStyle = MaterialTheme.typography.body1.copy(color = PrimaryDark)
        )
        Spacer(modifier = Modifier.height(24.dp))
        DefaultButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Log in",
            textStyle = MaterialTheme.typography.h1.copy(color = Color.White, fontSize = 16.sp),
            verticalPad = 19.dp
        ) {
            navController.navigate(Screen.SuccessCodeScreen.route)
        }
        Spacer(modifier = Modifier.height(24.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Remember password ?",
                style = MaterialTheme.typography.body2.copy(fontSize = 14.sp, color = PrimaryGray)
            )
            Spacer(modifier = Modifier.width(2.dp))
            Text(
                modifier = Modifier.clickable { navController.popBackStack() },
                text = "Sign in",
                style = MaterialTheme.typography.body2.copy(fontSize = 14.sp, color = PrimaryBlue)
            )

        }


        }


}