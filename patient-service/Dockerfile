# Use the official Maven image for building the application
FROM maven:3.9.9-eclipse-temurin-21 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and source code
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package

# Use a lightweight JDK image for the final image
FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/patient-service-app.jar /app/patient-service-app.jar

# Expose the application port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "patient-service-app.jar"]
