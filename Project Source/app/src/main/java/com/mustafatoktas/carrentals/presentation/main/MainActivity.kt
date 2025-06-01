package com.mustafatoktas.carrentals.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.mustafatoktas.carrentals.presentation.anasayfa.AnasayfaScreen
import com.mustafatoktas.carrentals.ui.CarRentalsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        setContent {
            CarRentalsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    AnasayfaScreen()
                }
            }
        }
    }
}