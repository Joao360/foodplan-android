object Dependencies {
    // Kotlin
    const val kotlinCoroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"

    // Compose
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeUiTestJunit = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"

    // Navigation
    const val navigation = "androidx.navigation:navigation-compose:${Versions.navigation}"

    // Android
    const val androidxCore = "androidx.core:core-ktx:${Versions.androidXCore}"
    const val androidXActivityCompose =
        "androidx.activity:activity-compose:${Versions.androidXActivity}"
    const val androidXLifecycleRuntimeKtx =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.androidXLifecycle}"
    const val androidXAppCompat = "androidx.appcompat:appcompat:${Versions.androidXAppCompat}"
    const val viewModelCompose =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.androidXLifecycle}"

    // Espresso
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val testExt = "androidx.test.ext:junit:${Versions.androidXTest}"

    // Hilt
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltNavigationCompose =
        "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"

    // jUnit
    const val jUnitApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
    const val jUnitEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit}"

    // Material
    const val androidMaterial = "com.google.android.material:material:${Versions.googleMaterial}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val converterMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.converterMoshi}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockWebServer}"

    // Timber
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    // Coil
    const val coilCompose = "io.coil-kt:coil-compose:${Versions.coil}"

    // Mockk
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
}