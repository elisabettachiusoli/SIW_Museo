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
	
	public Long getId() {
		return this.id;
	}
	public String getTitolo() {
		return this.titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo=titolo;
	}
	public int getAnno() {
		return this.anno;
	}
	public void setAnno(int anno) {
		this.anno=anno;
	}
	public String getDescrizione() {
		return this.descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione=descrizione;
	}
	public Artista getArtista() {
		return this.artista;
	}
	public void setArtista(Artista artista) {
		this.artista=artista;
	}
	public List<Collezione> getCollezioni() {
		return this.collezioni;
	}
	public void setCollezioni(Collezione collezione) {
		this.collezioni.add(collezione);
	}
}
