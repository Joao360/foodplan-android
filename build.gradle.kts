buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Plugins.android)
        classpath(Plugins.kotlin)
        classpath(Plugins.hilt)
        classpath(Plugins.junit5)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}