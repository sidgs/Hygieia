FROM java:8u92-jre-alpine
ENV JAVA_OPTS="-XX:MaxMetaspaceSize=1024m -Xms512m -Xmx1024m"
ENV SPRING_DATA_MONGODB_DATABASE=dashboard
EXPOSE 8080
VOLUME ["/hygieia/logs"]
ADD ../../api*.jar api.jar
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar api.jar"]
