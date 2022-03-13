package com.example.discount.ui.register.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import com.example.discount.R
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.discount.ui.theme.PrimaryDark

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun PasswordField(
    modifier: Modifier,
    label: String,
    imeAction: ImeAction = ImeAction.Default,
    isLastItem: Boolean = false
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    var password by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }
    val maxChar = 11

    Column {
        Text(text = label, style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            modifier = modifier,
            value = password,
            textStyle = MaterialTheme.typography.body1.copy(color = PrimaryDark),
            onValueChange = { if (it.length <= maxChar) password = it },
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = imeAction
            ),
            keyboardActions = if (isLastItem) KeyboardActions(onAny = {keyboardController?.hide()}) else KeyboardActions.Default,

            trailingIcon = {
                IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
                    Icon(
                        painter = painterResource(id = if (passwordVisibility) R.drawable.ic_eye_open else R.drawable.ic_eye_close),
                        contentDescription = "eye"
                    )
                }
            },
            visualTransformation =
            if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation()
        )

    }


}