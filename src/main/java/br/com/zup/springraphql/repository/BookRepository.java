package br.com.zup.springraphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.springraphql.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}
