package com.example.discount.ui.setting.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SettingItem(
    title: String,
    icon: Int,
    iconSize: Dp = 24.dp,
    backgroundIconColor: Color,
    tintIcon: Color,
    itemClick: () -> Unit
) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
            .clickable { itemClick() },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {

            Box(
                modifier = Modifier
                    .size(56.dp)
                    .background(backgroundIconColor, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = title,
                    modifier = Modifier
                        .size(iconSize),
                    tint = tintIcon
                )
            }
            Spacer(modifier = Modifier.width(24.dp))
            Text(text = title, style = MaterialTheme.typography.body2)
        }


        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = "arrow right"
        )


    }

}