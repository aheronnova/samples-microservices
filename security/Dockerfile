FROM openjdk:8-jdk
VOLUME /tmp
ADD build/libs/security-0.0.1.jar app.jar
ENV JAVA_OPTS=""
ENV HOST="security"
ENV EUREKA_URI="http://registry:9900/eureka/"
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar --container.host=$HOST --EUREKA_URI=$EUREKA_URI