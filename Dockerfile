FROM openjdk:18-jdk-alpine@sha256:e5c5b35b831a4f655074a25604130ce53e33567b82c8a7204f0e5641b66d477e
COPY target/Jar-CICD-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]



#FROM openjdk:16-alpine3.13
#
#WORKDIR /app
#
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#COPY src ./src
#EXPOSE 8080
#CMD ["./mvnw", "spring-boot:run"]