package it.uniroma3.siw.spring.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;


@Entity
public class Opera {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String titolo;
	
	@Column(nullable=false)
	private int anno;
	
	@Column(nullable=false, length=3000)
	private String descrizione;
	
	@ManyToOne
	private Artista artista;
	
<<<<<<< Updated upstream
	@OneToMany
=======
	
	@ManyToMany(mappedBy = "opere")
>>>>>>> Stashed changes
	private List<Collezione> collezioni;
	
	//private String linkFoto; -->getter e setter
	
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