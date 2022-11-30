FROM openjdk:17
ADD target/crudspringboot-0.0.1-SNAPSHOT.jar crudspringboot-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "crudspringboot-0.0.1-SNAPSHOT.jar"]