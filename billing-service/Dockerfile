#FROM maven:3.9.9-eclipse-temurin-21 AS builder
#
#WORKDIR /app
#
#COPY pom.xml .
#
#RUN mvn dependency:go-offline -B
#
#COPY src ./src
#
#RUN mvn clean package

#FROM openjdk:21-jdk-slim AS runner
#
#ARG JAR_FILE=target/*.jar
#
#COPY ./target/billing-service-0.0.1-SNAPSHOT.jar ./app.jar
#
#EXPOSE 8080
#EXPOSE 9001
#
#ENTRYPOINT ["java", "-jar", "app.jar"]

FROM openjdk:21-jdk-slim AS runner

ARG JAR_FILE=target/*.jar

COPY ./target/billing-service-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080
EXPOSE 9001  # Expose gRPC port

ENTRYPOINT ["java", "-jar", "app.jar"]
