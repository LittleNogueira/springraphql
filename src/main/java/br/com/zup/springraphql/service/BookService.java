package br.com.zup.springraphql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zup.springraphql.model.Book;
import br.com.zup.springraphql.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorService authorService;
	
	public Book createBook(Book book, Long idAuthor) {
		book.setAuthor(authorService.findById(idAuthor));
		return bookRepository.save(book);
	}
	
}
