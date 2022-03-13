package com.example.discount.ui.scan.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.discount.R
import com.example.discount.ui.theme.PrimaryBlue


@Composable
fun CodeSection() {

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(64.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Generate QR code", style = MaterialTheme.typography.body2)
            Text(
                text = "Refresh",
                style = MaterialTheme.typography.body2.copy(color = PrimaryBlue),
                modifier = Modifier.clickable { })

        }
        Text(text = "Generated barcode for shopkeeper", style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.height(100.dp))
        Image(
            painter = painterResource(id = R.drawable.qr),
            contentDescription = "qr code img",
            modifier = Modifier
                .size(
                    200.dp
                )
                .align(Alignment.CenterHorizontally)
        )
    }
}