<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <title>Museo</title>
    <link rel="stylesheet" href="stili/style.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    
    <!--reset css-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css" integrity="sha512-NmLkDIU1C/C88wi324HBc+S2kLhi08PN5GDeUVVVC/BVt/9Izdsc9SVeVfA1UZbY3sHUlDSyRXhCzHfr6hmPPw==" crossorigin="anonymous" />
    <!--font preso da google-->
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@200;300;600;900&display=swap" rel="stylesheet">

</head>
<body>
    <div class="header">
        <div class="logo">
            <img src="logo.png" width="60" height="60" align="left" hspace="30">
        </div>
        <ul class="menu">
            <!--menu a tendina-->
            <li>
                <a href="">Menu</a>
                <ul>
                    <li><a href="artista.jsp">Autori</a></li>
                    <li><a href="collezione.jsp">Collezioni</a></li>
                    <li><a href="#">Informazioni</a></li>
                </ul>
            </li>
        </ul>
       </div>

    <div class="hero">
        <!--elemento del content-->
        <div class="hero__content">
            <p class="normal-text">Benvenuti al</p>
            <h1 class="big-text">Nome del Museo</h1>
        </div>
        <div id="slider">
        
            <figure>
                <img src="opera1.jpg" class="m1">
                <img src="opera2.jpg" class="m2">
                <img src="opera3.jpg" class="m3">
                <img src="opera4.jpg" class="m4">
                <img src="opera1.jpg" class="m1">
            </figure>
              </div>      
            
    </div>
</body>
</html>