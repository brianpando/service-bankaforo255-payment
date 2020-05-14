FROM openjdk:13
VOLUME /tmp
EXPOSE 8083
ADD ./target/services-bankaforo255-payment-0.0.1-SNAPSHOT.jar service-payment.jar
#ENTRYPOINT ["java","-jar","/service-payment.jar"]
ENTRYPOINT ["java","-jar","-Dspring.cloud.config.uri=http://52.12.189.218:8083","/service-payment.jar"]