plugins {
    id("java")
}

dependencies {
    implementation(project(":feature:engine:core"))
    implementation(project(":feature:lib:transform"))
    implementation(project(":feature:lib:ecs"))
    implementation(project(":feature:lib:math"))
    implementation(project(":feature:lib:datamap"))

    implementation("com.badlogicgames.gdx:gdx:${LibExt.gdxVersion}")
}