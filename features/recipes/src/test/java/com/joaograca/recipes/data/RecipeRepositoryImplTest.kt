package com.joaograca.recipes.data

import com.joaograca.recipes.data.remote.RecipeApi
import com.joaograca.recipes.data.remote.response.INVALID_SEARCH_RECIPE_BY_INGREDIENTS_RESPONSE
import com.joaograca.recipes.data.remote.response.INVALID_SEARCH_RECIPE_RESPONSE
import com.joaograca.recipes.data.remote.response.VALID_SEARCH_RECIPE_BY_INGREDIENTS_RESPONSE
import com.joaograca.recipes.data.remote.response.VALID_SEARCH_RECIPE_RESPONSE
import com.joaograca.recipes.domain.model.Ingredient
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

@OptIn(ExperimentalCoroutinesApi::class)
internal class RecipeRepositoryImplTest {

    private lateinit var repository: RecipeRepositoryImpl
    private lateinit var mockWebServer: MockWebServer
    private lateinit var okHttpClient: OkHttpClient
    private lateinit var api: RecipeApi

    @BeforeEach
    fun setUp() {
        mockWebServer = MockWebServer()
        okHttpClient = OkHttpClient.Builder()
            .writeTimeout(1, TimeUnit.SECONDS)
            .readTimeout(1, TimeUnit.SECONDS)
            .connectTimeout(1, TimeUnit.SECONDS)
            .build()
        api = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .client(okHttpClient)
            .baseUrl(mockWebServer.url("/"))
            .build()
            .create(RecipeApi::class.java)
        repository = RecipeRepositoryImpl(api)
    }

    @AfterEach
    fun tearDown() {
        mockWebServer.shutdown()
    }

    @Test
    fun `should return success when valid response`() = runTest {
        // Given
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(VALID_SEARCH_RECIPE_RESPONSE)
        )

        // When
        val result = repository.searchRecipe("burger")

        // Then
        assertTrue(result.isSuccess)
    }

    @Test
    fun `should return recipes when valid response`() = runTest {
        // Given
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(VALID_SEARCH_RECIPE_RESPONSE)
        )

        // When
        val result = repository.searchRecipe("burger").getOrNull()

        // Then
        assertNotNull(result)
        assertEquals(10, result?.size)
    }

    @Test
    fun `should return failure when invalid response code`() = runTest {
        // Given
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(403)
                .setBody(VALID_SEARCH_RECIPE_RESPONSE)
        )

        // When
        val result = repository.searchRecipe("burger")

        // Then
        assertTrue(result.isFailure)
    }

    @Test
    fun `should return failure when malformed response`() = runTest {
        // Given
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(INVALID_SEARCH_RECIPE_RESPONSE)
        )

        // When
        val result = repository.searchRecipe("burger")

        // Then
        assertTrue(result.isFailure)
    }

    @Test
    fun `should return success when valid response on search recipe by ingredients`() = runTest {
        // Given
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(VALID_SEARCH_RECIPE_BY_INGREDIENTS_RESPONSE)
        )

        // When
        val result = repository.searchRecipeByIngredients(listOf(Ingredient("tomato")))

        // Then
        assertTrue(result.isSuccess)
    }

    @Test
    fun `should return recipes when valid response on search recipe by ingredients`() = runTest {
        // Given
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(VALID_SEARCH_RECIPE_BY_INGREDIENTS_RESPONSE)
        )

        // When
        val result = repository.searchRecipeByIngredients(listOf(Ingredient("tomato"))).getOrNull()

        // Then
        assertNotNull(result)
        assertEquals(10, result?.size)
    }

    @Test
    fun `should return failure when invalid response code on search recipe by ingredients`() =
        runTest {
            // Given
            mockWebServer.enqueue(
                MockResponse()
                    .setResponseCode(403)
                    .setBody(VALID_SEARCH_RECIPE_BY_INGREDIENTS_RESPONSE)
            )

            // When
            val result = repository.searchRecipeByIngredients(listOf(Ingredient("tomato")))

            // Then
            assertTrue(result.isFailure)
        }

    @Test
    fun `should return failure when response is malformed on search recipe by ingredients`() =
        runTest {
            // Given
            mockWebServer.enqueue(
                MockResponse()
                    .setResponseCode(200)
                    .setBody(INVALID_SEARCH_RECIPE_BY_INGREDIENTS_RESPONSE)
            )

            // When
            val result = repository.searchRecipeByIngredients(listOf(Ingredient("tomato")))

            // Then
            assertTrue(result.isFailure)
        }
}