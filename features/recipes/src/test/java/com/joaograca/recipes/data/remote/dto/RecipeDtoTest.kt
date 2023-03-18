package com.joaograca.recipes.data.remote.dto

import com.joaograca.recipes.data.remote.response.INVALID_GET_RECIPE_RESPONSE
import com.joaograca.recipes.data.remote.response.VALID_GET_RECIPE_RESPONSE
import com.joaograca.recipes.di.RecipeModule
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.Moshi
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class RecipeDtoTest {

    private val moshi: Moshi = RecipeModule.providesMoshi()
    private val adapter: JsonAdapter<RecipeDto> = moshi.adapter(RecipeDto::class.java)

    @Test
    fun `fromJson when passing a valid string then returns not null`() {
        // Given
        val json = VALID_GET_RECIPE_RESPONSE

        // When
        val actual = adapter.fromJson(json)

        // Then
        assertNotNull(actual)
    }

    @Test
    fun `fromJson when passing an invalid string then exception is thrown`() {
        // Given
        val json = INVALID_GET_RECIPE_RESPONSE

        // Then
        assertThrows<JsonDataException> {
            // When
            adapter.fromJson(json)
        }
    }
}