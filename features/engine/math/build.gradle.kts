plugins {
    id("java")
    id("java-library")
}

group = LibExt.GROUP_ID

val moduleName = "math"

dependencies {
    implementation("com.badlogicgames.gdx:gdx:${LibExt.gdxVersion}")

    testImplementation("com.google.truth:truth:${LibExt.truthVersion}")
}