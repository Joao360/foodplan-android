package com.joaograca.recipes.data.remote.dto

import com.joaograca.recipes.data.remote.response.NUTRITION_RESPONSE
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class NutritionDtoSerializerTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private val adapter: JsonAdapter<NutritionDto> = moshi.adapter(NutritionDto::class.java)

    @Test
    fun `fromJson should return expected`() {
        // Given
        val json = NUTRITION_RESPONSE
        val expected = NutritionDto(
            nutrients = listOf(
                NutrientDto(
                    name = "Calories",
                    amount = 316.49,
                    unit = "kcal",
                    percentOfDailyNeeds = 15.82
                ),
                NutrientDto(
                    name = "Fat",
                    amount = 12.09,
                    unit = "g",
                    percentOfDailyNeeds = 18.6
                )
            )
        )

        // When
        val actual = adapter.fromJson(json)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun `fromJson when string is invalid then throw exception`() {
        // Given
        val json = NUTRITION_RESPONSE.replace("nutrients", "nut")

        // Then
        assertThrows<JsonDataException> {
            // When
            adapter.fromJson(json)
        }
    }
}