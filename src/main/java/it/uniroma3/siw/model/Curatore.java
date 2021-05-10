package it.uniroma3.siw.model;

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
public class Curatore {
	
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
	private int numeroDiTelefono;
	
	@Getter
	@Setter
	private String email;
	
	@Getter
	@Setter
	private LocalDate dataDiNascita;
	
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
