package com.joaograca.recipes.domain

import com.joaograca.recipes.domain.model.Ingredient
import com.joaograca.recipes.domain.model.Recipe

interface RecipeRepository {

    suspend fun searchRecipe(keyword: String): Result<List<Recipe>>

    suspend fun searchRecipeByIngredient(ingredient: Ingredient): Result<List<Recipe>>

    suspend fun createRecipe(recipe: Recipe): Result<Unit>
}