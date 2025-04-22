FROM openjdk:21-jdk-slim

ARG JAR_FILE=target/*.jar

# Copy the built JAR file from the build stage
COPY ./target/api-gateway1-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port and gRPC port
EXPOSE 8080


# Command to run the application
CMD ["java", "-jar", "/app.jar"]