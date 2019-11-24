<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Commander League</title>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="css/estilos.css" >
    </head>
    <body class="body">



        <div id="login">

            <form action="MyServlet" method="post" name="servlet">

                <fieldset class="fieldset">


                    <p> <span> <img class="icon" src="img/login.png" alt="logo de login"> </span>
                        <input type="text" name="usuario" id="usuario"  value=""  placeholder="Ingrese usuario" maxlength="30" > </p>
                    <p> <span> <img class="icon" src="img/pass.png" alt="logo de password"> </span> 
                        <input type="password" name="pass" id="pass" value="" placeholder="**********" > </p>

                    <p>
                        <input type="submit" value="acceder"  name="aceptar">
                        <input type="reset" value="cancelar" name="cancelar">
                    </p>
                    <a href= "https://www.google.com.ar" >google </a> 
                </fieldset>
                
            </form>
            <script src="js/validacion.js"></script>
        </div>




    </body>
</html>