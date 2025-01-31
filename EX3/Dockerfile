# Use a lightweight base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the src directory and any other necessary files to the container
COPY src /app/src
COPY . .

EXPOSE 8080

# Specify the entry point to run the Java program
CMD ["java", "-cp", "out", "library"]
