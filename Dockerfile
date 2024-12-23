FROM maven:3.9.9-eclipse-temurin-21-alpine AS build
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM openjdk:21-slim
COPY --from=build /target/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]