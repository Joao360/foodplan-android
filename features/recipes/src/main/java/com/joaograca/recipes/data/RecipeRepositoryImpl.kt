package com.joaograca.recipes.data

import com.joaograca.recipes.data.mappers.toRecipe
import com.joaograca.recipes.data.mappers.toRecipePreview
import com.joaograca.recipes.data.remote.RecipeApi
import com.joaograca.recipes.domain.RecipeRepository
import com.joaograca.recipes.domain.model.Ingredient
import com.joaograca.recipes.domain.model.Recipe
import com.joaograca.recipes.domain.model.RecipePreview
import java.util.concurrent.CancellationException

class RecipeRepositoryImpl(
    private val recipeApi: RecipeApi
) : RecipeRepository {
    override suspend fun searchRecipe(keyword: String): Result<List<RecipePreview>> {
        return try {
            val pagedNetworkResponse = recipeApi.searchRecipe(keyword)
            val domain = pagedNetworkResponse.results.map { it.toRecipePreview() }
            Result.success(domain)
        } catch (e: Exception) {
            if (e is CancellationException) {
                throw e
            }
            Result.failure(e)
        }
    }

    override suspend fun searchRecipeByIngredients(ingredients: List<Ingredient>): Result<List<RecipePreview>> {
        return try {
            val dto = recipeApi.searchRecipeByIngredient(
                ingredients.map(Ingredient::name).joinToString(separator = ",")
            )
            val domain = dto.map { it.toRecipePreview() }
            Result.success(domain)
        } catch (e: Exception) {
            if (e is CancellationException) {
                throw e
            }
            Result.failure(e)
        }
    }

    override suspend fun createRecipe(recipe: Recipe): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun getRecipe(id: Int): Result<Recipe> {
        return try {
            val dto = recipeApi.getRecipe(id)
            Result.success(dto.toRecipe())
        } catch (e: Exception) {
            if (e is CancellationException) {
                throw e
            }
            Result.failure(e)
        }
    }
}