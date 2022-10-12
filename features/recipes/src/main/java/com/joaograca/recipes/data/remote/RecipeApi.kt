package com.joaograca.recipes.data.remote

import com.joaograca.recipes.BuildConfig
import com.joaograca.recipes.data.remote.dto.ComplexSearchDto
import com.joaograca.recipes.data.remote.dto.RecipeDto
import com.joaograca.recipes.data.remote.dto.RecipeSearchDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RecipeApi {

    @GET("recipes/complexSearch?apiKey=$API_KEY")
    suspend fun searchRecipe(
        @Query("query") keyword: String
    ): ComplexSearchDto

    @GET("recipes/findByIngredients?apiKey=$API_KEY")
    suspend fun searchRecipeByIngredient(
        @Query("ingredients") ingredients: String
    ): List<RecipeSearchDto>

    @GET("recipes/{id}/information?apiKey=$API_KEY")
    suspend fun getRecipe(
        @Path("id") id: Int
    ): RecipeDto


    companion object {
        const val BASE_URL = "https://api.spoonacular.com/"
        const val API_KEY = BuildConfig.API_KEY
    }
}