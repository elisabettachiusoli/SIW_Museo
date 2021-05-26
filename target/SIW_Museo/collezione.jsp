<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width">
<!-- logo -->
<link rel=icon href="museo.png">
<title>Museo</title>
<link rel="stylesheet" href="stili/collezione.css">
<link rel="preconnect" href="https://fonts.gstatic.com">

<!--reset css-->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css"
	integrity="sha512-NmLkDIU1C/C88wi324HBc+S2kLhi08PN5GDeUVVVC/BVt/9Izdsc9SVeVfA1UZbY3sHUlDSyRXhCzHfr6hmPPw=="
	crossorigin="anonymous" />
<!--font preso da google-->
<link
	href="https://fonts.googleapis.com/css2?family=Inter:wght@200;300;600;900&display=swap"
	rel="stylesheet">

</head>
<body>
	<nav>
		<!-- caricamento immagine logo a sinistra con uno spazio prima del nome della agenzia -->
		<div class="titolo">
			<img src="logo.png" width="80px" height="70px" align="left"
				hspace="30px" />
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
	<section>
		<section id="title">
			<h1 class="big-text">Collezione</h1>
		</section>
		<section id="descrizione">
			<h3 class="med-text">Nome Collezione</h3>
			<h4 class="normal-text">a cura di Pippo Pluto</h4>
			<div class="testo">
				<p>
					aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
					aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
					aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
				</p>
			</div>
		</section>
		<section id="lista">
			<div class="img1">
				<img src="opera1.jpg" width="300" height="200" hspace="15"
					vspace="15"> <a href="opera.jsp" class="descr">Nome Opera</a>
				<a href="artista.jsp" class="descr">Nome Artista</a>
			</div>
			<div class="img2">
				<img src="opera2.jpg" width="300" height="200" hspace="15"
					vspace="15"> <a href="opera.jsp" class="descr">Nome Opera</a>
				<a href="artista.jsp" class="descr">Nome Artista</a>
			</div>
			<div class="img3">
				<img src="opera3.jpg" width="300" height="200" hspace="15"
					vspace="15"> <a href="opera.jsp" class="descr">Nome Opera</a>
				<a href="artista.jsp" class="descr">Nome Artista</a>
			</div>
			<div class="img4">
				<img src="opera4.jpg" width="300" height="200" hspace="15"
					vspace="15"> <a href="opera.jsp" class="descr">Nome Opera</a>
				<a href="artista.jsp" class="descr">Nome Artista</a>
			</div>
		</section>
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