FROM java:8-alpine

RUN mkdir -p /opt/app
ADD application/build/libs/application-1.0-SNAPSHOT.jar /opt/app/

EXPOSE 8080
CMD ["java", "-jar", "/opt/app/application-1.0-SNAPSHOT.jar"]