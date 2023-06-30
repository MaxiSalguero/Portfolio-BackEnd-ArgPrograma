 FROM amazoncorretto:8-alpine-jdk
 MAINTAINER MSS
 COPY target/mss-0.0.1-SNAPSHOT.jar mss-app.jar
 ENTRYPOINT ["java","-jar","/mss-app.jar"]
