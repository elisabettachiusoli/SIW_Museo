package it.uniroma3.siw.model;

import java.util.Date;

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

}
