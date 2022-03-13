package com.example.discount.ui.util


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.*

import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.discount.R
import com.example.discount.ui.theme.PrimaryBlue
import com.example.discount.ui.theme.PrimaryDark


@Composable
fun DefaultButton(
    modifier: Modifier,
    text: String,
    shape: RoundedCornerShape = RoundedCornerShape(15),
    textStyle: TextStyle,
    buttonColor: Color = PrimaryBlue,
    verticalPad: Dp = 0.dp,
    horizontalPad: Dp = 0.dp,
    onClick: () -> Unit
) {

    Box(
        modifier = modifier
            .background(color = buttonColor, shape = shape)
            .clickable { onClick() }
            .padding(vertical = verticalPad, horizontal = horizontalPad),
        contentAlignment = Alignment.Center
    ) {
        Text(text = text, style = textStyle)
    }


}

@Composable
fun DefaultSpacer(modifier: Modifier = Modifier.height(30.dp)) {
    Spacer(modifier = modifier)
}

@Composable
fun DefaultTopActionBar(
    icon: ImageVector = Icons.Default.KeyboardArrowLeft,
    title: String,
    iconClick: () -> Unit
) {
    TopAppBar(
        modifier = Modifier.padding(start = PAD_L_R, end = PAD_L_R),
        backgroundColor = Color.White,
        title = {
            Text(
                text = title,
                style = MaterialTheme.typography.body2
            )
        },
        elevation = 0.dp,
        navigationIcon = {
            IconButton(onClick = iconClick) {
                Icon(
                    imageVector = icon, contentDescription = title,
                    modifier = Modifier
                        .border(
                            width = 0.5.dp, color = Color.LightGray,
                            CircleShape
                        )
                        .padding(12.dp),
                    tint = Color.Unspecified
                )
            }
        },
    )

}

@Composable
fun CircularImage(image: Int, size: Dp, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = image),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = modifier
            .clip(CircleShape)
            .size(size)
    )
}

@Composable
fun EditSection(size: Dp, modifier: Modifier = Modifier) {


        Icon(
            imageVector = Icons.Outlined.Edit, contentDescription = "",
            modifier = modifier
                .background(color = Color.Black, shape = CircleShape)
                .border(
                    width = 3.dp, color = Color.White,
                    CircleShape
                )
                .padding(5.dp),
            tint = Color.White
        )

}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun DefaultTextField(
    modifier: Modifier,
    label: String,
    imeAction: ImeAction = ImeAction.Default,
    keyboardType: KeyboardType = KeyboardType.Text,
    isLastItem: Boolean = false,
    textStyle: TextStyle = MaterialTheme.typography.body1.copy(color = PrimaryDark)
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    var text by remember { mutableStateOf("") }
    //val maxChar = 50

    Column {
        Text(text = label, style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.height(0.dp))
        OutlinedTextField(
            modifier = modifier,
            value = text,
            textStyle = textStyle,
            onValueChange = { /*if (it.length <= maxChar) */text = it },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = keyboardType,
                imeAction = imeAction
            ),
            keyboardActions = if (isLastItem) KeyboardActions(onAny = { keyboardController?.hide() }) else KeyboardActions.Default,
        )

    }


}

@Composable
fun HorizontalLine(
    modifier: Modifier = Modifier,
    color: Color = Color.LightGray,
    height: Dp = 0.5.dp
) {
    Row(
        modifier
            .fillMaxWidth()
            .height(height)
            .background(color)
    ) {

    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SearchBar(
    modifier: Modifier,
    label: String,
    onSearch: (String) -> Unit
) {
    var query by remember {
        mutableStateOf("")
    }
    val keyboardController = LocalSoftwareKeyboardController.current

    Row(
        modifier = modifier
            .border(
                width = 0.5.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(15)
            )
            .padding(vertical = 16.dp, horizontal = 16.dp)
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_search), "search", tint = Color.LightGray)
        Spacer(modifier = Modifier.width(8.dp))
        Box(modifier = Modifier.fillMaxWidth()) {
            BasicTextField(
                modifier = Modifier.fillMaxWidth(),
                value = query,
                onValueChange = {
                    query = it
                },
                textStyle = MaterialTheme.typography.body1.copy(color = PrimaryDark),
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Search
                ),
                keyboardActions = KeyboardActions(onSearch = {
                    onSearch(query)
                    keyboardController?.hide()
                })
            )
            if (query.isEmpty())
                Text(text = label, style = MaterialTheme.typography.body1)
        }

    }


}

@Composable
fun DefaultAlertDialog(title: String = "", text: String, dismissClick: () -> Unit) {

    AlertDialog(
        onDismissRequest = dismissClick,
        text = {
            Text(text = text, style = MaterialTheme.typography.body2)
        },
        title = {
            Text(text = title)
        },
        confirmButton = {
            DefaultButton(
                modifier = Modifier,
                text = "Okay",
                textStyle = MaterialTheme.typography.body2.copy(
                    fontSize = 12.sp,
                    color = Color.White
                ),
                verticalPad = 10.dp,
                horizontalPad = 10.dp,
                onClick = dismissClick
            )
        },
    )

}
