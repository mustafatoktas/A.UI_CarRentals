package com.mustafatoktas.carrentals.presentation.anasayfa.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mustafatoktas.carrentals.data.local.bottomBarItems
import com.mustafatoktas.carrentals.ui.Blur
import com.mustafatoktas.carrentals.ui.CarRentalsTheme


@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
) {

    var selectedItemIndex by remember { mutableStateOf(0) }


    Row(
        modifier = modifier
            .clip(RoundedCornerShape(26.dp))
            .padding(vertical = 14.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        bottomBarItems.forEachIndexed { index, item ->
            if (index == selectedItemIndex) {
                Box(
                    modifier = Modifier
                        .size(38.dp)
                        .border(
                            width = 1.dp,
                            color = Color.White,
                            shape = RoundedCornerShape(14.dp)
                        )
                        .clip(RoundedCornerShape(14.dp))
                        .background(Blur),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = Color.White,
                        modifier = Modifier.size(28.dp).clickable {
                            selectedItemIndex = index
                        },
                    )
                }
            } else {
                Icon(
                    imageVector = item.icon,
                    contentDescription = item.title,
                    tint = Color.White,
                    modifier = Modifier.size(28.dp).clickable {
                        selectedItemIndex = index
                    },
                )
            }
        }
    }
}

@Preview
@Composable
private fun BottomBarPreview() {
    CarRentalsTheme {
        BottomBar()
    }
}