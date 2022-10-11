package com.joaograca.recipes.domain.model

import com.joaograca.core.util.nextString
import kotlin.random.Random

class RecipePreviewFactory {
    companion object {
        fun create(): RecipePreview {
            return RecipePreview(
                id = Random.nextInt(5),
                name = Random.nextString(10),
                imageUrl = Random.nextString(10)
            )
        }
    }
}