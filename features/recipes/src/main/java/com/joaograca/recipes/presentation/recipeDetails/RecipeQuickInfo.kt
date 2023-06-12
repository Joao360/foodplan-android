package com.joaograca.recipes.presentation.recipeDetails

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joaograca.core_ui.LocalSpacing
import com.joaograca.core_ui.R
import com.joaograca.core_ui.theme.FoodPlanTheme
import com.joaograca.recipes.domain.model.Difficulty
import com.joaograca.recipes.domain.model.Recipe
import com.joaograca.recipes.domain.model.previewRecipe

@Composable
fun RecipeQuickInfo(modifier: Modifier = Modifier, recipe: Recipe) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(LocalSpacing.current.spaceLarge)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(LocalSpacing.current.spaceSmall)
        ) {
            Icon(
                modifier = Modifier.size(14.dp),
                painter = painterResource(id = R.drawable.ic_clock),
                tint = MaterialTheme.colors.onBackground,
                contentDescription = null
            )
            Text(
                text = "${recipe.readyIn.value} ${stringResource(id = R.string.minutes_small)}",
                style = MaterialTheme.typography.overline,
                color = MaterialTheme.colors.onBackground
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(LocalSpacing.current.spaceSmall)
        ) {
            val (difficultyIconResId, difficultyStrResId) = when (recipe.difficulty) {
                Difficulty.EASY -> R.drawable.ic_difficulty_easy to R.string.difficulty_easy
                Difficulty.MEDIUM -> R.drawable.ic_difficulty_medium to R.string.difficulty_medium
                Difficulty.HARD -> R.drawable.ic_difficulty_hard to R.string.difficulty_hard
            }

            Icon(
                modifier = Modifier.size(14.dp),
                painter = painterResource(id = difficultyIconResId),
                tint = MaterialTheme.colors.onBackground,
                contentDescription = null
            )
            Text(
                text = stringResource(id = difficultyStrResId),
                style = MaterialTheme.typography.overline,
                color = MaterialTheme.colors.onBackground
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(LocalSpacing.current.spaceSmall)
        ) {
            Icon(
                modifier = Modifier.size(14.dp),
                painter = painterResource(id = R.drawable.ic_flame),
                tint = MaterialTheme.colors.onBackground,
                contentDescription = null
            )
            Text(
                text = "${recipe.nutritionInfo.calories.value} ${stringResource(id = R.string.calories_small)}",
                style = MaterialTheme.typography.overline,
                color = MaterialTheme.colors.onBackground
            )
        }
    }
}

@Preview(name = "DarkMode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(name = "LightMode", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun RecipeQuickInfoPreview() {
    FoodPlanTheme {
        RecipeQuickInfo(
            modifier = Modifier.background(MaterialTheme.colors.background),
            recipe = previewRecipe
        )
    }
}