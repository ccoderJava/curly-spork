FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} curly-spork.jar
ENTRYPOINT ["java","-jar","/curly-spork.jar"]