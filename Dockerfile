# Use Eclipse Temurin Java 21 base image
FROM eclipse-temurin:21-jdk-alpine

# Set work directory inside the container
WORKDIR /app

# Copy the built JAR file (update your JAR name accordingly)
COPY target/OBB-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on (default 8080)
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
