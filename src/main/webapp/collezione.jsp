<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <title>Museo</title>
    <link rel="stylesheet" href="stili/collezione.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">

    <!--reset css-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css" integrity="sha512-NmLkDIU1C/C88wi324HBc+S2kLhi08PN5GDeUVVVC/BVt/9Izdsc9SVeVfA1UZbY3sHUlDSyRXhCzHfr6hmPPw==" crossorigin="anonymous" />
    <!--font preso da google-->
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@200;300;600;900&display=swap" rel="stylesheet">

</head>
<body>
<nav>
        <!-- caricamento immagine logo a sinistra con uno spazio prima del nome della agenzia -->
        <div class="titolo">
            <img src="logo.png" width="80px" height="70px" align="left" hspace="20px" /> <h2> Museo dell'arte impressionista </h2>
        </div>
        
        <ul>
            <li>
                <!-- collegamento ipertestuale alla home -->
                <a href="index.jsp"> Home </a>
            </li>
            <li>
                <!-- collegamento ipertestuale alla pagina itinerari -->
                <a href="artisti.jsp"> Artisti </a>
            </li>
            <li>
                <!-- collegamento ipertestuale alla pagina informazioni -->
                <a href="informazioni.jsp"> Informazioni</a>
            </li>
        </ul>
      
        
    </nav>
    <section id="titolo">
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
            <img src="opera1.jpg" width="300" height="200" hspace="15" vspace="15">
            <a href="opera.jsp" class="descr">Nome Opera</a>
            <a href="artista.jsp" class="descr">Nome Artista</a>
        </div>
        <div class="img2">
            <img src="opera2.jpg" width="300" height="200" hspace="15" vspace="15">
            <a href="opera.jsp" class="descr">Nome Opera</a>
            <a href="artista.jsp" class="descr">Nome Artista</a>
        </div>
        <div class="img3">
            <img src="opera3.jpg" width="300" height="200" hspace="15" vspace="15">
            <a href="opera.jsp" class="descr">Nome Opera</a>
            <a href="artista.jsp" class="descr">Nome Artista</a>
        </div>
        <div class="img4">
            <img src="opera4.jpg" width="300" height="200" hspace="15" vspace="15">
            <a href="opera.jsp" class="descr">Nome Opera</a>
            <a href="artista.jsp" class="descr">Nome Artista</a>
        </div>
    </section>
</body>
</html>