# SprinGraphQL

## About project

The principal objective of this project is study a little about <a href="https://graphql.org/" target="_blank" >GraphQl</a>.

## Installation

Is required <a href="https://docs.docker.com/docker-for-windows/install/" target="_blank" >Docker</a>, <a href="https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html" target="_blank" >JDK</a> and <a href="https://maven.apache.org/" target="_blank" >Maven</a>
```
docker run -p "5432:5432" -e POSTGRES_DB='springraphql' -e POSTGRES_PASSWORD='postgres' -e POSTGRES_USER='postgres' -d postgres:9.4

mvn clean spring-boot:run

```
