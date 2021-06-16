package it.uniroma3.siw.spring.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import it.uniroma3.siw.spring.controller.validator.ArtistaValidator;
import it.uniroma3.siw.spring.controller.validator.OperaValidator;
import it.uniroma3.siw.spring.model.Artista;
import it.uniroma3.siw.spring.model.Opera;
import it.uniroma3.siw.spring.service.ArtistaService;
import it.uniroma3.siw.spring.service.FileUploadService;
import it.uniroma3.siw.spring.service.OperaService;

@Controller
public class OperaController {
@Autowired
private ArtistaService artistaService;
@Autowired
private OperaService operaService;

@Autowired
private OperaValidator operaValidator;
@Autowired
private FileUploadService fileService;

@RequestMapping(value="/admin/addOpera", method = RequestMethod.GET)
public String addOpera(Model model) {
	model.addAttribute("opera", new Opera());
	model.addAttribute("artisti", this.artistaService.tutti());
    return "operaForm";
}

@RequestMapping(value = "/opera/{id}", method = RequestMethod.GET)
public String getArtista(@PathVariable("id") Long id, Model model) {
	model.addAttribute("opera", this.operaService.operaPerId(id));
	model.addAttribute("artisti", this.operaService.operaPerId(id).getArtista());
	return "opera";
}

  @RequestMapping(value = "/opere", method = RequestMethod.GET)
    public String getArtisti(Model model) {
    		model.addAttribute("opera", this.operaService.tutti());
    		return "opere";
    }
    
    @RequestMapping(value = "/admin/opera", method = RequestMethod.POST)
    public String addArtista(@ModelAttribute("opera") Opera opera, @RequestParam("artistaSelezionato") final Long idArtista,
    									Model model, BindingResult bindingResult) {
    	this.operaValidator.validate(opera, bindingResult);
    	 if(! bindingResult.hasErrors()) {
        	this.operaService.inserisci(opera);
this.operaService.aggiungiArtista(opera, this.artistaService.artistaPerId(idArtista));
            model.addAttribute("opera", this.operaService.tutti());
            model.addAttribute("artisti", opera.getArtista());
    	 }
            return "opere";
    }

}
