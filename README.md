# workspace
Intend is to have many components altogether in single repository like spring microservices, react and db related data as well as commands related to docker and jenkins operations.

## Spring Boot Microservice
* Spring Cloud Config Server
* Spring Cloud Client
- Picking up configuration from app1 or app2.properties but not from app1-dev.properties even if dev profile is set, and correct detail is coming on config server url- http://localhost:8888/app1/dev/master
