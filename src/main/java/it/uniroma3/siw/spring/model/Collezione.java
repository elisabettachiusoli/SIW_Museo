package it.uniroma3.siw.spring.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Collezione {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;

	@Column(nullable=false, length=3000)
	private String descrizione;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Opera> opere;
	
	@ManyToOne
	private Museo museo;
	
	@ManyToOne
	private Curatore curatore;
	
	public Collezione() {
		this.opere=new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<Opera> getOpere() {
		return opere;
	}

	public void setOpere(List<Opera> opere) {
		this.opere = opere;
	}
	public void addOpera(List<Opera>  opera) {
		this.opere.addAll(opera);
	}

	public Museo getMuseo() {
		return museo;
	}

	public void setMuseo(Museo museo) {
		this.museo = museo;
	}

	public Curatore getCuratore() {
		return curatore;
	}

	public void setCuratore(Curatore curatore) {
		this.curatore = curatore;
	}
}
