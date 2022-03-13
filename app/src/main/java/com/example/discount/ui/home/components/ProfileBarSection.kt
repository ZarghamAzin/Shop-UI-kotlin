package com.example.discount.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.discount.R


@Composable
fun ProfileBarSection(
    modifier: Modifier = Modifier,
    title: String,
    body: String,
    profileImage: Int,
    searchClick:()->Unit,
    profileClick:()->Unit
) {

    Row(
        modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
        ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = profileImage),
                contentDescription = "profile",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clickable {  profileClick() }
                    .clip(CircleShape)
                    .size(56.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(text = title, style = MaterialTheme.typography.body1)
                Text(text = body, style = MaterialTheme.typography.body2)
            }
        }

        IconButton(
            onClick = { searchClick()},
            modifier = Modifier.border(
                width = 0.5.dp,
                color = Color.LightGray,
                RoundedCornerShape(15)
            )
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "search"
            )
        }

    }

}