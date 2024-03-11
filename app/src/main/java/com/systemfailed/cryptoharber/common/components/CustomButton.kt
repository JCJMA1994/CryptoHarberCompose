package com.systemfailed.cryptoharber.common.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.systemfailed.cryptoharber.ui.theme.BlueDark
import com.systemfailed.cryptoharber.ui.theme.BlueGrey
import com.systemfailed.cryptoharber.ui.theme.BlueLight

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    gradient: Brush,
    cornerRadius: Dp,
    roundedCornerShape: RoundedCornerShape
) {

    Button(
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        shape = RoundedCornerShape(cornerRadius)
    ) {
        Box(
            modifier = modifier
                .background(brush = gradient, shape = roundedCornerShape)
                .clip(roundedCornerShape)
                .padding( vertical = 16.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text)
        }
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CustomButtonPreview() {
    CustomButton(
        text = "Hello",
        onClick = {},
        gradient = Brush.horizontalGradient(
            colors = listOf(
                BlueDark,
                BlueGrey,
                BlueLight
            )
        ),
        cornerRadius = 16.dp,
        roundedCornerShape = RoundedCornerShape(8.dp)
    )
}