package com.joaograca.recipes.data

import com.joaograca.core.util.suspendRunCatching
import com.joaograca.recipes.data.mappers.toRecipe
import com.joaograca.recipes.data.mappers.toRecipePreview
import com.joaograca.recipes.data.remote.RecipeApi
import com.joaograca.recipes.domain.RecipeRepository
import com.joaograca.recipes.domain.model.Ingredient
import com.joaograca.recipes.domain.model.Recipe
import com.joaograca.recipes.domain.model.RecipePreview

class RecipeRepositoryImpl(
    private val recipeApi: RecipeApi
) : RecipeRepository {
    override suspend fun searchRecipe(keyword: String): Result<List<RecipePreview>> {
        return suspendRunCatching {
            val pagedNetworkResponse = recipeApi.searchRecipe(keyword)
            pagedNetworkResponse.results.map { it.toRecipePreview() }
        }
    }

    override suspend fun searchRecipeByIngredients(ingredients: List<Ingredient>): Result<List<RecipePreview>> {
        return suspendRunCatching {
            val dto = recipeApi.searchRecipeByIngredient(
                ingredients.map(Ingredient::name).joinToString(separator = ",")
            )
            dto.map { it.toRecipePreview() }
        }
    }

    override suspend fun createRecipe(recipe: Recipe): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun getRecipe(id: Int): Result<Recipe> {
        return suspendRunCatching {
            val dto = recipeApi.getRecipe(id)
            dto.toRecipe()
        }
    }
}