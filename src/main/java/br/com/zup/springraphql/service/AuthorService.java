package br.com.zup.springraphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import br.com.zup.springraphql.model.Author;
import br.com.zup.springraphql.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public Author findAuthor(String name) {
		return authorRepository.findByName(name);
	}
	
	public List<Author> findAll(){
		return authorRepository.findAll();
	}
	
	public Author save(Author author) {
		return authorRepository.save(author);
	}
	
}
