dependencies {
    compile("org.springframework.boot:spring-boot-starter-web:2.2.0.RELEASE")
    {
        exclude("spring-boot-starter-tomcat")
    }
    compile("org.springframework.boot:spring-boot-starter-jetty:2.2.0.RELEASE")
}