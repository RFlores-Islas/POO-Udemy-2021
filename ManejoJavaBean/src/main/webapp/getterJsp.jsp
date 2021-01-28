<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee los valores del javaBean</title>
    </head>
    <body>
        <h1>JSP que lee los valores del javaBean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        <br/>
        valor base: <jsp:getProperty name="rectangulo" property="base" />
        <br/>
        Valor altura <jsp:getProperty name="rectangulo" property="altura" />
        <br/>
        Valor area: <jsp:getProperty name="rectangulo" property="area" />
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>