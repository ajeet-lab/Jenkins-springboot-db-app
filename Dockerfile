FROM openjdk:17
EXPOSE 8081
ADD target/Jenkins-springboot-db-app-0.0.1.jar Jenkins-springboot-db-app-0.0.1.jar
ENTRYPOINT ["java", "-jar", "Jenkins-springboot-db-app-0.0.1.jar"]
