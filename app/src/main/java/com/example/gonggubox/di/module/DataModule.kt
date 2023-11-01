package com.example.gonggubox.di.module

import com.example.gonggubox.BuildConfig
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.TrustManagerFactory
import javax.net.ssl.X509TrustManager

@Module
@InstallIn(SingletonComponent::class)
object DataModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(
        sslSocketFactory: SSLSocketFactory,
        tmFactory: TrustManagerFactory
    ): OkHttpClient = OkHttpClient()
        .newBuilder()
        .callTimeout(30, TimeUnit.SECONDS)
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .sslSocketFactory(
            sslSocketFactory,
            tmFactory.trustManagers[0] as X509TrustManager
        )
        .build()

    @Provides
    @Singleton
    fun provideServiceClient(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl(BuildConfig.GONGGUBOX_API_URI)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

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