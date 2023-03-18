apply {
    from("$rootDir/base-module.gradle")
}

dependencies {

    "implementation"(Dependencies.androidxCore)
    "implementation"(Dependencies.androidXAppCompat)
    "implementation"(Dependencies.androidMaterial)
    "implementation"(Dependencies.retrofit)
    "implementation"(Dependencies.converterMoshi)
    "implementation"(Dependencies.moshiKotlin)
    "implementation"(Dependencies.okHttp)
    "implementation"(Dependencies.loggingInterceptor)
    "implementation"(Dependencies.coilCompose)
    "implementation"(project(Modules.coreUi))

    "debugImplementation"(Dependencies.composeUiTooling)

    "testImplementation"(Dependencies.moshiKotlin)
    "testImplementation"(Dependencies.mockWebServer)
    "testImplementation"(project(Modules.core))

    "androidTestImplementation"(Dependencies.testExt)
    "androidTestImplementation"(Dependencies.espressoCore)
}