package it.uniroma3.siw.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

public class Collezione {
	
	@Getter
	@Setter
	private String nome;
	
	@Getter
	@Setter
	private String descrizione;
	
	@OneToMany(mappedBy="collezioni")
	private List<Opera> opere;
	
	@ManyToOne
	private List<Museo> museo;
	
	@ManyToOne
	private List<Curatore> curatore;
	
	public Collezione() {
		this.opere=new ArrayList<>();
		this.museo=new ArrayList<>();
		this.curatore=new ArrayList<>();
	}
}
