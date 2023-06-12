plugins {
    id("foodplan-android-library-compose")
    id("foodplan-android-library-secrets")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
    id("de.mannodermaus.android-junit5")
}

dependencies {
    implementation(project(Modules.core))
    implementation(project(Modules.coreUi))

    implementation(Dependencies.androidxCore)
    implementation(Dependencies.androidXAppCompat)
    implementation(Dependencies.androidMaterial)
    implementation(Dependencies.retrofit)
    implementation(Dependencies.converterMoshi)
    implementation(Dependencies.moshiKotlin)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.loggingInterceptor)
    implementation(Dependencies.coilCompose)
    implementation(Dependencies.hiltNavigationCompose)
    implementation(Dependencies.viewModelCompose)
    implementation(Dependencies.timber)

    implementation(Dependencies.hilt)
    kapt(Dependencies.hiltCompiler)

    testImplementation(project(Modules.core))
    testImplementation(project(Modules.coreTesting))

    testImplementation(Dependencies.moshiKotlin)
    testImplementation(Dependencies.mockWebServer)
    testImplementation(Dependencies.kotlinCoroutinesTest)
    testImplementation(Dependencies.mockk)
    testImplementation(Dependencies.turbine)
    testImplementation(Dependencies.jUnitApi)
    testRuntimeOnly(Dependencies.jUnitEngine)

    androidTestImplementation(Dependencies.testExt)
    androidTestImplementation(Dependencies.espressoCore)
}