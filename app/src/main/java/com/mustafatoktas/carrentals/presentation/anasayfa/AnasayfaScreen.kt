package com.mustafatoktas.carrentals.presentation.anasayfa

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import com.mustafatoktas.carrentals.presentation.anasayfa.components.BottomBar
import com.mustafatoktas.carrentals.presentation.anasayfa.components.CarList
import com.mustafatoktas.carrentals.presentation.anasayfa.components.Pager
import com.mustafatoktas.carrentals.presentation.anasayfa.components.TopBar
import com.mustafatoktas.carrentals.ui.Blur
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.HazeStyle
import dev.chrisbanes.haze.haze
import dev.chrisbanes.haze.hazeChild


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnasayfaScreen(
    modifier: Modifier = Modifier
) {
    val hazeState = remember { HazeState() }
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
        state = rememberTopAppBarState()
    )


    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection)
            .background(MaterialTheme.colorScheme.background),
        containerColor = Color.Transparent,
        topBar = {
            Column {
                TopBar(
                    modifier = Modifier
                        .hazeChild(state = hazeState),
                    scrollBehavior = scrollBehavior,
                )
                Pager(
                    modifier = Modifier
                        .fillMaxWidth()
                        .hazeChild(state = hazeState),
                )
            }

        }
    ) { innerPadding ->

        Box(
            modifier = modifier
        ) {
            CarList(
                modifier = Modifier
                    .fillMaxSize()
                    .haze(
                        state = hazeState,
                        style = HazeStyle(
                            blurRadius = 13.dp, tint = Blur
                        )
                    ),
                paddingValues = innerPadding
            )

            BottomBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 26.dp)
                    .align(Alignment.BottomStart)
                    .padding(bottom = 26.dp)
                    .hazeChild(
                        state = hazeState,
                        shape = RoundedCornerShape(26.dp)
                    )
            )
        }
    }
}