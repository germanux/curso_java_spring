<%-- 
    Document   : listado
    Created on : 24-may-2019, 9:29:41
    Author     : Admin
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.sinensia.modelo.logica.*" %>
<%@page import="com.sinensia.modelo.Cliente" %>
<%! ServicioClientes srvCli;%>
<% srvCli = new ServicioClientes();
    List<Cliente> clientes = srvCli.obtenerTodos();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado clientes</title>
    </head>
    <body>
        <%@include file="cabecera.jsp" %>
        <h2>Listado clientes</h2>

        <table border="2">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Email</th>
                </tr>
            </thead>
<%-- Manera rollo servlet cutre --%>
<% for (Cliente cli : clientes) {
        out.println("<tr><td>" + cli.getNombre() + "</td>");
        out.println("<td>" + cli.getEmail() + "</td></tr>");
    } %>
    
<%-- Manera rollo JSP medio cutre --%>
<% for (int i = 0; i < clientes.size(); i++) { %>
    
<tr><td><%= clientes.get(i).getNombre() %> </td>
    <td><%= clientes.get(i).getEmail()%> </td></tr>

<%   }   %>


        </table>
    </body>
</html>
