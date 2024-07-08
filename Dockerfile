FROM amazoncorretto:21

WORKDIR /app

COPY target/first-21-0.0.1-SNAPSHOT.jar /app/first-21-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "/app/first-21-0.0.1-SNAPSHOT.jar"]
