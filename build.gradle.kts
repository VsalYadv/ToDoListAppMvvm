plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.ksp) apply false // Ensure this is here
    alias(libs.plugins.hilt.android) apply false
}
