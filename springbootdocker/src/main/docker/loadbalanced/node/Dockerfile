FROM java:8
VOLUME /tmp
ADD springbootdocker-0.0.1.jar springbootapp.jar


RUN bash -c 'touch /springbootapp.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springbootapp.jar","--server.port=9090"]
