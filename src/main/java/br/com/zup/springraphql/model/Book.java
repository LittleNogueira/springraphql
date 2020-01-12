package br.com.zup.springraphql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "books")
@Getter	@Setter
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_book")
	private Long id;
	
	@Column(name = "tx_name")
	private String name;
	
	@Column(name = "nb_isbn")
	private Integer isbn;
	
}
