package com.example.discount.ui.productInfo.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.discount.ui.theme.PrimaryDark


@Composable
fun ItemSpaceBetween(productName: String, price: String,fontSize:TextUnit = 14.sp) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(top = 2.dp, bottom = 2.dp), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = productName, style = MaterialTheme.typography.body1.copy(color = PrimaryDark, fontSize = fontSize))
        Text(text = "${price}$", style = MaterialTheme.typography.body1.copy(color = PrimaryDark))
    }

}