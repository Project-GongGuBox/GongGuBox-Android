package com.example.gonggubox.di

import com.example.gonggubox.BuildConfig
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideGoogleTokenOptions(): GoogleIdTokenRequestOptions =
        GoogleIdTokenRequestOptions.Builder()
            .setSupported(true)
            .setFilterByAuthorizedAccounts(false)
            .setServerClientId(BuildConfig.GOOGLE_WEB_CLIENT_KEY)
            .build()

    @Provides
    @Singleton
    fun buildSignInRequest(googleTokenOption: GoogleIdTokenRequestOptions): BeginSignInRequest =
        BeginSignInRequest.Builder()
            .setGoogleIdTokenRequestOptions(googleTokenOption)
            .setAutoSelectEnabled(true)
            .build()
}