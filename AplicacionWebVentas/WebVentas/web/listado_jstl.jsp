<%-- 
    Document   : listado_jstl.jsp
    Created on : 24-may-2019, 13:50:05
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sinensia.modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- List<Cliente> listaCliPorNombre = (ArrayList< Cliente>) request.getAttribute("listaPorNombre"); --%>
<jsp:useBean id="listaPorNombre" type="java.util.ArrayList<Cliente>"
             scope="session">
    <jsp:getProperty property="*" name="listaPorNombre"/>
</jsp:useBean>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista con Beans</title>
    </head>
    <body>
        <%@include file="cabecera.jsp" %>
        <h2>Listado clientes</h2>

        <table border="2">
            <thead>
                <tr><th>Nombre</th>
                    <th>Email</th></tr>
            </thead>
            <%-- Manera rollo JSP medio cutre --%>
            <%-- for (int i = 0; i < listaCliPorNombre.size(); i++) {--%>
            <c:forEach items="${listaPorNombre}" var="cli">

            <%--<tr><td><%= listaCliPorNombre.get(i).getNombre()%> </td>
                <td><%= listaCliPorNombre.get(i).getEmail()%> </td></tr> --%>
            <tr><td>${cli.nombre} </td><td>${cli.email}</td></tr>

            <%--   } --%>
            </c:forEach>
        </table>
    </body>
</html>
