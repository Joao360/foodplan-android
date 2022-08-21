package com.joaograca.recipes.data.mappers

import com.joaograca.recipes.data.remote.dto.ComplexSearchItemDto
import com.joaograca.recipes.domain.model.RecipePreview

object ComplexSearchItemDtoMapper {
    fun toRecipePreview(dto: ComplexSearchItemDto): RecipePreview {
        return RecipePreview(
            id = dto.id,
            name = dto.title,
            imageUrl = dto.image
        )
    }
}