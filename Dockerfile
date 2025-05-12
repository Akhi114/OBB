# Use a Java 21 JDK base image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the project files into the container
COPY . .

# Build the app using Maven
RUN ./mvnw clean package -DskipTests

# Use the built JAR
CMD ["java", "-jar", "target/OBB-0.0.1-SNAPSHOT.jar"]

