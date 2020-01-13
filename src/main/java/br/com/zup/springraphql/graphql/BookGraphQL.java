package br.com.zup.springraphql.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.zup.springraphql.model.Book;
import br.com.zup.springraphql.service.BookService;

@Component
public class BookGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private BookService bookService;
	
	public Book createBook(Book book, Long idAuthor) {
		return bookService.createBook(book, idAuthor);
	}
	
}
