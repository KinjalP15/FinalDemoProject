FROM openjdk
COPY "./build/libs/FinalProject-0.0.1-SNAPSHOT.jar" app/FinalProject/
WORKDIR app/FinalProject/
EXPOSE 8090
ENTRYPOINT ["java", "-jar","FinalProject-0.0.1-SNAPSHOT.jar"]