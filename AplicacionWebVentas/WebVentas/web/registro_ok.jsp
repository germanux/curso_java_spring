<%@page import="com.sinensia.modelo.logica.ServicioClientes"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page import="com.sinensia.modelo.*" %>
<html>
    <head>
        <title>Registro Ok</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%= (new ServicioClientes()).obtenerUno("prueba@email.com").getNombre() %>
        
       <% for (int i = 0; i < 10; i++) 
       {
           %>
           
        <div>Registro Ok</div>
        
           <%
       } %>
        
    </body>
</html>
