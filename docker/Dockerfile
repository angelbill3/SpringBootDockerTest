FROM openjdk:8-jdk-alpine
ARG JAR_FILE=SpringBootDockerTest.jar
COPY ${JAR_FILE} jenkinsTest.jar
ENTRYPOINT ["java", "-jar", "jenkinsTest.jar"]