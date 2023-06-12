package com.joaograca.recipes.navigation

import androidx.compose.material.ScaffoldState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.joaograca.recipes.presentation.recipeDetails.RecipeDetailsScreen
import com.joaograca.recipes.presentation.search.SearchScreenRoute

internal const val recipeIdArg = "recipeId"

object RecipeRoutes {
    const val searchRoute = "search"
    const val recipeDetails = "recipeDetails/{$recipeIdArg}"
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
    composable(
        route = RecipeRoutes.recipeDetails,
        arguments = listOf(
            navArgument(recipeIdArg) { type = NavType.IntType }
        )
    ) {
        RecipeDetailsScreen(onClickGoBack = onClickGoBack)
    }
}