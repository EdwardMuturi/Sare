object Versions {
    //    android x
    const val androidx_activity_version = "1.1.0-rc02"
    const val androidx_fragment_version = "1.2.0-rc02"

    //    kotlin
    const val kotlin = "1.3.70"
    const val koltin_core_version = "1.0.2"

    //    gradle
    const val gradle_plugin = "3.6.1"
    const val google_services = "4.3.3"

    const val material_version = "1.2.0-alpha05"
    const val constraint_version = "2.0.0-beta4"
    const val appcompat_version = "1.1.0"

    //    tesing
    const val junit_version = "4.12"
    const val junit_ext = "1.1.1"
    const val espresso_core = "3.2.0"

    //    firestore
    const val firestore_ktx = "21.4.3"
    const val firestore_common = "16.1.0"
    const val play_services_coroutines = "1.1.1"

    const val nav_version = "2.3.0-alpha06"

}

object Deps {
    //gradle
    val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.gradle_plugin}"
    val google_services_plugin = "com.google.gms:google-services:${Versions.google_services}"

    //kotlin
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val kotlin_core_extensions = "androidx.core:core-ktx:${Versions.koltin_core_version}"
    val coroutines_play_services =
        "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.play_services_coroutines}"
    val coroutines =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.play_services_coroutines}"

    val material = "com.google.android.material:material:${Versions.material_version}"
    val constraint_layout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraint_version}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat_version}"
    const val androidx_activity =
        "androidx.activity:activity-ktx:${Versions.androidx_activity_version}"
    const val androidx_fragment =
        "androidx.fragment:fragment-ktx:${Versions.androidx_fragment_version}"
//    testing
    val junit = "junit:junit:${Versions.junit_version}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
    val junit_ext = "androidx.test.ext:junit:${Versions.junit_ext}"

    //    firebase
    val firestore_ktx = "com.google.firebase:firebase-firestore-ktx:${Versions.firestore_ktx}"
    val firestore_common = "com.google.firebase:firebase-common-ktx:${Versions.firestore_ktx}"



    //    navigation component
    const val nav_UI= "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"
    const val nav_fragment= "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    const val safe_args_gradle_plugin= "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav_version}"


}