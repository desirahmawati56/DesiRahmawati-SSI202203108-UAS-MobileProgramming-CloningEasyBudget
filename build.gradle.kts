
val kotlinVersion by extra("2.0.0") // Change in the plugins below too & for compose plugin
val hiltVersion by extra("2.51.1") // Change in the plugins below too
val realmVersion by extra("2.0.0") // Change in the plugins below too

plugins {
    id("com.android.application") version "8.3.0" apply false
    id("com.android.library") version "8.3.0" apply false
    id("com.google.firebase.crashlytics") version "3.0.1" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
    id("org.jetbrains.kotlin.android") version "2.0.0" apply false
    id("com.google.dagger.hilt.android") version "2.51.1" apply false
    id("com.google.devtools.ksp") version "2.0.0-1.0.21" apply false
    id("io.realm.kotlin") version "2.0.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false
}
