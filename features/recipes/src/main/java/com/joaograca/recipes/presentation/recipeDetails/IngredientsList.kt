package com.joaograca.recipes.presentation.recipeDetails

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.joaograca.core_ui.LocalSpacing
import com.joaograca.core_ui.R
import com.joaograca.recipes.domain.model.IngredientInfo

@Composable
fun IngredientsList(modifier: Modifier = Modifier, ingredients: List<IngredientInfo>) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = stringResource(id = R.string.ingredients),
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.onBackground
        )

        Spacer(modifier = Modifier.height(LocalSpacing.current.spaceMedium))

        Column(verticalArrangement = Arrangement.spacedBy(LocalSpacing.current.spaceSmall)) {
            ingredients.forEach { ingredientInfo ->
                Row {
                    Text(
                        modifier = Modifier.weight(1f),
                        text = ingredientInfo.ingredient.name,
                        style = MaterialTheme.typography.body2,
                        color = MaterialTheme.colors.onBackground
                    )
                    Text(
                        text = "${ingredientInfo.quantity.toInt()} ${ingredientInfo.unit}",
                        style = MaterialTheme.typography.body2,
                        color = MaterialTheme.colors.onBackground
                    )
                }
            }
        }
    }
}