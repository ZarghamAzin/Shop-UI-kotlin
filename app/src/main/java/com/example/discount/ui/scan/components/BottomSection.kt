package com.example.discount.ui.scan.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.navigation.BottomBarScreen
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.theme.PrimaryDark


@Composable
fun BottomSection(selected: MutableState<Int>, navController: NavController) {

    BottomAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .clip(RoundedCornerShape(15)),
        backgroundColor = Color.LightGray.copy(0.3f),
        cutoutShape = RoundedCornerShape(15),
        elevation = 0.dp
    ) {

        Row(Modifier.fillMaxWidth()) {
            val itemNames = listOf("Scan", "Code", "Card")

            for ((index, item) in itemNames.withIndex()) {
                TextButton(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp)
                        .background(
                            color = if (index == selected.value) PrimaryBlue else Color.Unspecified,
                            RoundedCornerShape(25)
                        )
                        .padding(5.dp),
                    onClick = {
                        if (index == 0 && index != selected.value) {
                            //Temporary bug fix
                            navController.popBackStack()
                            navController.navigate(BottomBarScreen.Scan.route)
                        }

                        selected.value = index
                    }
                ) {
                    Text(
                        text = item,
                        style = MaterialTheme.typography.body2.copy(color = if (selected.value == index) Color.White else PrimaryDark)
                    )
                }
            }

        }

    }

}