package com.example.discount.ui.notification.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.discount.R
import com.example.discount.ui.location.components.LocationItem
import com.example.discount.ui.notification.NotificationItem
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.theme.PrimaryDark
import com.example.discount.ui.theme.PrimaryGray
import com.example.discount.ui.util.HorizontalLine


@Composable
fun NotificationItem(
    items: List<NotificationItem>
) {
    var selectedChipIndex by remember {
        mutableStateOf(-1)
    }
    LazyColumn {
        itemsIndexed(items) { index, item ->
            val color by animateColorAsState(
                targetValue = if (selectedChipIndex == index) {
                    PrimaryBlue
                } else {
                    PrimaryDark
                },
                animationSpec = tween(durationMillis = 150, easing = LinearEasing)
            )

            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 32.dp)
                    .clickable { selectedChipIndex = index }
            ) {

                Row(
                    modifier = Modifier.align(Alignment.CenterStart),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = item.title,
                            style = MaterialTheme.typography.body2.copy(color = color)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = item.body,
                            style = MaterialTheme.typography.body1.copy(color = PrimaryGray)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                }

                if (selectedChipIndex == index)
                    Icon(
                        modifier = Modifier.align(Alignment.CenterEnd),
                        imageVector = Icons.Default.Done,
                        contentDescription = "done",
                        tint = PrimaryBlue
                    )

                HorizontalLine(Modifier.align(Alignment.BottomCenter))
            }

        }
    }

}