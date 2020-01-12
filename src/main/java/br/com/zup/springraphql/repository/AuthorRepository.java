package br.com.zup.springraphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;

import br.com.zup.springraphql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

	Author findByName(String name);
	
}
