plugins {
    id("java")
    application
    id("org.sonarqube") version "6.3.1.5724"
    id("checkstyle")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

checkstyle {
    toolVersion = "10.12.4"
    configFile = file("config/checkstyle/checkstyle.xml")
}

tasks.checkstyleMain {
    reports {
        xml.required = false
        html.required = true
    }
}

tasks.checkstyleTest {
    reports {
        xml.required = false
        html.required = true
    }
}

sonar {
    properties {
        property("sonar.projectKey", "DmitriyTokarev96_java-project-61")
        property("sonar.organization", "dmitriytokarev96")
    }
}

application {
    mainClass = "hexlet.code.App"
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
