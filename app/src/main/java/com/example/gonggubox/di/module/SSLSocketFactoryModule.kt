package com.example.gonggubox.di.module

import android.content.Context
import com.example.gonggubox.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import java.io.IOException
import java.io.InputStream
import java.lang.NullPointerException
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

@Module
@InstallIn(SingletonComponent::class)
object SSLSocketFactoryModule {
    @Provides
    @Singleton
    fun provideKeyPair(@ApplicationContext context: Context): Certificate? {
        val keyPairFactory: CertificateFactory = CertificateFactory.getInstance("X.509")
        val keyPairInputStream: InputStream = context.resources.openRawResource(R.raw.fullchain)
        var keyPairAuth: Certificate? = null

        try {
            keyPairAuth = keyPairFactory.generateCertificate(keyPairInputStream)
        } catch (e: CertificateException) {
            e.printStackTrace()
        } finally {
            keyPairInputStream.close()
        }

        return keyPairAuth
    }

    @Provides
    @Singleton
    fun provideKeyStore(certificate: Certificate?): KeyStore {
        val keyStoreType: String = KeyStore.getDefaultType()
        val keystore: KeyStore = KeyStore.getInstance(keyStoreType)

        keystore.load(null, null)

        if (certificate == null) {
            throw NullPointerException("Certificate is null")
        }

        keystore.setCertificateEntry("GongguBox_CA", certificate)
        return keystore
    }

    @Provides
    @Singleton
    fun provideTrustManagerFactory(keyStore: KeyStore):  TrustManagerFactory {
        val tmfAlgorithm: String = TrustManagerFactory.getDefaultAlgorithm()
        val tmFactory: TrustManagerFactory = TrustManagerFactory.getInstance(tmfAlgorithm)

        tmFactory.init(keyStore)
        return tmFactory
    }

    @Provides
    @Singleton
    fun provideSSLSocketFactory(tmFactory: TrustManagerFactory): SSLSocketFactory {
        try {
            val sslContext: SSLContext = SSLContext.getInstance("TLS")
            sslContext.init(null, tmFactory.trustManagers, null)

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