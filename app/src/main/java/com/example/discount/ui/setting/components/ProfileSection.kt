package com.example.discount.ui.setting.components

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.discount.R
import com.example.discount.ui.theme.Orange
import com.example.discount.ui.util.CircularImage


@Composable
fun ProfileBarSection(
    title: String,
    body: String,
    profileImage: Int,
    itemClick: () -> Unit
) {

    Row(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 32.dp)
            .clickable { itemClick() },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            CircularImage(image = R.drawable.avatar, size = 56.dp)
            Spacer(modifier = Modifier.width(24.dp))

            Column {
                Text(text = title, style = MaterialTheme.typography.body2)
                Text(text = body, style = MaterialTheme.typography.body2.copy(color = Orange))
            }
        }


        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = "arraw"
        )


    }

}