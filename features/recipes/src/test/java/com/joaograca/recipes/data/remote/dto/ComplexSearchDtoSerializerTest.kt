package com.joaograca.recipes.data.remote.dto

import com.joaograca.recipes.data.remote.response.COMPLEX_SEARCH_RESPONSE
import com.joaograca.recipes.di.RecipeModule
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ComplexSearchDtoSerializerTest {
    private val moshi: Moshi = RecipeModule.providesMoshi()

    private val type = Types.newParameterizedType(
        PagedNetworkResponse::class.java,
        ComplexSearchItemDto::class.java
    )
    private val adapter: JsonAdapter<PagedNetworkResponse<ComplexSearchItemDto>> =
        moshi.adapter(type)

    @Test
    fun `fromJson when passing a valid string then returns not null`() {
        // Given
        val json = COMPLEX_SEARCH_RESPONSE

        // When
        val actual = adapter.fromJson(json)

        // Then
        assertNotNull(actual)
    }

    @Test
    fun `fromJson when passing an invalid string then exception is thrown`() {
        // Given
        val json = COMPLEX_SEARCH_RESPONSE.replace("results", "rsslts")

        // Then
        assertThrows<JsonDataException> {
            // When
            adapter.fromJson(json)
        }
    }
}