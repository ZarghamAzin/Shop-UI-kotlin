package com.example.discount.ui.searchBrand.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.discount.R
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.theme.PrimaryDark
import com.example.discount.ui.theme.PrimaryGray
import com.example.discount.ui.util.HorizontalLine

@Composable
fun BrandItem(items: List<BrandItemInSearchBrand>) {
    LazyColumn {
        itemsIndexed(items) { index, item ->

            Box(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 32.dp)
                    .clickable {}
            ) {
                Row(
                    modifier = Modifier.align(Alignment.CenterStart),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .border(
                                width = 0.5.dp,
                                color = Color.LightGray,
                                RoundedCornerShape(15)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = item.icon),
                            contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.size(35.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(24.dp))

                    Column {
                        Text(
                            text = item.title,
                            style = MaterialTheme.typography.body2.copy(color = PrimaryDark)
                        )
                        Text(
                            text = item.body,
                            style = MaterialTheme.typography.body1.copy(color = PrimaryGray)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        HorizontalLine()
                    }
                }

            }

        }
    }

}