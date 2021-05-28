package it.uniroma3.siw.spring.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Artista {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Getter
	@Setter
	private String nome;
	
	@Getter
	@Setter
	private String cognome;
	
	@Getter
	@Setter
	private LocalDate dataDiNascita;
	
	@Getter
	@Setter
	private String luogoDiNascita;
	
	@Getter
	@Setter
	private LocalDate dataDiMorte;
	
	@Getter
	@Setter
	private String luogoDiMorte;
	
	@Getter
	@Setter
	private String nazionalita;
	
	@OneToMany(mappedBy="artista")
	private List<Opera> opere;
	
	public Artista() {
		this.opere=new ArrayList<>();
	}
}
