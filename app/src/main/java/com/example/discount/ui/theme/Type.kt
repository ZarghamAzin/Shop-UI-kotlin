package com.example.discount.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.discount.R


// Set of Material typography styles to start with

/*val PrimaryTextStyle = TextStyle(
    fontFamily = FontFamily(Font(R.font.axiforma)),
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    color = Color.Black
)*/

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.axiforma)),
        fontWeight = FontWeight(700),
        fontStyle = FontStyle.Normal,
        fontSize = 27.sp,
        color = Color.Black
    ),
    h2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.axiforma)),
        fontWeight = FontWeight(600),
        fontStyle = FontStyle.Normal,
        fontSize = 24.sp,
        color = Color.Black
    ),
    body1 = TextStyle(
        fontFamily = FontFamily(Font(R.font.axiforma)),
        fontWeight = FontWeight(400),
        fontStyle = FontStyle.Normal,
        fontSize = 14.sp,
        color = PrimaryGray,
        lineHeight = 24.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily(Font(R.font.axiforma)),
        fontWeight = FontWeight(700),
        fontStyle = FontStyle.Normal,
        fontSize = 16.sp,
        color = Color.Black,
        lineHeight = 24.sp
    )

)