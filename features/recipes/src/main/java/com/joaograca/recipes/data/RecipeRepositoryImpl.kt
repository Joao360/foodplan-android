package com.joaograca.recipes.data

import com.joaograca.recipes.data.remote.RecipeApi
import com.joaograca.recipes.domain.RecipeRepository
import com.joaograca.recipes.domain.model.Ingredient
import com.joaograca.recipes.domain.model.Recipe

class RecipeRepositoryImpl(
    private val recipeApi: RecipeApi
) : RecipeRepository {
    override suspend fun searchRecipe(keyword: String): Result<List<Recipe>> {
        TODO("Not yet implemented")
    }

    override suspend fun searchRecipeByIngredient(ingredient: Ingredient): Result<List<Recipe>> {
        TODO("Not yet implemented")
    }

    override suspend fun createRecipe(recipe: Recipe): Result<Unit> {
        TODO("Not yet implemented")
    }
}