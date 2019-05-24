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
<%! ServicioClientes srvCli; %>
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
        <h1>Listado clientes</h1>
        
        <table border="2">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tr><td>Aaaaa</td><td>aaa@aaa</td></tr>
            <tr><td>Aaaaa</td><td>aaa@aaa</td></tr>
            <tr><td>Aaaaa</td><td>aaa@aaa</td></tr>
        </table>
    </body>
</html>
