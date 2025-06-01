package com.mustafatoktas.carrentals.presentation.anasayfa.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mustafatoktas.carrentals.data.local.luksArabalar
import com.mustafatoktas.carrentals.ui.CarRentalsTheme


@Composable
fun CarList(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(
            top = paddingValues.calculateTopPadding() + 22.dp,
            bottom = 90.dp
        )
    ) {

        itemsIndexed(luksArabalar) { index, car ->
            CarItem(
                car = car,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
                    .clickable {},
            )
            Spacer(modifier = Modifier.height(22.dp))
        }

    }
}

@Preview
@Composable
private fun CarListPreview() {
    CarRentalsTheme {
        CarList(paddingValues = PaddingValues(2.dp))
    }
}