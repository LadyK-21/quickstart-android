// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.android.application") version "8.8.0" apply false
    id("com.android.library") version "8.8.0" apply false
    id("org.jetbrains.kotlin.android") version "2.1.10" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
    id("com.google.firebase.firebase-perf") version "1.4.2" apply false
}

allprojects {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
    }
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}
