package com.mustafatoktas.carrentals.domain.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color


data class Car(
    val name: String,
    @DrawableRes val image: Int,
    val color: Color,
    @DrawableRes val logo: Int,
    val oneri: Int,
    val oneriOrani: Float,
    val kiralamaGun: Int,
    val fiyat: Int,
    val onerenler: List<Int>,
    val bgColor: Color
)