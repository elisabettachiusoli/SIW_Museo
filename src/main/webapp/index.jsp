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
                    <li><a href="">Autori</a></li>
                    <li><a href="">Collezioni</a></li>
                    <li><a href="">Informazioni</a></li>
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
        <!--image slider start-->
        <div class="slider">
            <div class="slides">
                <!--radio buttons start-->
                <input type="radio" name="radio-btn" id="radio1">
                <input type="radio" name="radio-btn" id="radio2">
                <input type="radio" name="radio-btn" id="radio3">
                <input type="radio" name="radio-btn" id="radio4">
                <!--radio buttons end-->
                <!--slide images start-->
                <div class="slide first">
                    <img src="opera1.jpg" alt="" width="500" height="400">
                </div>
                <div class="slide">
                    <img src="opera2.jpg" alt="">
                </div>
                <div class="slide">
                    <img src="opera3.jpg" alt="">
                </div>
                <div class="slide">
                    <img src="opera4.jpg" alt="">
                </div>
                <!--slide images end-->
                <!--automatic navigation start-->
                <div class="navigation-auto">
                    <div class="auto-btn1"></div>
                    <div class="auto-btn2"></div>
                    <div class="auto-btn3"></div>
                    <div class="auto-btn4"></div>
                </div>
                <!--automatic navigation end-->
            </div>
            <!--manual navigation start-->
            <div class="navigation-manual">
                <label for="radio1" class="manual-btn"></label>
                <label for="radio2" class="manual-btn"></label>
                <label for="radio3" class="manual-btn"></label>
                <label for="radio4" class="manual-btn"></label>
            </div>
            <!--manual navigation end-->
        </div>
    </div>
</body>
</html>