package br.com.zup.springraphql.service;

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
		return this.authorRepository.findByName(name);
	}
	
}
