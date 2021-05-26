<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width">
<!-- logo -->
<link rel=icon href="museo.png">
<title>Museo dell'arte impressionista</title>
<link rel="stylesheet" href="stili/style.css">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/2.0.0/normalize.min.css"
	integrity="sha512-r55mjcDHW7eaxVq7wHjguH+oMetSweoBhj1GU9WHRY7j9/RED3Z0zcRiy5ELomhBcQoS3bFWjJyNz9OCVYyGlA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<link rel="preconnect" href="https://fonts.gstatic.com">


<!--font preso da google per nome museo-->
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+HK:wght@700&display=swap"
	rel="stylesheet">
<!--font preso da google per testo-->
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+HK:wght@100&display=swap"
	rel="stylesheet">

</head>
<body>
	<input type="checkbox" id="btn-nav" class="checkbox">
	<header>
		<div class="header-container">
			<img class="header-logo" src="logo.png" width="60" height="60"
				align="left"> <label for="btn-nav" class="btn-label"
				align="center">
				<div class="header-button"></div>
			</label>
		</div>
	</header>
	<nav class="menu">
		<ul>
			<li><a href="artista.jsp">Autori</a></li>
			<li><a href="collezione.jsp">Collezioni</a></li>
			<li><a href="informazioni.jsp">Informazioni</a></li>
		</ul>
	</nav>

	<div class="hero">
		<!--elemento del content-->
		<div class="hero__content">
			<h2 class="med-text">Benvenuti al</h2>
			<h1 class="big-text">Museo dell'arte impressionista</h1>
		</div>


		<div id="slider">
			<figure>
				<input type="radio" name="slider" id="img1" checked>
				<input type="radio" name="slider" id="img2">
				<input type="radio" name="slider" id="img3">
				<input type="radio" name="slider" id="img4">
				<input type="radio" name="slider" id="img1">
				<img src="opera1.jpg" class="m1" alt="img1">
				<img src="opera2.jpg" class="m2" alt="img2">
				<img src="opera3.jpg" class="m3" alt="img3">
				<img src="opera4.jpg" class="m4" alt="img4">
				<img src="opera1.jpg" class="m1" alt="img1">
			</figure>

			<div class="dots">
				<label for="img1"></label> <label for="img2"></label> <label
					for="1mg3"></label> <label for="img4"></label>

			</div>
		</div>
	</div>
	<section id="aboutUs">
		<div>
			<h2>About Us</h2>
			Il Museo dell'arte impressionista nasce circa trent'anni fa, quando
			la passione e l'amore per l'arte condussero Matteo Rossi, tuttora
			fondatore e direttore del museo, ad aprire una piccola mostra di
			quadri in una delle sue residenze. </br> Da allora, il Museo dell'arte
			impressionista ha continuato ad espandersi, grazie anche all'aiuto di
			molti benefattori, portando alla raccolta di opere che possiamo
			ammirare noi oggigiorno
		</div>
		<div>
			<div>
				<h3>Servizi:</h3>
				<br> <img src="stili/services.jpg" class="services"
					height="150" width="1200">
			</div>

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