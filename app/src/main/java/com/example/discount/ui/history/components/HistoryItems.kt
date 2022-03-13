package com.example.discount.ui.history.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.discount.ui.history.HistoryItem
import com.example.discount.ui.theme.GreenPrivacy
import com.example.discount.ui.theme.Orange
import com.example.discount.ui.theme.PrimaryDark
import com.example.discount.ui.theme.PrimaryGray
import com.example.discount.ui.util.HorizontalLine


@Composable
fun HistoryItems(items: List<HistoryItem>,onClick:()->Unit) {
    LazyColumn {
        itemsIndexed(items) { index, item ->
            Column(modifier = Modifier.clickable { onClick()}) {
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = item.title, style = MaterialTheme.typography.body2)
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Row {
                        Text(
                            text = "Full Price : ${item.fulPrice}$",
                            style = MaterialTheme.typography.body1.copy(color = PrimaryGray)
                        )
                        Text(
                            text = " | ",
                            style = MaterialTheme.typography.body1.copy(color = PrimaryGray)
                        )
                        Text(
                            text = "Paid : ${item.paid}$",
                            style = MaterialTheme.typography.body1.copy(color = GreenPrivacy)
                        )
                        Text(
                            text = " | ",
                            style = MaterialTheme.typography.body1.copy(color = PrimaryGray)
                        )

                        Text(
                            text = "Saved (${item.saved}$)",
                            style = MaterialTheme.typography.body1.copy(color = Orange)
                        )


                    }
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = "arrow right"
                    )
                }
                Text(
                    text = item.time,
                    style = MaterialTheme.typography.body1.copy(color = PrimaryDark)
                )
                Spacer(modifier = Modifier.height(16.dp))
                HorizontalLine()
            }

        }
    }
}