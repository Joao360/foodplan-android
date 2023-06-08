package com.joaograca.recipes.data.mappers

import com.joaograca.recipes.data.remote.dto.IngredientDto
import com.joaograca.recipes.domain.model.Ingredient
import com.joaograca.recipes.domain.model.IngredientInfo

fun IngredientDto.toIngredient(): IngredientInfo {
    return IngredientInfo(
        ingredient = Ingredient("name"),
        quantity = amount,
        unit = unit
    )
}