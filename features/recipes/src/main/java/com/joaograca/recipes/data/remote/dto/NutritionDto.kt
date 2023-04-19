package com.joaograca.recipes.data.remote.dto

data class NutritionDto(
    val nutrients: List<NutrientDto>
)

data class NutrientDto(
    val name: String,
    val amount: Double,
    val unit: String,
    val percentOffDailyNeeds: Double
)