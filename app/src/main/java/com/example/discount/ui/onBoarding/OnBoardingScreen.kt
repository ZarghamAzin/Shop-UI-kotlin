package com.example.discount.ui.onBoarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.navigation.Screen
import com.example.discount.ui.onBoarding.components.BottomSection
import com.example.discount.ui.onBoarding.components.Indicators
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch


@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingScreen(navController: NavController) {
    val scope = rememberCoroutineScope()
    val items = onBoardingItems
    val state = rememberPagerState(pageCount = items.size)
    var nextButtonName by remember {
        mutableStateOf("Next")
    }

    Column(
        Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp, bottom = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        HorizontalPager(state = state) { page ->
            nextButtonName = if (state.currentPage + 1 < items.size) "Next" else "Start"
            OnBoardingItem(items[page])
        }
        Spacer(modifier = Modifier.height(38.dp))

        Indicators(items.size, state.currentPage, modifier = Modifier)

        Spacer(modifier = Modifier.height(45.dp))

        BottomSection(
            nextButtonName = nextButtonName,
            onNextClicked = {
                if (state.currentPage + 1 < items.size) {

                    scope.launch {
                        state.animateScrollToPage(state.currentPage + 1)
                    }
                } else {
                    navController.navigate(Screen.SignInScreen.route)
                }

            },
            onSkipClicked = {
                navController.navigate(Screen.SignInScreen.route)
            }
        )
    }


}


@Composable
fun OnBoardingItem(
    item: OnBoardingItem
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(item.image),
            contentDescription = "image onBoarding",
            modifier = Modifier
                .size(200.dp)
        )

        Spacer(modifier = Modifier.height(100.dp))

        Text(
            text = item.title,
            style = MaterialTheme.typography.h2
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = item.description,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.body1
        )
    }
}