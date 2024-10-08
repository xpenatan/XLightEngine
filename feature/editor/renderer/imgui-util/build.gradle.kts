plugins {
    id("java")
    id("java-library")
}

dependencies {
    implementation(project(":engine:core"))
    implementation("com.badlogicgames.gdx:gdx:${LibExt.gdxVersion}")

    // ImGui
    implementation("com.github.xpenatan.gdx-imgui:imgui-ext-core:${LibExt.gdxImGuiVersion}")
    implementation("com.github.xpenatan.gdx-imgui:gdx-impl:${LibExt.jDearImguiGdxVersion}")

    // Frame viewport
    implementation("com.github.xpenatan.gdx-multi-view:core:${LibExt.gdxMultiViewVersion}")
    implementation("com.github.xpenatan.gdx-multi-view:imgui-window:${LibExt.gdxMultiViewVersion}")
}