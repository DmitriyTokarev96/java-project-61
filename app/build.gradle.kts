plugins {
    kotlin("jvm") version "1.8.0"
    application
    checkstyle
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