<%-- 
    Document   : login
    Created on : 27-may-2019, 12:33:15
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>       
        <%@include file="cabecera.jsp" %>
        <h2>Login</h2>
        <form name="form1" id="form1" method="post" 
              action="login.do">
            <label for="email">Email:</label> 
            <input id="email" name="email" type="email" 
                   required="required" size="50" maxlength="250"/>
            <br/>
            <label for="password">Password</label> 
            <input id="password" name="password" type="password" 
                   required="required" size="50" maxlength="50"/>
            <input type="hidden" name="password_encrip"
                   id="password_encrip"/>
            <br/>
            <input type="reset" value="Limpiar"/>
            <input type="submit" value="LOGIN"/>            
        </form>
        <script src="js/md5.min.js"></script>
        <script src="js/encriptacion.js"></script>
    </body>
</html>
