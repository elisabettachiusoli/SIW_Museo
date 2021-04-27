package it.uniroma3.siw.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

public class Opera {
	
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
	private List<Artista> artisti;
	
	@ManyToOne
	private List<Collezione> collezioni;
	
	public Opera() {
		this.artisti=new ArrayList<>();
		this.collezioni=new ArrayList<>();
	}
}
