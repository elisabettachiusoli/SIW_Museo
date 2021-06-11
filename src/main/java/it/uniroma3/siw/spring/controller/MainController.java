package it.uniroma3.siw.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController {
	@RequestMapping(value={"/", "index"}, method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }
	
	@RequestMapping(value={"/home"}, method = RequestMethod.GET)
    public String home(Model model) {
        return "home";
    }
	
	@RequestMapping(value="/artista", method = RequestMethod.GET)
    public String artista(Model model) {
        return "artista";
    } /*
	
	   
	   @RequestMapping(value="/collezione", method = RequestMethod.GET)
	    public String getGuida() {
	        return "collezione.html";
	    }
	   
	   @RequestMapping(value="/opera", method = RequestMethod.GET)
	    public String getMonumento() {
	    	
	        return "opera.html";
	    }
	   @RequestMapping(value="/informazioni", method = RequestMethod.GET)
	    public String getInfo() {
	        return "informazioni.html";
	    }*/
}
