package com.joaograca.recipes.domain.model

class RecipePreviewFactory {
    companion object {
        fun create(): RecipePreview {
            return RecipePreview(
                id = 123,
                name = "Pasta with Garlic, Scallions, Cauliflower & Breadcrumbs",
                imageUrl = "imageUrl"
            )
        }
    }
}