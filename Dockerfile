FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN mvn install
COPY target/java9pro.springboot.cache-1.0.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
