FROM openjdk:21
ADD target/ItemApp-0.0.1-SNAPSHOT.jar ItemApp.jar
ENTRYPOINT ["java", "-jar", "ItemApp.jar"]
EXPOSE 9999