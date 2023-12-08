# syntax=docker/dockerfile:1
FROM eclipse-temurin:17-jdk-jammy as base
WORKDIR /app
COPY .mvn/ ./.mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve
COPY src ./src

FROM base as development
CMD ["./mvnw", "spring-boot:run"]

FROM base as build
RUN ./mvnw package

FROM eclipse-temurin:17-jre-jammy as production
COPY --from=build /app/target/reminders-*.jar /reminders.jar
CMD ["java", "-jar", "/reminders.jar"]