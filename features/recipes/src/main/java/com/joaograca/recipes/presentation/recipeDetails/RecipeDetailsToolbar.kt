package com.joaograca.recipes.presentation.recipeDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.joaograca.core_ui.LocalSpacing
import com.joaograca.core_ui.R

@Composable
fun RecipeDetailsToolbar(
    modifier: Modifier = Modifier,
    onClickGoBack: () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.spaceMedium)
    ) {
        Image(
            modifier = Modifier
                .size(24.dp)
                .clickable { onClickGoBack() },
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = null
        )
    }
}