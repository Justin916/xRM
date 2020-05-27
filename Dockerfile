FROM openjdk:8-jdk-alpine

VOLUME /tmp
EXPOSE 8080

ADD target/xrm-0.0.1-SNAPSHOT.jar xrm.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/xrm.jar"]