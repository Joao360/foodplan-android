package com.joaograca.recipes.navigation

import androidx.compose.material.ScaffoldState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.joaograca.recipes.presentation.recipeDetails.RecipeDetailsScreen
import com.joaograca.recipes.presentation.search.SearchScreenRoute

internal object RecipeDetailsArgs {
    const val recipeId = "recipeId"
}

object RecipeRoutes {
    const val searchRoute = "search"
    const val recipeDetails = "recipeDetails/{${RecipeDetailsArgs.recipeId}}"
}

fun NavController.navigateToRecipe(recipeId: Int) {
    navigate("recipeDetails/$recipeId")
}

fun NavGraphBuilder.recipeNavigation(
    scaffoldState: ScaffoldState,
    navController: NavController,
    onClickGoBack: () -> Unit,
) {
    composable(RecipeRoutes.searchRoute) {
        SearchScreenRoute(
            scaffoldState = scaffoldState,
            onClickRecipe = { navController.navigateToRecipe(it) }
        )
    }
    composable(RecipeRoutes.recipeDetails) {
        RecipeDetailsScreen(onClickGoBack = onClickGoBack)
    }
}