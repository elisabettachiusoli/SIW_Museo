<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <!-- logo -->
    <link rel=icon href="museo.png" >
    <!-- titolo mostrato per la pagina dell'itinerario -->
    <title> Artista </title>
    <!-- riferimento al foglio di stile css chiamato stile in stili relativo a tutto il progetto -->
    <link rel="stylesheet" href="stili/artista.css" />
</head>
<body>
<nav>
        <!-- caricamento immagine logo a sinistra con uno spazio prima del nome della agenzia -->
        <div class="titolo">
            <img src="logo.png" width="80px" height="70px" align="left" hspace="20px" /> <h2> Museo dell'arte impressionista </h2>
        </div>
        
        <ul >
            <li >
                <!-- collegamento ipertestuale alla home -->
                <a  href="index.jsp"> Home </a>
            </li>
            <li >
                <!-- collegamento ipertestuale alla pagina itinerari -->
                <a  href="artisti.jsp"> Autori </a>
            </li>
            <li >
                <!-- collegamento ipertestuale alla pagina itinerari -->
                <a  href="collezione.jsp"> Collezioni </a>
            </li>
            <li >
                <!-- collegamento ipertestuale alla pagina informazioni -->
                <a  href="informazioni.jsp"> Informazioni</a>
            </li>
        </ul>
      
        
    </nav>
    
  <section class="parallax">
    <div class="parallax-inner">
     Vincent Van Gogh
    </div>        
    </section>

    <section id="biografia">
    Zundert, 30 marzo 1853 â€“ Auvers-sur-Oise, 29 luglio 1890
        <div class="bio">
            <p>
                Fu autore di quasi novecento dipinti e di più di mille disegni, senza contare i numerosi schizzi non portati a termine. 
                Tanto geniale quanto incompreso se non addirittura disprezzato in vita, Van Gogh influenzo' profondamente l'arte del XX secolo.
                 Inizio' a disegnare da bambino nonostante le critiche del padre, pastore protestante che continuo' ad impartirgli delle norme severe.
                 Inizio' a dipingere tardi, all'etÃ  di ventisette anni,realizzando molte delle sue opere piu' note nel corso degli ultimi due anni di vita.
                 Dopo aver trascorso diversi anni soffrendo di frequenti disturbi mentali, mori' all'età  di trentasette anni.
I suoi soggetti consistevano in autoritratti, paesaggi, nature morte di fiori, dipinti con cipressi, rappresentazione di campi di grano e girasoli. 
            </p>
        </div>

    </section>

    <section id="opera">
        <div>
            <h2 class="primo">  </h2> <h2 > OPERE </h2> <h2 class="primo">  </h2>
        </div>
        <div>
            <img src="stili/notteStellata.jpg" width="300px" height="200px" hspace="15px" vspace="15px" />
            <img src="opera2.jpg" width="300px" height="200px" hspace="15px" vspace="15px" />
            <img src="stili/patate.jpg" width="300px" height="200px" hspace="15px" vspace="15px" />
            <img src="stili/autoritratto.jpg" width="300px" height="200px" hspace="15px" vspace="15px" />
        </div>
        <div>
            <a href="opera.jsp" class="descr"> Notte stellata</a> <a href="opera.jsp" class="descr"> Notte stellata sul rodano </a> <a href="opera.jsp" class="descr"> I mangiatori di patate</a> <a href="opera.jsp" class="descr"> Autoritratto</a> 
        </div>
        <div>
            <img src="stili/girasoli.jpg" width="300px" height="200px" hspace="15px" vspace="15px" />
            <img src="stili/grano.jpg" width="300px" height="200px" hspace="15px" vspace="15px" />
            <img src="stili/iris.jpg" width="300px" height="200px" hspace="15px" vspace="15px" />
            <img src="stili/casa.jpg" width="300px" height="200px" hspace="15px" vspace="15px" />
        </div>
        <div>
            <a href="opera.jsp" class="descr2">I girasoli </a>  <a href="opera.jsp" class="descr2"> Campo di grano con volo di corvi</a> <a href="opera.jsp" class="descr2"> Iris</a> <a href="opera.jsp" class="descr2"> La Camera di Vincent ad Arles
</a>  
        </div>



    </section>
 
 

</body>
</html>