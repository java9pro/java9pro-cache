FROM maven:onbuild AS buildenv
FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY --from=buildenv target/java9pro.springboot.cache-1.0-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
