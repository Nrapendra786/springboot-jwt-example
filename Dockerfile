FROM openjdk:17-jdk-slim

WORKDIR /app

ADD target/*.jar /app/spring-boot-security-jwt-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring-boot-security-jwt-0.0.1-SNAPSHOT.jar"]