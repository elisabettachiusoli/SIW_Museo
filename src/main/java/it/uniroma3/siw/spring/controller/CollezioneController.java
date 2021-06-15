package it.uniroma3.siw.spring.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import it.uniroma3.siw.spring.model.Collezione;
import it.uniroma3.siw.spring.model.Opera;
import it.uniroma3.siw.spring.repository.OperaRepository;
import it.uniroma3.siw.spring.service.CollezioneService;

@Controller
public class CollezioneController {

	@Autowired
	private CollezioneService collezioneService;
	private OperaRepository operaRepository;

	@RequestMapping(value="/admin/addCollezione", method = RequestMethod.GET)
	public String addOpera(Model model) {
		model.addAttribute("collezione", new Collezione());
		model.getAttribute("opera");
	    return "collezioneForm";
	}

	@RequestMapping(value = "/collezione/{id}", method = RequestMethod.GET)
	public String getArtista(@PathVariable("id") Long id, Model model) {
		model.addAttribute("collezione", this.collezioneService.collezionePerId(id));
		return "collezione";
	}

	  @RequestMapping(value = "/collezioni", method = RequestMethod.GET)
	    public String getArtisti(Model model) {
	    		model.addAttribute("collezione", this.collezioneService.tutti());
	    		return "collezioni";
	    }
	    
	    @RequestMapping(value = "/admin/collezione", method = RequestMethod.POST)
	    public String addProdotto(@ModelAttribute("collezione")Collezione collezione,
	    									Model model, BindingResult bindingResult) {
	    	//this.collezioneValidator.validate(collezione, bindingResult);  
	            //List<Opera> opera= operaRepository.findByTitolo(nome);
	           // collezione.addOpera(opera);
	            //for( Opera op : opera) 
	            //op.setCollezioni(collezione);
	            this.collezioneService.inserisci(collezione);
	            model.addAttribute("collezione", this.collezioneService.tutti());
	            return "collezione";

	}

}
