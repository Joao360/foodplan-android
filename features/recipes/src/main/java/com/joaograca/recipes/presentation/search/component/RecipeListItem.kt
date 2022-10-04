package com.joaograca.recipes.presentation.search.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import com.joaograca.core_ui.LocalSpacing
import com.joaograca.recipes.domain.model.RecipePreview

@Composable
fun RecipeListItem(
    recipe: RecipePreview
) {
    val spacing = LocalSpacing.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(spacing.spaceExtraSmall)
            .clip(RoundedCornerShape(5.dp))
            .shadow(elevation = 1.dp, shape = RoundedCornerShape(5.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(spacing.spaceMedium)
        ) {
            Text(recipe.name, style = MaterialTheme.typography.h6)
        }
    }
}