package it.uniroma3.siw.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

public class Museo {
	
	@Getter
	@Setter
	private String nome;
	
	@Getter
	@Setter
	private String citta;
	
	@Getter
	@Setter
	private String indirizzo;
	
	@OneToMany(mappedBy="museo")
	private List<Collezione> collezioni;
	
	public Museo() {
		this.collezioni=new ArrayList<>();
	}

}
