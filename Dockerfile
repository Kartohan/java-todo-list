FROM openjdk:26-slim-trixie
WORKDIR /app
COPY .env .
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]