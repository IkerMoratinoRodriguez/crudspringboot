FROM openjdk:17-jdk-alpine
MAINTAINER baeldung.com
COPY target/crudspringboot-0.0.1-SNAPSHOT.jar crudspringboot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "crudspringboot-0.0.1-SNAPSHOT.jar"]