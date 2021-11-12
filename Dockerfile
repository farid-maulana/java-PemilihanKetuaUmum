FROM openjdk:8-jdk-alpine
MAINTAINER Farlan <1941720012@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Evoting.java /app

#compile file java
RUN javac Evoting.java

#running java
CMD ["java","Evoting"]
