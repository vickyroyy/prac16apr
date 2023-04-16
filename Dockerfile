FROM openjdk:17-jdk-alpine
ARG JAR_FILE
COPY ${JAR_FILE} de.jar
ENTRYPOINT ["java","-jar","/de.jar"]