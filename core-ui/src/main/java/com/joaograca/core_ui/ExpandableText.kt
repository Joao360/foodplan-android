package com.joaograca.core_ui

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun ExpandableText(
    modifier: Modifier = Modifier,
    initialIsExpanded: Boolean = false,
    maxLines: Int = 3,
    style: TextStyle = LocalTextStyle.current,
    color: Color = Color.Unspecified,
    text: String
) {
    var isExpanded by remember { mutableStateOf(false) } // Starts collapsed to check if the text overflows
    var isButtonVisible by remember { mutableStateOf<Boolean?>(null) }

    Column(modifier = modifier) {
        Text(
            modifier = Modifier.animateContentSize(animationSpec = tween(100)),
            text = text,
            maxLines = if (isExpanded) Int.MAX_VALUE else maxLines,
            overflow = TextOverflow.Ellipsis,
            style = style,
            color = color,
            onTextLayout = {
                if (isButtonVisible == null) {
                    isButtonVisible = it.hasVisualOverflow
                    isExpanded = initialIsExpanded
                }
            }
        )

        if (isButtonVisible == true) {
            Button(
                modifier = Modifier.align(Alignment.End),
                onClick = { isExpanded = !isExpanded }
            ) {
                val buttonText = if (isExpanded) {
                    stringResource(id = R.string.read_less)
                } else {
                    stringResource(id = R.string.read_more)
                }

                Text(text = buttonText)
            }
        }
    }
}