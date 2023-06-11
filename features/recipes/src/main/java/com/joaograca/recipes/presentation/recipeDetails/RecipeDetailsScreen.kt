package com.joaograca.recipes.presentation.recipeDetails

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.joaograca.core_ui.LocalSpacing
import com.joaograca.core_ui.R
import com.joaograca.core_ui.theme.FoodPlanTheme
import com.joaograca.recipes.domain.model.IngredientInfo
import com.joaograca.recipes.domain.model.previewRecipe

@Composable
fun RecipeDetailsScreen(
    viewModel: RecipeDetailsViewModel = hiltViewModel(),
    onClickGoBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    RecipeDetailsContent(uiState = uiState, onClickGoBack = onClickGoBack)
}

@Composable
private fun RecipeDetailsContent(
    uiState: RecipeDetailsUiState,
    onClickGoBack: () -> Unit
) {

    when (uiState) {
        RecipeDetailsUiState.Error -> Text(text = "Error")
        RecipeDetailsUiState.Loading -> Text(text = "Loading")
        is RecipeDetailsUiState.Success -> {
            val recipe = uiState.recipe

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
            ) {
                RecipeDetailsToolbar(onClickGoBack = onClickGoBack)

                AsyncImage(
                    modifier = Modifier
                        .size(250.dp)
                        .clip(MaterialTheme.shapes.small)
                        .align(Alignment.CenterHorizontally),
                    model = recipe.imageUrl,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    placeholder = painterResource(id = com.joaograca.recipes.R.drawable.ic_tray_plate),
                    error = painterResource(id = com.joaograca.recipes.R.drawable.ic_error),
                )

                Column(
                    modifier = Modifier.padding(LocalSpacing.current.spaceMedium),
                    verticalArrangement = Arrangement.spacedBy(LocalSpacing.current.spaceMedium)
                ) {
                    Text(
                        text = recipe.title,
                        style = MaterialTheme.typography.h5,
                        color = MaterialTheme.colors.onBackground
                    )

                    RecipeQuickInfo(recipe = recipe)

                    Description(description = recipe.summary)

                    IngredientsList(ingredients = recipe.ingredients)
                }
            }
        }
    }
}

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

@Composable
fun Description(modifier: Modifier = Modifier, description: String) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(id = R.string.description),
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.onBackground
        )

        Spacer(modifier = Modifier.height(LocalSpacing.current.spaceMedium))

        Text(
            text = description,
            style = MaterialTheme.typography.body2,
            color = MaterialTheme.colors.onBackground
        )
    }
}

@Preview(name = "DarkMode", uiMode = UI_MODE_NIGHT_YES)
@Preview(name = "LightMode", uiMode = UI_MODE_NIGHT_NO)
@Composable
private fun RecipeDetailsScreenPreview() {
    val uiState = RecipeDetailsUiState.Success(recipe = previewRecipe)

    FoodPlanTheme {
        RecipeDetailsContent(
            uiState = uiState,
            onClickGoBack = {}
        )
    }
}
