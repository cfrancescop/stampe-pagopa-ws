FROM openjdk:8-jdk
COPY target/stampe-*.jar app.jar
ENV JAVA_OPTS=""
EXPOSE 5000
VOLUME /var/govpay
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
