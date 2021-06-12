package it.uniroma3.siw.spring.model;

import java.sql.Date;
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
public class Artista {
	
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
	private String descrizione;
	
	@Getter
	@Setter
	private String nazionalita;
	
	@OneToMany(mappedBy="artista")
	private List<Opera> opere;
	
	public Artista() {
		this.opere=new ArrayList<>();
	}
	public Long getId() {
		return this.id;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getCognome() {
		return this.cognome;
	}
	public void setCognome(String cognome) {
		this.cognome=cognome;
	}
	public String getLuogoDiNascita() {
		return this.luogoDiNascita;
	}
	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita=luogoDiNascita;
	}
	public String getLuogoDiMorte() {
		return this.luogoDiMorte;
	}
	public void setLuogoDiMorte(String luogoDiMorte) {
		this.luogoDiMorte=luogoDiMorte;
	}
	public Date getDataDiNascita() {
		return this.dataDiNascita;
	}
	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita=dataDiNascita;
	}
	public Date getDataDiMorte() {
		return this.dataDiMorte;
	}
	public void setDataDiMorte(Date dataDiMorte) {
		this.dataDiMorte=dataDiMorte;
	}
	public String getNazionalita() {
		return this.nazionalita;
	}
	public void setNazionalita(String nazionalita) {
		this.nazionalita=nazionalita;
	}
	public List<Opera> getOpere() {
		return this.opere;
	}
	public void setOpera(Opera opera) {
		this.opere.add(opera);
	}
	public String getDescrizione() {
		return this.descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione=descrizione;
	}
	
}
