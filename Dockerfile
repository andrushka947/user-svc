FROM openjdk:8-jre-alpine

COPY target/user-service-1.0-SNAPSHOT.jar /app/user-svc.jar

CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/app/user-svc.jar"]