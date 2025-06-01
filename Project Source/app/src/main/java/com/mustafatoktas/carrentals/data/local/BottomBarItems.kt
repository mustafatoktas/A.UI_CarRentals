package com.mustafatoktas.carrentals.data.local

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.LibraryBooks
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Settings
import com.mustafatoktas.carrentals.domain.model.BottomBarItem

val bottomBarItems = listOf(
    BottomBarItem(
        title = "Home",
        icon = Icons.Rounded.Home,
        seciliMi = false
    ),
    BottomBarItem(
        title = "Account",
        icon = Icons.Rounded.AccountBox,
        seciliMi = true
    ),
    BottomBarItem(
        title = "Analytics",
        icon = Icons.AutoMirrored.Rounded.LibraryBooks,
        seciliMi = false
    ),
    BottomBarItem(
        title = "Settings",
        icon = Icons.Rounded.Settings,
        seciliMi = false
    ),
)