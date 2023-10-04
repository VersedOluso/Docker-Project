FROM openjdk:17
EXPOSE 8084
ADD target/alpha.jar alpha.jar
ENTRYPOINT ["java","-jar","/alpha.jar"]