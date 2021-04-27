package it.uniroma3.siw.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;

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
	
	@OneToMany(mappedBy="curatore")
	private List<Collezione> collezioni;
	
	public Curatore() {
		this.collezioni=new ArrayList<>();
	}

}
