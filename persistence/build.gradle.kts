dependencies {
    compile(project(":domain"))

    compile("org.postgresql:postgresql:42.2.9")
    compile("org.hibernate:hibernate-core:5.4.10.Final")
    compile("org.springframework.boot:spring-boot-starter-data-jpa:2.2.0.RELEASE")
    compile("org.flywaydb:flyway-core:6.1.3")
}