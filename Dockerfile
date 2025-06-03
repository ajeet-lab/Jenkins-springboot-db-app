FROM openjdk:17
EXPOSE 8081
ADD target/docker-jenkins-integration-0.0.1.jar docker-jenkins-integration-0.0.1.jar
ENTRYPOINT ["java", "-jar", "docker-jenkins-integration-0.0.1.jar"]
