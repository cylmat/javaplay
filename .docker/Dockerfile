# 22-jdk-slim, 22-jdk, eclipse-temurin:17-jdk-jammy

# syntax=docker/dockerfile:1
FROM eclipse-temurin:17-jdk-jammy

RUN apt update && apt install -y git

# Copy SprintBoot application to keep container alive
WORKDIR /demoapp
COPY demoapp/.mvn/ .mvn
COPY demoapp/mvnw demoapp/pom.xml ./
COPY demoapp/src ./src

# Run only once !
#RUN ./mvnw dependency:resolve

# Run SpringBoot app
CMD ["./mvnw", "spring-boot:run"]
