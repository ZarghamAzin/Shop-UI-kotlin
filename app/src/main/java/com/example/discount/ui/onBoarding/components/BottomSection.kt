package com.example.discount.ui.onBoarding.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.util.DefaultButton


@Composable
fun BottomSection(
    modifier: Modifier = Modifier,
    nextButtonName: String,
    onNextClicked: () -> Unit,
    onSkipClicked: () -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        if (nextButtonName != "Start")
            DefaultButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(
                        horizontal = 20.dp, vertical = 16.dp
                    )
                    .border(width = 1.dp, color = Color.LightGray, shape = RoundedCornerShape(15))
                    .height(55.dp),
                text = "Skip",
                onClick = onSkipClicked,
                buttonColor = Color.Transparent,
                textStyle = MaterialTheme.typography.h1.copy(color = Color.Black, fontSize = 16.sp)
            )
        DefaultButton(
            modifier = Modifier
                .weight(1f)
                .padding(
                    horizontal = 20.dp, vertical = 16.dp
                ).height(55.dp),
            text = nextButtonName,
            onClick = onNextClicked,
            textStyle = MaterialTheme.typography.h1.copy(color = Color.White, fontSize = 16.sp)
        )
    }

}