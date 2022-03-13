package com.example.discount.ui.register.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.discount.ui.theme.PrimaryDark


@Composable
fun EmailField(modifier: Modifier = Modifier, label: String) {
    var email by remember {
        mutableStateOf("")
    }

    Column {
        Text(text = label, style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            modifier = modifier,
            value = email,
            onValueChange = { email = it },
            singleLine = true,
            textStyle = MaterialTheme.typography.body1.copy(color = PrimaryDark),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
        )

    }
}