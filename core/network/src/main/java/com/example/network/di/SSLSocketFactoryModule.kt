package com.example.network.di

import android.content.Context
import com.example.network.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import java.io.IOException
import java.security.KeyManagementException
import java.security.KeyStore
import java.security.KeyStoreException
import java.security.NoSuchAlgorithmException
import java.security.cert.Certificate
import java.security.cert.CertificateException
import java.security.cert.CertificateFactory
import javax.inject.Singleton
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.TrustManagerFactory
import kotlin.Exception

@Module
@InstallIn(SingletonComponent::class)
object SSLSocketFactoryModule {
    @Provides
    @Singleton
    fun provideKeyPair(@ApplicationContext context: Context): Certificate? {
        val keyPairFactory = CertificateFactory.getInstance("X.509")
        val keyPairInputStream = context.resources.openRawResource(R.raw.gonggubox)
        var keyPairCert: Certificate? = null

        try {
            keyPairCert = keyPairFactory.generateCertificate(keyPairInputStream)
        } catch (e: CertificateException) {
            e.printStackTrace()
        } finally {
            keyPairInputStream.close()
        }

        return keyPairCert
    }

    @Provides
    @Singleton
    fun provideKeyStore(certificate: Certificate?): KeyStore {
        val keyStoreType = KeyStore.getDefaultType()
        val keyStore = KeyStore.getInstance(keyStoreType)

        keyStore.load(null, null)

        if (certificate == null) {
            throw NullPointerException("Certification is Null")
        }

        keyStore.setCertificateEntry("GongGuBox_Cert", certificate)
        return keyStore
    }

    @Provides
    @Singleton
    fun provideTrustManagerFactory(keyStore: KeyStore): TrustManagerFactory {
        val tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm()
        val trustManagerFactory = TrustManagerFactory.getInstance(tmfAlgorithm)

        trustManagerFactory.init(keyStore)
        return trustManagerFactory
    }

    @Provides
    @Singleton
    fun provideSSLSocketFactory(trustManagerFactory: TrustManagerFactory): SSLSocketFactory {
        try {
            val sslContext = SSLContext.getInstance("TLS")
            sslContext.init(null, trustManagerFactory.trustManagers, null)

            return sslContext.socketFactory
        } catch (e: NoSuchAlgorithmException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: KeyStoreException) {
            e.printStackTrace()
        } catch (e: KeyManagementException) {
            e.printStackTrace()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        throw Exception()
    }
}