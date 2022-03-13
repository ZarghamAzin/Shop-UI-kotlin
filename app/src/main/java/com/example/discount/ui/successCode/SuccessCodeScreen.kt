package com.example.discount.ui.successCode

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.R
import com.example.discount.ui.util.DefaultButton
import com.example.discount.ui.util.DefaultSpacer
import com.example.discount.ui.util.PAD_L_R


@Composable
fun SuccessCodeScreen(navController: NavController) {

    Column(
        Modifier
            .fillMaxSize()
            .padding(start = PAD_L_R, end = PAD_L_R)
            .verticalScroll(
                rememberScrollState()
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DefaultSpacer()
        IconButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier.align(Alignment.Start)
        ) {
            Icon(
                imageVector = Icons.Default.Close, contentDescription = "",
                modifier = Modifier
                    .border(
                        width = 0.5.dp, color = Color.LightGray,
                        CircleShape
                    )
                    .padding(12.dp),
                tint = Color.Unspecified
            )
        }
        Spacer(modifier = Modifier.height(134.dp))

        Image(
            painter = painterResource(id = R.drawable.shield),
            contentDescription = "",
            modifier = Modifier.size(
                120.dp
            )
        )

        Text(text = "Code sent successfully!", style = MaterialTheme.typography.h1)
        Text(
            text = "Please check your email to reset\nthe password",
            style = MaterialTheme.typography.body1
        )

        Spacer(modifier = Modifier.height(24.dp))
        DefaultButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Okay",
            textStyle = MaterialTheme.typography.body2.copy(color = Color.White),
            verticalPad = 19.dp
        ) {
            navController.popBackStack()
            navController.popBackStack()
        }

    }
}