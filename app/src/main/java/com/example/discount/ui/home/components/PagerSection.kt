package com.example.discount.ui.home.components

import com.example.discount.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue

/*
LaunchedEffect(Unit) {
    pagerState.scrollToPage(1)
}
*/


@OptIn(ExperimentalPagerApi::class)
@Preview
@Composable
fun PagerSection(modifier: Modifier = Modifier) {
    val items = listOf(
        R.drawable.ad_1,
        R.drawable.ad_2,
        R.drawable.ad_3
    )
    val pagerState = rememberPagerState(pageCount = items.size)

    HorizontalPager(
        state = pagerState,
        itemSpacing = 30.dp
    ) { page ->
        Card(modifier = modifier
            .fillMaxWidth(0.6f)
            .height(400.dp)
            .padding(horizontal = 1.dp)
            .graphicsLayer {
                val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue

                lerp(
                    start = 1f.dp,
                    stop = 1.3.dp,
                    fraction = (1f - pageOffset.coerceIn(0f, 1f)).toFloat()
                ).also {
                    scaleX = it.value
                    scaleY = it.value
                }

            }
            .fillMaxWidth()
            .padding(25.dp, 50.dp, 25.dp, 70.dp),
            shape = RoundedCornerShape(15)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
                    .align(Alignment.Center)
            ) {
                Image(

                    painter = painterResource(
                        id = items[page]
                    ),
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }


}