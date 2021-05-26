<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<!-- logo -->
<link rel=icon href="museo.png">
<!-- titolo mostrato per la pagina dell'itinerario -->
<title>Informazioni</title>
<!-- riferimento al foglio di stile css chiamato stile in stili relativo a tutto il progetto -->
<link rel="stylesheet" href="stili/informazioni.css" />
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

		</ul>


	</nav>

	<section class="parallax">
		<div class="parallax-inner">Informazioni</div>
	</section>
	<section>
		<div class="info">
			<p>
				ORARI: <br> Lun-Ven 9:00-17:00 <br> Sab-Dom 9:00-20:00 <br>

				NOTTE BIANCA: 20 giugno 21:00-00:00
			</p>
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
				<img src="logoBianco.png" height="60" widht="60" align="right">
			</div>
		</div>
	</div>
</body>
</html>