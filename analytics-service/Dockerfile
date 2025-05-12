FROM openjdk:21-jdk-slim

ARG JAR_FILE=target/*.jar

# Copy the built JAR file from the build stage
COPY ./target/analytics-service-0.0.1-SNAPSHOT.jar app.jar



# Command to run the application
CMD ["java", "-jar", "/app.jar"]