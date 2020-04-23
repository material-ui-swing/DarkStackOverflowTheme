
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

    //implementation("io.github.vincenzopalazzo:material-ui-swing:1.1.1_pre-release_6.1")
    implementation(files("$projectDir/lib/material-ui-swing-1.1.1_0.4-dev.jar"))
}
