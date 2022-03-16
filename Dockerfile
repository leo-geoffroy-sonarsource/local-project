FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
WORKDIR /
ADD build/libs/local-project.jar local-project.jar
CMD java -jar local-project.jar
