package br.com.zup.springraphql.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.zup.springraphql.model.Author;
import br.com.zup.springraphql.service.AuthorService;

@Component
public class AuthorGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver {

    @Autowired
    private AuthorService authorService;

    public Author findAuthor(String name){
        return authorService.findByName(name);
    }
    
    public List<Author> findAllAuthors(){
    	return authorService.findAll();
    }
    
    public Author createAuthor(Author author) {
    	return authorService.save(author);
    }
	
}
