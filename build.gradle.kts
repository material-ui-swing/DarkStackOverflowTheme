
plugins {
    `java-library`
}

group = "io.vincenzopalazzo.materialtheme"
version = "0.1"

repositories {
    jcenter()
}

dependencies {
    implementation("org.swinglabs.swingx:swingx-all:1.6.4")
    implementation("io.github.vincenzopalazzo:material-ui-swing:1.1.1-rc4")
    testImplementation("com.github.jiconfont:jiconfont-swing:1.0.0")
    testImplementation("com.github.jiconfont:jiconfont-google_material_design_icons:2.2.0.2")
}
