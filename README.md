# SprinGraphQL

## About project

The principal objective of this project is study a little about <a href="https://graphql.org/" target="_blank" >GraphQL</a>.

### Configure project

Is required <a href="https://docs.docker.com/docker-for-windows/install/" target="_blank" >Docker</a>, <a href="https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html" target="_blank" >JDK</a> and <a href="https://maven.apache.org/" target="_blank" >Maven</a>

After clone this project, enter in the folder of the project and execute the followings commands.

```
cd /path/project/springraphql

docker run -p "5432:5432" -e POSTGRES_DB='springraphql' -e POSTGRES_PASSWORD='postgres' -e POSTGRES_USER='postgres' -d postgres:9.4

mvn clean spring-boot:run

```

Congratulations, app is ready to use in <a target="_blank">http://localhost:8080/graphiql</a> :tada:	:confetti_ball: :balloon:

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

### Mutations for GraphQL

#### Create Author

###### Request


```graphql
mutation {
  createAuthor(author:{
    name:"Novo usuario"
  }){
    id,
    name
  }
}
```

#### Create Book

###### Request


```graphql
mutation {
  createBook(book: {
    	name: "Novo livro", 
    	isbn: 4234
  }, idAuthor: 1000) {
    id
    name
  }
}
```

Thank you! :smiley:	
