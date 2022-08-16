package com.joaograca.recipes.di

import com.joaograca.recipes.data.RecipeRepositoryImpl
import com.joaograca.recipes.data.remote.RecipeApi
import com.joaograca.recipes.domain.RecipeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RecipeModule {

    @Provides
    @Singleton
    fun provideRecipeApi(): RecipeApi {
        return Retrofit.Builder()
            .baseUrl(RecipeApi.BASE_URL)
            .build()
            .create()
    }

    @Provides
    @Singleton
    fun provideRecipeRepository(api: RecipeApi): RecipeRepository {
        return RecipeRepositoryImpl(api)
    }
}