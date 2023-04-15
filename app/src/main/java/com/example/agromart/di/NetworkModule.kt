package com.example.agromart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://9ce-2401-4900-5d34-d941-e806-33a2-54b1-5bf9.ngrok-free.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
