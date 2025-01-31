buildscript {

    dependencies {
        classpath("com.android.tools.build:gradle:8.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.4.1")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.40.1")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.6.21")
    }
}





// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.3.1" apply false
    id("org.jetbrains.kotlin.android") version "1.6.21" apply false
    id("org.jetbrains.kotlin.jvm") version "1.6.21"
    id("com.google.dagger.hilt.android") version "2.46" apply false
    id("com.google.devtools.ksp") version "1.6.21-1.0.5" apply false
}
