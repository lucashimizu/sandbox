plugins {
    // Provides `gradle run` task
    application

    // Provides `gradle bootJar` task that builds the runnable fat jar
    id("org.springframework.boot")
}

val appMainClassName = "com.sandbox.Application"

application {
    mainClassName = appMainClassName
}

springBoot {
    mainClassName = appMainClassName
}

dependencies {
    compile(project(":domain"))
    compile(project(":service"))

//    compile(project(":rest"))
    compile(project(":graphql"))

    compile(project(":persistence"))

    compile("org.springframework.boot:spring-boot-starter:2.2.0.RELEASE")
}