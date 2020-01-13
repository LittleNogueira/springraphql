# SprinGraphQL

## About project

The principal objective of this project is study a little about <a href="https://graphql.org/" target="_blank" >GraphQL</a>.

### Configure project

Is required <a href="https://docs.docker.com/docker-for-windows/install/" target="_blank" >Docker</a>, <a href="https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html" target="_blank" >JDK</a> and <a href="https://maven.apache.org/" target="_blank" >Maven</a>

After clone this project, enter in folder of project and execute the followings commands.

```
cd /path/project/springraphql

docker run -p "5432:5432" -e POSTGRES_DB='springraphql' -e POSTGRES_PASSWORD='postgres' -e POSTGRES_USER='postgres' -d postgres:9.4

mvn clean spring-boot:run

```

Congratulation, app is ready to use :tada:	:confetti_ball: :balloon:

### Queries for GraphQL

#### Find Author

###### Request

```graphql
query {
  findAuthor(name: "Mateus") {
    id,
    name,
    books {
      name
      isbn
    }
  }
}
```

#### Find All Authors

###### Request

```graphql
query {
  findAllAuthors {
    id,
    name,
    books {
      name
      isbn
    }
  }
}
```

Thank you! :smiley:	


