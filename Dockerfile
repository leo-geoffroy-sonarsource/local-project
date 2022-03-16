FROM java:openjdk-8-alpine
WORKDIR /
ADD build/libs/local-project.jar local-project.jar
CMD java -jar local-project.jar
