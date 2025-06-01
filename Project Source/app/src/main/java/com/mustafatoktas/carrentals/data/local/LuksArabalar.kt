package com.mustafatoktas.carrentals.data.local

import androidx.compose.ui.graphics.Color
import com.mustafatoktas.carrentals.R
import com.mustafatoktas.carrentals.domain.model.Car
import com.mustafatoktas.carrentals.ui.Primary
import com.mustafatoktas.carrentals.ui.Secondary

val luksArabalar = listOf(
    Car(
        name = "Ferrari SF90 Stradale",
        image = R.drawable.car_ferrari,
        color = Color.Red,
        logo = R.drawable.logo_ferrari,
        oneri = 97,
        oneriOrani = 4.8f,
        kiralamaGun = 7,
        fiyat = 759,
        onerenler = listOf(
            R.drawable.m_2, R.drawable.w_1, R.drawable.w_2
        ),
        bgColor = Primary
    ),
    Car(
        name = "Rolls-Royce Phantom",
        image = R.drawable.car_rolls_royce,
        color = Color.Black,
        logo = R.drawable.logo_rolls_royce,
        oneri = 98,
        oneriOrani = 4.7f,
        kiralamaGun = 10,
        fiyat = 799,
        onerenler = listOf(
            R.drawable.m_1, R.drawable.w_2, R.drawable.m_3
        ),
        bgColor = Secondary
    ),
    Car(
        name = "Porsche 911 Turbo S",
        image = R.drawable.car_porsche,
        color = Color.Yellow,
        logo = R.drawable.logo_porsche,
        oneri = 99,
        oneriOrani = 4.8f,
        kiralamaGun = 6,
        fiyat = 689,
        onerenler = listOf(
            R.drawable.m_3, R.drawable.w_1, R.drawable.m_1
        ),
        bgColor = Primary
    ),
    Car(
        name = "Lamborghini Aventador",
        image = R.drawable.car_lamborghini,
        color = Color.White,
        logo = R.drawable.lamborghini_logo,
        oneri = 97,
        oneriOrani = 4.9f,
        kiralamaGun = 5,
        fiyat = 649,
        onerenler = listOf(
            R.drawable.w_1, R.drawable.w_2, R.drawable.m_2
        ),
        bgColor = Secondary
    )
)