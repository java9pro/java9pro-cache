FROM maven:onbuild AS buildenv
FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY --from=buildenv /usr/src/app/target/cache.jar /usr/local/lib/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]
