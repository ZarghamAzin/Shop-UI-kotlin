package com.example.discount.ui.home.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.discount.ui.theme.PrimaryDark


@Composable
fun BrandListSection(brandItems: List<BrandItem>,modifier:Modifier = Modifier) {

    LazyRow(contentPadding = PaddingValues(start = 16.dp, end = 16.dp), modifier = modifier) {

        items(count = brandItems.size) { index ->
            Item(brandItems[index])
        }

    }

}

@Composable
fun Item(brandItem: BrandItem) {

    Column(horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.padding(start = 12.dp, end = 12.dp)) {
        Icon(
            modifier = Modifier.clickable {  }
                .border(
                    width = 0.5.dp, color = Color.LightGray,
                    RoundedCornerShape(15)
                ).padding(horizontal = 6.dp, vertical = 6.dp)
                .size(40.dp),
            painter = painterResource(id = brandItem.image),
            contentDescription = "logo",
            tint = Color.Unspecified
        )

        Spacer(modifier = Modifier.height(13.dp))

        Text(
            text = brandItem.name,
            style = MaterialTheme.typography.body2.copy(color = PrimaryDark, fontSize = 12.sp)
        )

    }

}