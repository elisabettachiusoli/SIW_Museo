<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <!-- logo -->
    <link rel=icon href="museo.png" >
    <title>Museo dell'arte impressionista</title>
    <link rel="stylesheet" href="stili/style.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/2.0.0/normalize.min.css" integrity="sha512-r55mjcDHW7eaxVq7wHjguH+oMetSweoBhj1GU9WHRY7j9/RED3Z0zcRiy5ELomhBcQoS3bFWjJyNz9OCVYyGlA==" crossorigin="anonymous" referrerpolicy="no-referrer" />

    <link rel="preconnect" href="https://fonts.gstatic.com">


    <!--font preso da google per nome museo-->
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+HK:wght@700&display=swap" rel="stylesheet">
    <!--font preso da google per testo-->
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+HK:wght@100&display=swap" rel="stylesheet">

</head>
<body>
    <input type="checkbox" id="btn-nav" class="checkbox">
    <header>
        <div class="header-container">
            <img class="header-logo" src="logo.png" width="60" height="60" align="left" >
            <label for="btn-nav" class="btn-label" align="center">
                <div class="header-button"></div>
            </label>
        </div>
    </header>
    <nav class="menu">
        <ul>
            <li><a href="artista.jsp">Autori</a></li>
            <li><a href="collezione.jsp">Collezioni</a></li>
            <li><a href="#">Informazioni</a></li>
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