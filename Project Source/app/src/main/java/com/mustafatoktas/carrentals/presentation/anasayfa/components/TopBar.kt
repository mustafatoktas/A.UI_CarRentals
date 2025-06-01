package com.mustafatoktas.carrentals.presentation.anasayfa.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Mic
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafatoktas.carrentals.ui.CarRentalsTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior,
) {
    TopAppBar(
        scrollBehavior = scrollBehavior,
        modifier = modifier
            .padding(top = 10.dp)
            .border(
                width = 1.dp,
                color = Color.White,
                shape = RoundedCornerShape(100.dp)
            ),
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent,
            scrolledContainerColor = Color.Transparent
        ),
        title = {
            Text(
                text = "Trending new cars",
                fontSize = 18.sp,
                color = Color.White,
            )

        },
        navigationIcon = {
            IconButton(
                onClick = {

                }
            ) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(28.dp),
                )
            }
        },
        actions = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.Rounded.Mic,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(28.dp),
                )
            }
        },

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
private fun TopBarPreview() {
    CarRentalsTheme {
        TopBar(scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior())
    }
}