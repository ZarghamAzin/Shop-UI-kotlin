package com.example.discount.ui.editProfile

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.discount.R
import com.example.discount.ui.util.*


@Composable
fun EditProfileScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        DefaultSpacer()
        DefaultTopActionBar(
            icon = Icons.Default.KeyboardArrowLeft,
            title = "Edit profile",
            iconClick = { navController.popBackStack() }
        )

        Column(
            Modifier
                .fillMaxSize()
                .padding(start = PAD_L_R, end = PAD_L_R)
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(35.dp))
            Box(
                modifier = Modifier.align(
                    Alignment.CenterHorizontally,
                )

            ) {
                CircularImage(image = R.drawable.avatar, size = 90.dp)
                EditSection(size = 35.dp, modifier = Modifier.align(Alignment.BottomEnd))
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Saber Ali",
                style = MaterialTheme.typography.body2.copy(fontSize = 24.sp),
                modifier = Modifier.align(
                    Alignment.CenterHorizontally
                )
            )

            Spacer(modifier = Modifier.height(40.dp))
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.LightGray)
            ) {}

            Spacer(modifier = Modifier.height(40.dp))

            DefaultTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                label = "Full name",
                imeAction = ImeAction.Next
            )

            Spacer(modifier = Modifier.height(16.dp))


            DefaultTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                label = "Email address",
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Email,
                isLastItem = true
            )

            Spacer(modifier = Modifier.height(20.dp))


            DefaultButton(
                modifier = Modifier.fillMaxWidth(),
                text = "Save",
                textStyle = MaterialTheme.typography.body2.copy(
                    color = Color.White,
                    fontSize = 16.sp
                ),
                onClick = {},
                verticalPad = 16.dp
            )

            Spacer(modifier = Modifier.height(16.dp))

            DefaultButton(
                modifier = Modifier
                    .padding(bottom = 40.dp)
                    .fillMaxWidth()
                    .border(
                        width = 0.5.dp,
                        color = Color.LightGray,
                        shape = RoundedCornerShape(15)
                    ),
                text = "Cancel",
                textStyle = MaterialTheme.typography.body2.copy(
                    color = Color.Black,
                    fontSize = 16.sp
                ),
                buttonColor = Color.Transparent,
                verticalPad = 16.dp,
                onClick = {}
            )

        }
    }

}
