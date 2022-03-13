package com.example.discount.ui.home.components

import com.example.discount.R

data class BrandItem(
    val image: Int,
    val name: String
)

val brandItems = listOf(
    BrandItem(image = R.drawable.logo_asda, name = "Asda"),
    BrandItem(image = R.drawable.logo_asda, name = "Asda"),
    BrandItem(image = R.drawable.logo_spar, name = "Spear"),
    BrandItem(image = R.drawable.logo_countdow, name = "Countdow"),
    BrandItem(image = R.drawable.logo_asda, name = "Asda"),
    BrandItem(image = R.drawable.logo_spar, name = "Spear"),
    BrandItem(image = R.drawable.logo_countdow, name = "Countdow"),
)
