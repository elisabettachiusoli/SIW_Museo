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
public class Collezione {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Getter
	@Setter
	private String nome;
	
	@Getter
	@Setter
	private String descrizione;
	
	@OneToMany(mappedBy="collezioni")
	private List<Opera> opere;
	
	@ManyToOne
	private Museo museo;
	
	@ManyToOne
	private Curatore curatore;
	
	public Collezione() {
		this.opere=new ArrayList<>();
	}
}
