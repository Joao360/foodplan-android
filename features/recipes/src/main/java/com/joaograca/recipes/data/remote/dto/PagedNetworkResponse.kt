package com.joaograca.recipes.data.remote.dto

data class PagedNetworkResponse<T>(
    val offset: Int,
    val number: Int,
    val results: List<T>,
    val totalResults: Int
)
