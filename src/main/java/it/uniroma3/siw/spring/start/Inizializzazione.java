package it.uniroma3.siw.spring.start;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import it.uniroma3.siw.spring.model.Credentials;
import it.uniroma3.siw.spring.model.Curatore;
import it.uniroma3.siw.spring.model.User;
import it.uniroma3.siw.spring.service.CredentialsService;
import it.uniroma3.siw.spring.service.CuratoreService;
import it.uniroma3.siw.spring.service.UserService;

@Component
public class Inizializzazione implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private UserService userService;
	
	@Autowired
	private CredentialsService credentialService;
	
	@Autowired
	private CuratoreService curatoreService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		User user1 = new User();
		user1.setNome("user1");
		user1.setCognome("user1");
		userService.saveUser(user1);
		
		Credentials credentials1 = new Credentials();
		credentials1.setUsername("admin");
		credentials1.setRole("ADMIN");
		credentials1.setPassword("admin");
		credentials1.setUser(user1);
		credentialService.saveCredentials(credentials1);
		
		User user2 = new User();
		user2.setNome("user2");
		user2.setCognome("user2");
		userService.saveUser(user2);
		
		Credentials credentials2 = new Credentials();
		credentials2.setUsername("default");
		credentials2.setPassword("default");
		credentials2.setRole("DEFAULT");
		credentials2.setUser(user2);
		credentialService.saveCredentials(credentials2);
		
		Curatore curatore1=new Curatore();
		curatore1.setNome("Serena");
		curatore1.setCognome("Bruni");
		curatore1.setDataDiNascita(LocalDate.of(1975, 10, 20));
		curatore1.setLuogoDiNascita("Roma");
		curatore1.setEmail("serena@gmail.com");
		curatore1.setNumeroDiTelefono(38845621);
		curatore1.setMatricola(123);
		curatoreService.inserisci(curatore1);
	}
}
