package br.com.zup.springraphql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_book")
	private Long id;
	
	@Column(name = "tx_name")
	private String name;
	
	@Column(name = "nb_isbn")
	private Integer isbn;
	
	@ManyToOne
	@JoinColumn(name = "id_author", nullable = false)
	private Author author;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	

}
