 FROM maven:3.8.5-openjdk-17 AS builder
 WORKDIR /app
 COPY pom.xml /app/pom.xml
 RUN mvn dependency:go-offline -B
 COPY src /app/src
 RUN mvn package -DskipTests

 FROM openjdk:17-jdk-slim
 WORKDIR /app
 COPY --from=builder /app/target/*.jar app.jar
 EXPOSE 8080
 CMD ["java", "-jar", "app.jar"]
