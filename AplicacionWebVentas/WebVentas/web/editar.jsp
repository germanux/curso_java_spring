<%-- 
    Document   : editar
    Created on : 27-may-2019, 15:35:33
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar con REST</title>
    </head>
    <body>       
        <%@include file="cabecera.jsp" %>
        <h2>Editar con REST</h2>
        <form name="form1" id="form1">
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
            <input id="activo" name="activo" type="checkbox" checked="checked"/>
            <br/>
            <label for="password">Password</label> 
            <input id="password" name="password" type="password" 
                   required="required" size="50" maxlength="50"/>
            <input type="hidden" name="password_encrip"
                   id="password_encrip"/>
            <br/>
            <input type="reset" value="Limpiar"/>
            <input id="btn_modificar" type="button" value="Modificar"/>            
        </form>
        <div id="div_info" style="display: none">
            <p>Id : <span id="span_id">...</span></p>
            <p>Nombre : <span id="span_nombre">...</span></p>
            <p>Edad : <span id="span_edad">...</span></p>
            <p>Email : <span id="span_email">...</span></p>
            <p>Password : <span id="span_password">...</span></p>
            <p>Activo : <span id="span_activo">...</span></p>
        </div>
        <script src="js/md5.min.js"></script>
        <script src="js/encriptacion.js"></script>
        <script src="js/editar.js"></script>
    </body>
</html>
