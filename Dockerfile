FROM  open-jdk:17

MAINTAINER ABHISHEK<abhishekpanda315@gmail.com>

COPY target/web-app.jar /usr/app/web-app.jar

WORKDIR /usr/web-app/

ENTRYPOINT["java","-jar","web-app.jar"]
