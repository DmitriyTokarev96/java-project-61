plugins {
    kotlin("jvm") version "1.8.0"
    application
    checkstyle
    id("docker.plugin") version "1.0.36"
}

dependencies {
    implementation(kotlin("stdlib"))
}

checkstyle {
    toolVersion = "8.44"
    configFile = file("config/checkstyle/checkstyle.xml")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("hexlet.code.App")
}

tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("gradle.plugin.com.shainnazarov:gradle-plugins:1.0.36")
    }
}

apply(plugin = "docker.plugin")

sourceSets {
    main {
        java {
            srcDirs("app/src/main/java")
        }
        resources {
            srcDirs("app/src/main/resources")
        }
    }
    test {
        java {
            srcDirs("app/src/test/java")
        }
        resources {
            srcDirs("app/src/test/resources")
        }
    }
}