package br.com.zup.springraphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.springraphql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

	Author findByName(String name);
	
}
