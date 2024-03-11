package com.systemfailed.cryptoharber.common.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomTextField(
    label: String,
    value: String,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon
    )
}


@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun CustomTextFieldPreview() {
    CustomTextField(
        label = "Label",
        value = "Value",
        onValueChange = {},
        leadingIcon = {
                Icon(imageVector = Icons.Filled.Email, contentDescription = null)
        },
        trailingIcon =
        {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Visibility, contentDescription = null)
            }
        },
    )
}
