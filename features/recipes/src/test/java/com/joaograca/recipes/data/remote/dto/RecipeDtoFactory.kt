package com.joaograca.recipes.data.remote.dto

object RecipeDtoFactory {
    fun create(): RecipeDto {
        return RecipeDto(
            id = 1,
            title = "",
            image = "",
            imageType = "",
            nutrition = null,
            servings = 1,
            readyInMinutes = 1,
            license = "",
            sourceName = "",
            sourceUrl = "",
            spoonacularSourceUrl = "",
            aggregateLikes = 1,
            healthScore = 1F,
            spoonacularScore = 1F,
            pricePerServing = 1F,
            analyzedInstructions = emptyList(),
            cheap = false,
            creditsText = "",
            cuisines = emptyList(),
            dairyFree = false,
            diets = emptyList(),
            gaps = "",
            glutenFree = false,
            instructions = "",
            ketogenic = false,
            lowFodmap = false,
            occasions = emptyList(),
            sustainable = false,
            vegan = false,
            vegetarian = false,
            veryHealthy = false,
            veryPopular = false,
            whole30 = false,
            weightWatcherSmartPoints = 1,
            dishTypes = emptyList(),
            extendedIngredients = emptyList(),
            summary = "",
            winePairing = WinePairingDtoFactory.create()
        )
    }
}