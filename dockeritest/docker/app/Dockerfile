FROM java:8
VOLUME /tmp
ADD ./app/target/dockeritests-app-0.0.1-SNAPSHOT.jar springbootapp.jar


RUN bash -c 'touch /springbootapp.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springbootapp.jar"]

