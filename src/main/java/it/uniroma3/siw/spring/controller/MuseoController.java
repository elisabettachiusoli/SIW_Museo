package it.uniroma3.siw.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class MuseoController {
	
	  @RequestMapping(value="/artista", method = RequestMethod.GET)
	    public String getItinerario() {
		   
	        return "artista.html";
	    }
	   
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
	    }
}
