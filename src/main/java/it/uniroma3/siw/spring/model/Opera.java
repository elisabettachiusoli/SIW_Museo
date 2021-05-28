package it.uniroma3.siw.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Opera {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Getter
	@Setter
	private String titolo;
	
	@Getter
	@Setter
	private int anno;
	
	@Getter
	@Setter
	private String descrizione;
	
	@ManyToOne
	private Artista artista;
	
	@OneToMany
	private List<Collezione> collezioni;
	
	public Opera() {
		this.collezioni=new ArrayList<>();
	}
}
