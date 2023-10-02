package com.example.gonggubox.di.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object APIServiceModule {
    @Provides
    @Singleton
    fun provideServiceClient(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://www.gonggubox.shop")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
}