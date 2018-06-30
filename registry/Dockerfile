FROM openjdk:8-jdk
VOLUME /tmp
ADD build/libs/registry-0.0.1.jar app.jar
ENV JAVA_OPTS=""
ENV HOST="registry"
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar --container.host=$HOST