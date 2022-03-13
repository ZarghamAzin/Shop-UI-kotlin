package com.example.discount.ui.scan

import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.discount.ui.scan.components.*
import com.example.discount.ui.util.DefaultTopActionBar


@Composable
fun ScanScreen(navController: NavController) {
    val context = LocalContext.current
    val selected = remember {
        mutableStateOf(0)
    }

    Scaffold(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 25.dp, bottom = 25.dp),
        topBar = {
            DefaultTopActionBar(
                icon = Icons.Default.Close,
                title = "Scan code",
                iconClick = { navController.popBackStack() })
        },
        bottomBar = { BottomSection(selected, navController) }
    ) {


        when (selected.value) {

            0 -> ScanSection(ProcessCameraProvider.getInstance(context))


            1 -> CodeSection()


            2 -> CardSection()


        }
    }

}