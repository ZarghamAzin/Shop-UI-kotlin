package com.example.discount.ui.productInfo.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.discount.ui.theme.PrimaryDark


@Composable
fun IconWithText(text: String, icon: Int) {
    Row {
        Icon(painter = painterResource(id = icon), contentDescription = "")
        Spacer(modifier = Modifier.width(17.dp))
        Text(
            text = text, style = MaterialTheme.typography.body1.copy(
                color = PrimaryDark
            )
        )
    }
}