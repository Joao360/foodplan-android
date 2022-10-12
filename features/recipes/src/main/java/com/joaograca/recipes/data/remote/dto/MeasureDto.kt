package com.joaograca.recipes.data.remote.dto

data class MeasureDto(
    val metric: MetricDto,
    val us: MetricDto
)

data class MetricDto(
    val amount: Double,
    val unitLong: String,
    val unitShort: String
)