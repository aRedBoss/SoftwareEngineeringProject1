FROM maven:latest
LABEL authors="aldul"

WORKDIR /app
COPY pom.xml /app
COPY . /app
RUN mvn package
CMD ["java", "-jar", "target/SoftwareEngineeringProject1-1.0-SNAPSHOT.jar"]