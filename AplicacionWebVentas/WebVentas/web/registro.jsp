<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Registro</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%@include file="cabecera.jsp" %>
        <h2>Registro</h2>
        <form name="form1" id="form1" method="post" 
              action="clientes.do">
            <label for="nombre">Nombre:</label> 
            <input id="nombre" name="nombre" type="text" 
                   required="required" size="50" maxlength="50"/>
            <br/>
            <label for="email">Email:</label> 
            <input id="email" name="email" type="email" 
                   required="required" size="50" maxlength="250"/>
            <br/>
            <label for="edad">Edad: </label> 
            <input id="edad" name="edad" type="number" 
                   required="required" size="3" max="200" min="1"/>
            <br/>
            <label for="activo">Activo: </label> 
            <input id="activo" name="activo" type="checkbox" 
                   required="required" checked="checked"/>
            <br/>
            <label for="password">Password</label> 
            <input id="password" name="password" type="password" 
                   required="required" size="50" maxlength="50"/>
            <input type="hidden" name="password_encrip"
                   id="password_encrip"/>
            <br/>
            <input type="reset" value="Limpiar"/>
            <input type="submit" value="Enviar"/>            
        </form>
        <script src="js/md5.min.js"></script>
        <script src="js/encriptacion.js"></script>
    </body>
</html>
