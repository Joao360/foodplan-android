package com.joaograca.recipes.data.remote

import com.joaograca.recipes.data.remote.dto.ComplexSearchDto
import com.joaograca.recipes.data.remote.dto.RecipeDto
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeApi {

    @GET("recipes/complexSearch")
    suspend fun searchRecipe(
        @Query("apiKey") apiKey: String,
        @Query("query") keyword: String
    ): ComplexSearchDto

    @GET("recipes/findByIngredients")
    suspend fun searchRecipeByIngredient(
        @Query("apiKey") apiKey: String,
        @Query("ingredients") ingredients: String
    ): RecipeDto

    companion object {
        const val BASE_URL = "https://api.spoonacular.com/"
    }
}