package com.example.discount.ui.onBoarding

import com.example.discount.R

data class OnBoardingItem(
    val image: Int,
    val title: String,
    val description: String
)

val onBoardingItems = listOf(
    OnBoardingItem(
        image = R.drawable.onboard,
        title = "Get Discount now \nwithout any card!",
        description = "Get an overview of how you are performing \nand motivate yourself to achieve even moew."
    ),
    OnBoardingItem(
        image = R.drawable.onboard,
        title = "Get Discount now \nwithout any card!",
        description = "Get an overview of how you are performing \nand motivate yourself to achieve even moew."
    ),
    OnBoardingItem(
        image = R.drawable.onboard,
        title = "Get Discount now \nwithout any card!",
        description = "Get an overview of how you are performing \nand motivate yourself to achieve even moew."
    )
)