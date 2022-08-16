apply {
    from("$rootDir/base-module.gradle")
}

dependencies {

    "implementation"(Dependencies.androidxCore)
    "implementation"(Dependencies.androidXAppCompat)
    "implementation"(Dependencies.androidMaterial)
    "implementation"(Dependencies.retrofit)

    "androidTestImplementation"(Dependencies.testExt)
    "androidTestImplementation"(Dependencies.espressoCore)
}