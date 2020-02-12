FROM maven:onbuild AS buildenv
FROM openjdk:9-jdk-alpine
VOLUME /tmp
COPY --from=buildenv /usr/src/app/target/java9pro.springboot.cache-1.0.0-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
