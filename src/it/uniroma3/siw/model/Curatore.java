package it.uniroma3.siw.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Curatore {
	
	@Getter
	@Setter
	private String nome;
	
	@Getter
	@Setter
	private String cognome;
	
	@Getter
	@Setter
	private int numeroDiTelefono;
	
	@Getter
	@Setter
	private String email;
	
	@Getter
	@Setter
	private Date dataDiNascita;
	
	@Getter
	@Setter
	private String luogoDiNascita;
	
	@Getter
	@Setter
	private int matricola;

}
