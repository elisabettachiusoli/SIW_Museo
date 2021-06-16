package it.uniroma3.siw.spring.start;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import it.uniroma3.siw.spring.model.Artista;
import it.uniroma3.siw.spring.model.Collezione;
import it.uniroma3.siw.spring.model.Credentials;
import it.uniroma3.siw.spring.model.Curatore;
import it.uniroma3.siw.spring.model.Opera;
import it.uniroma3.siw.spring.model.User;
import it.uniroma3.siw.spring.service.ArtistaService;
import it.uniroma3.siw.spring.service.CollezioneService;
import it.uniroma3.siw.spring.service.CredentialsService;
import it.uniroma3.siw.spring.service.CuratoreService;
import it.uniroma3.siw.spring.service.OperaService;
import it.uniroma3.siw.spring.service.UserService;

@Component
public class Inizializzazione implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private UserService userService;
	
	@Autowired
	private CredentialsService credentialService;
	
	@Autowired
	private CuratoreService curatoreService;
	
	@Autowired
	private CollezioneService collezioneService;
	
	@Autowired
	private ArtistaService artistaService;
	
	@Autowired
	private OperaService operaService;
	
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
		
		Collezione collezione1 = new Collezione();
		collezione1.setCuratore(curatore1);
		collezione1.setNome("Galleria dell'arte impressionista e post-impressionista");
		collezione1.setDescrizione("Dal 16 giugno al <strong> Museo dell'arte impressionista apre la mostra Impressionisti e Post-impressionisti, prodotta e organizzata da Serena Bruni. \r\n"
									+ "Per celebrare l'apertura del Museo saranno esposte oltre 50 opere dei più grandi maestri dell’impressionismo (Claude Monet, Edgar Degas, Edouard Manet, Pierre Auguste Renoir) e del post impressionismo ( Vincent van Gogh).\r\n"
									+ "Opere provenienti da collezioni private raramente accessibili e concessi eccezionalmente per questa mostra.");
		collezioneService.inserisci(collezione1);
		
		Artista artista1 = new Artista();
		artista1.setNome("Vincent");
		artista1.setCognome("van Gogh");
		artista1.setDataDiNascita("30 marzo 1853");
		artista1.setLuogoDiNascita("Zundert, Paesi Bassi");
		artista1.setDataDiMorte("29 luglio 1890");
		artista1.setLuogoDiMorte("Auvers-sur-Oise, Francia");
		artista1.setNazionalita("Olandese");
		artista1.setDescrizione("Fu autore di quasi novecento dipinti e di più di mille\r\n"
								+ "disegni, senza contare i numerosi schizzi non portati a termine.\r\n"
								+ "Tanto geniale quanto incompreso se non addirittura disprezzato in\r\n"
								+ "vita, Van Gogh influenzò profondamente l'arte del XX secolo.\r\n"
								+ "Iniziò a disegnare da bambino nonostante le critiche del padre,\r\n"
								+ "pastore protestante che continuo' ad impartirgli delle norme severe.\r\n"
								+ "Iniziò a dipingere tardi, all'età di ventisette anni,realizzando\r\n"
								+ "molte delle sue opere più note nel corso degli ultimi due anni di\r\n"
								+ "vita. Dopo aver trascorso diversi anni soffrendo di frequenti\r\n"
								+ "disturbi mentali, morì all'età di trentasette anni. I suoi\r\n"
								+ "soggetti consistevano in autoritratti, paesaggi, nature morte di\r\n"
								+ "fiori, dipinti con cipressi, rappresentazione di campi di grano e\r\n"
								+ "girasoli.");
		artistaService.inserisci(artista1);
		
		Opera opera1 = new Opera();
		opera1.setArtista(artista1);
		opera1.setTitolo("Notte stellata");
		opera1.setAnno(1889);
		opera1.setCollezioni(collezione1);
		opera1.setDescrizione("Nel 1888, prima dell'internamento a Saint-Rémy, van Gogh scrisse: \r\n"
				+ "Con un quadro vorrei poter esprimere qualcosa di commovente come una musica. Vorrei dipingere uomini e donne con un non so che di eterno, di cui un tempo era simbolo l’aureola, e che noi cerchiamo di rendere con lo stesso raggiare, con la vibrazione dei colori [...].Ah il ritratto, il ritratto che mostri i pensieri, l’anima del modello: ecco cosa credo debba vedersi\"\r\n"
				+ "\r\n"
				+ "La Notte stellata, certamente una delle opere vangoghiane più celebri, risponde perfettamente a quest'esigenza. In questo dipinto, infatti, il pittore ha certamente cercato il contatto diretto con la realtà, dipingendo quello che si poteva vedere dalla finestra della sua stanza nel manicomio di Saint-Rémy. Van Gogh, tuttavia, non ha ripreso fedelmente questa veduta notturna, bensì l'ha manipolata con mezzi plastici, interiorizzandola fino allo spasimo e trasformandola in una potente visione onirica in cui poter fare affiorare le sue emozioni, le sue paure, i suoi viaggi dell'anima. La Notte stellata, pertanto, non offre all'osservatore un'immagine fedele della realtà, quanto una forma di «espressione» di quest'ultima.");
		opera1.setFile("https://www.milanoplatinum.com/wp-content/uploads/2016/12/Vincent-van-Gogh-Notte-stellata.jpg");
		operaService.inserisci(opera1);
	}
}
