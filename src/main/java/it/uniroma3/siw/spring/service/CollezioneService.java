package it.uniroma3.siw.spring.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.spring.model.Artista;
import it.uniroma3.siw.spring.model. Collezione;
import it.uniroma3.siw.spring.model.Curatore;
import it.uniroma3.siw.spring.model.Opera;
import it.uniroma3.siw.spring.repository.ArtistaRepository;
import it.uniroma3.siw.spring.repository. CollezioneRepository;

@Service
public class CollezioneService {

	@Autowired
	private  CollezioneRepository  collezioneRepository; 
	
	@Transactional
	public Collezione inserisci( Collezione  collezione) {
		return  collezioneRepository.save(collezione);
	}

	@Transactional
	public List< Collezione> tutti() {
		return (List< Collezione>) collezioneRepository.findAll();
	}

	@Transactional
	public  Collezione  collezionePerId(Long id) {
		Optional< Collezione> optional =  collezioneRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		else 
			return null;
	}
	public void aggiungiOpera(final Collezione collezione, final List<Opera> opera) {
        collezione.addOpera(opera);
        this.collezioneRepository.save(collezione);
    }

	@Transactional
	public boolean alreadyExists( Collezione  collezione) {
		List< Collezione> collezioni = this. collezioneRepository.findByNome( collezione.getNome());
		if (collezioni.size() > 0)
			return true;
		else 
			return false;
	}

	public void aggiungiCuratore(Collezione collezione, Curatore curatore) {
		collezione.setCuratore(curatore);
        this.collezioneRepository.save(collezione);
		
	}
	
	@Transactional
	public void eliminaCollezione(Collezione collezione) {
		collezioneRepository.delete(collezione);
		
	}
}
