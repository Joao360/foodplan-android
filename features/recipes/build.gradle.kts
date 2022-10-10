apply {
    from("$rootDir/base-module.gradle")
}

dependencies {

    "implementation"(Dependencies.androidxCore)
    "implementation"(Dependencies.androidXAppCompat)
    "implementation"(Dependencies.androidMaterial)
    "implementation"(Dependencies.retrofit)
    "implementation"(Dependencies.converterMoshi)
    "implementation"(Dependencies.okHttp)
    "implementation"(Dependencies.loggingInterceptor)
    "implementation"(Dependencies.coilCompose)
    "debugImplementation"(Dependencies.composeUiTooling)

    "implementation"(project(Modules.coreUi))

    "testImplementation"(project(Modules.core))

    "androidTestImplementation"(Dependencies.testExt)
    "androidTestImplementation"(Dependencies.espressoCore)
}