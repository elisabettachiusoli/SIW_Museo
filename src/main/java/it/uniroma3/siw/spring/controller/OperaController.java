package it.uniroma3.siw.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.siw.spring.controller.validator.ArtistaValidator;
import it.uniroma3.siw.spring.controller.validator.OperaValidator;
import it.uniroma3.siw.spring.model.Artista;
import it.uniroma3.siw.spring.model.Opera;
import it.uniroma3.siw.spring.service.ArtistaService;
import it.uniroma3.siw.spring.service.OperaService;

@Controller
public class OperaController {
@Autowired
private ArtistaService artistaService;
@Autowired
private OperaService operaService;

@Autowired
private OperaValidator operaValidator;

@RequestMapping(value="/admin/addOpera", method = RequestMethod.GET)
public String addOpera(Model model) {
	model.addAttribute("opera", new Artista());
    return "operaForm";
}

@RequestMapping(value = "/opera/{id}", method = RequestMethod.GET)
public String getArtista(@PathVariable("id") Long id, Model model) {
	model.addAttribute("opera", this.operaService.operaPerId(id));
	return "opera";
}

  @RequestMapping(value = "/opere", method = RequestMethod.GET)
    public String getArtisti(Model model) {
    		model.addAttribute("opera", this.operaService.tutti());
    		return "opere";
    }
    
    @RequestMapping(value = "/admin/opera", method = RequestMethod.POST)
    public String addProdotto(@ModelAttribute("opera") Opera opera, Artista artista,
    									Model model, BindingResult bindingResult) {
    	this.operaValidator.validate(opera, bindingResult);
        	this.operaService.inserisci(opera);
            model.addAttribute("opera", this.operaService.tutti());
            for (Artista artisti:  this.artistaService.artistaPerNome(artista.getNome())) {
            opera.setArtista(artisti); }
            return "opere";
    }
}
