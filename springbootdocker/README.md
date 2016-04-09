# Simple SpringBoot app - dockerized

A very simple SpringBoot app, providing 2 hardcoded endpoints, and a couple of scripts to build and run it with docker.

## LoadBalancer version

A simple nginx load balancer in front of 4 nodes for the springboot app.
Scripts to build and run all the containers.


## Docker-compose version
Using the previously built images, create a compose file to start the 4 nodes in one go

## Docker-compose with integrated build

Using docker-compose so build and start the defined containers infrastructure

### Nginx version 

* Nginx load balancer started with 4 nodes configured
* Nodes started with Springboot app up and running

File docker-compose-nginx.yml

### HAProxy version

* HAProxy load balancer started with 4 nodes configured
* Nodes started with Springboot app up and running

File docker-compose-haproxy.yml

# Dependencies

Maven
Docker
Docker-compose
