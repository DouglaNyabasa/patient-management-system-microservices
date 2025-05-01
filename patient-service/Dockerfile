# Use the official Maven image for building the application
#FROM maven:3.9.9-eclipse-temurin-21 AS build
#
## Set the working directory
#WORKDIR /app
#
## Copy the pom.xml and source code
#COPY pom.xml .
#COPY src ./src
#
## Build the application
#RUN mvn clean package

# Use a lightweight JDK slim image for the final image
#FROM openjdk:21-jdk-slim
#
#ARG JAR_FILE=target/*.jar
#
## Copy the built JAR file from the build stage
#COPY ./target/patient-service-0.0.1-SNAPSHOT.jar app.jar
#
## Expose the application port
#EXPOSE 8080
#
## Command to run the application
#CMD ["java", "-jar", "/app.jar"]

FROM openjdk:21-jdk-slim

ARG JAR_FILE=target/*.jar

# Copy the built JAR file from the build stage
COPY ./target/patient-service-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port and gRPC port
EXPOSE 8082
EXPOSE 9090  # Expose gRPC port

# Command to run the application
CMD ["java", "-jar", "/app.jar"]
