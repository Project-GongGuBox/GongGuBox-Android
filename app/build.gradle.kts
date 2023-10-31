import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
    id("com.google.gms.google-services")
}

kotlin { jvmToolchain(17) }

android {
    namespace = "com.example.gonggubox"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.gonggubox"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        manifestPlaceholders["NATIVE_APP_KEY"] = getAPiURI("KAKAO_APP_KEY")
        buildConfigField("String", "GONGGUBOX_API_URI", getAPiURI("GONGGUBOX_API_URI"))
        buildConfigField("String", "KAKAO_APP_KEY", getAPiURI("KAKAO_APP_KEY"))
        vectorDrawables { useSupportLibrary = true }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions { kotlinCompilerExtensionVersion = "1.5.3" }
    packaging { resources { excludes += "/META-INF/{AL2.0,LGPL2.1}" } }
}

fun getAPiURI(propertyUri: String) = gradleLocalProperties(rootDir).getProperty(propertyUri)

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")

    /* Kotlin Coroutine */
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    /* LandScapist Glide Image Loader */
    implementation("com.github.skydoves:landscapist-glide:2.2.10")

    /* OAuth 2.0 LOGIN (KAKAO, GOOGLE) */
    implementation("com.kakao.sdk:v2-user:2.17.0")
    implementation("com.google.gms:google-services:4.4.0")

    implementation("com.google.android.gms:play-services-auth:20.7.0")
    implementation(platform("com.google.firebase:firebase-bom:32.4.0"))
    implementation("com.google.firebase:firebase-auth:22.2.0")

    /* Android LifeCycle ViewModel, LiveData */
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")

    /* DI(Dependency Injection) Tools */
    implementation("com.google.dagger:hilt-android:2.48")
    ksp("com.google.dagger:hilt-android-compiler:2.48")

    /* Retrofit2 */
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    /* Jetpack Compose */
    val composeBom = platform("androidx.compose:compose-bom:2023.09.02")
    implementation(composeBom)
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-extended:1.5.4")
    implementation("androidx.compose.runtime:runtime-livedata:1.5.4")
    implementation("androidx.navigation:navigation-compose:2.7.4")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

    /* Android Test Implementation */
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(composeBom)
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}