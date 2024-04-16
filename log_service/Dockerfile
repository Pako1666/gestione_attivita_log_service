FROM openjdk:17-alpine
EXPOSE 5050
COPY ./target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]