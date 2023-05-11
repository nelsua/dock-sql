FROM openjdk:21-jdk-slim
EXPOSE 8080
ADD target/comp.jar comp.jar
ENTRYPOINT ["java","-jar","/comp.jar"]