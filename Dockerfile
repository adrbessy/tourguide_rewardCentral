FROM openjdk:8
ADD target/tourguide_rewardCentral-0.0.1-SNAPSHOT.jar tourguide_rewardCentral-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "/tourguide_rewardCentral-0.0.1-SNAPSHOT.jar"]