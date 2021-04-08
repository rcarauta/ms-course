FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/hr-api-gatway-zuul-0.0.1-SNAPSHOT.jar hr-api-gateway-zuul.jar
ENTRYPOINT ["java","-jar","/hr-api-gateway-zuul.jar"]