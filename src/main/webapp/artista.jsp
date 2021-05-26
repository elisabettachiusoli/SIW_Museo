<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<!-- logo -->
<link rel=icon href="museo.png">
<!-- titolo mostrato per la pagina dell'itinerario -->
<title>Artista</title>
<!-- riferimento al foglio di stile css chiamato stile in stili relativo a tutto il progetto -->
<link rel="stylesheet" href="stili/artista.css" />
</head>
<body>
	<nav>
		<!-- caricamento immagine logo a sinistra con uno spazio prima del nome della agenzia -->
		<div class="titolo">
			<img src="logo.png" width="80px" height="70px" align="left"
				hspace="20px" />
			<h2>Museo dell'arte impressionista</h2>
		</div>

		<ul>
			<li>
				<!-- collegamento ipertestuale alla home --> <a href="index.jsp">
					Home </a>
			</li>
			<li>
				<!-- collegamento ipertestuale alla pagina itinerari --> <a
				href="artisti.jsp"> Autori </a>
			</li>
			<li>
				<!-- collegamento ipertestuale alla pagina itinerari --> <a
				href="collezione.jsp"> Collezioni </a>
			</li>
			<li>
				<!-- collegamento ipertestuale alla pagina informazioni --> <a
				href="informazioni.jsp"> Informazioni</a>
			</li>
		</ul>


	</nav>

	<section class="parallax">
		<div class="parallax-inner">Vincent Van Gogh</div>
	</section>

	<section id="biografia">
		Zundert, 30 marzo 1853 â€“ Auvers-sur-Oise, 29 luglio 1890
		<div class="bio">
			<p>Fu autore di quasi novecento dipinti e di più di mille
				disegni, senza contare i numerosi schizzi non portati a termine.
				Tanto geniale quanto incompreso se non addirittura disprezzato in
				vita, Van Gogh influenzo' profondamente l'arte del XX secolo.
				Inizio' a disegnare da bambino nonostante le critiche del padre,
				pastore protestante che continuo' ad impartirgli delle norme severe.
				Inizio' a dipingere tardi, all'etÃ  di ventisette anni,realizzando
				molte delle sue opere piu' note nel corso degli ultimi due anni di
				vita. Dopo aver trascorso diversi anni soffrendo di frequenti
				disturbi mentali, mori' all'età  di trentasette anni. I suoi
				soggetti consistevano in autoritratti, paesaggi, nature morte di
				fiori, dipinti con cipressi, rappresentazione di campi di grano e
				girasoli.</p>
		</div>

	</section>

	<section id="opera">
		<div>
			<h2 class="primo"></h2>
			<h2>OPERE</h2>
			<h2 class="primo"></h2>
		</div>
		<div>
			<img src="stili/notteStellata.jpg" width="300px" height="200px"
				hspace="15px" vspace="15px" /> <img src="opera2.jpg" width="300px"
				height="200px" hspace="15px" vspace="15px" /> <img
				src="stili/patate.jpg" width="300px" height="200px" hspace="15px"
				vspace="15px" /> <img src="stili/autoritratto.jpg" width="300px"
				height="200px" hspace="15px" vspace="15px" />
		</div>
		<div>
			<a href="opera.jsp" class="descr"> Notte stellata</a> <a
				href="opera.jsp" class="descr"> Notte stellata sul rodano </a> <a
				href="opera.jsp" class="descr"> I mangiatori di patate</a> <a
				href="opera.jsp" class="descr"> Autoritratto</a>
		</div>
		<div>
			<img src="stili/girasoli.jpg" width="300px" height="200px"
				hspace="15px" vspace="15px" /> <img src="stili/grano.jpg"
				width="300px" height="200px" hspace="15px" vspace="15px" /> <img
				src="stili/iris.jpg" width="300px" height="200px" hspace="15px"
				vspace="15px" /> <img src="stili/casa.jpg" width="300px"
				height="200px" hspace="15px" vspace="15px" />
		</div>
		<div>
			<a href="opera.jsp" class="descr2">I girasoli </a> <a
				href="opera.jsp" class="descr2"> Campo di grano con volo di
				corvi</a> <a href="opera.jsp" class="descr2"> Iris</a> <a
				href="opera.jsp" class="descr2"> La Camera di Vincent ad Arles </a>
		</div>



	</section>

	<div class="contact">
		<div class="contact-map">
			<iframe
				src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d7275.595049006987!2d12.468425670076579!3d41.851402010556754!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xe70ced1e786fea34!2sUniversit%C3%A0+Degli+Studi+Roma+Tre+-+Dipartimento+di+Ingegneria!5e0!3m2!1sit!2sit!4v1496662417116"
				width="100%" height="auto" frameborder="0" style="border: 0"></iframe>
		</div>
		<div class="contact-info">
			<h1>Contatti</h1>
			<div class="dati">
				<h3>Indirizzo</h3>
				<p>Via Vito Volterra, 62, 00146 Roma RM</p>
				<h3>Numero di Telefono</h3>
				<p>+39 06 5733 2100</p>
				<h3>Email</h3>
				<p>museodellarteimpressionista@gmail.com</p>
			</div>
			<div class="logo">
				<img src="logoBianco.png" height="60" width="60" align="right">
			</div>
		</div>
	</div>

</body>
</html>