package com.joaograca.recipes.domain

import com.joaograca.recipes.domain.model.Ingredient
import com.joaograca.recipes.domain.model.Recipe
import com.joaograca.recipes.domain.model.RecipePreview

interface RecipeRepository {

    suspend fun searchRecipe(keyword: String): Result<List<RecipePreview>>

    suspend fun searchRecipeByIngredients(ingredients: List<Ingredient>): Result<List<RecipePreview>>

    suspend fun createRecipe(recipe: Recipe): Result<Unit>

    suspend fun getRecipe(id: Int): Result<Recipe>
}