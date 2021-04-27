package it.uniroma3.siw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

public class Artista {
	
	@Getter
	@Setter
	private String nome;
	
	@Getter
	@Setter
	private String cognome;
	
	@Getter
	@Setter
	private Date dataDiNascita;
	
	@Getter
	@Setter
	private String luogoDiNascita;
	
	@Getter
	@Setter
	private Date dataDiMorte;
	
	@Getter
	@Setter
	private String luogoDiMorte;
	
	@Getter
	@Setter
	private String nazionalita;
	
	@OneToMany(mappedBy="artisti")
	private List<Opera> opere;
	
	public Artista() {
		this.opere=new ArrayList<>();
	}
}
