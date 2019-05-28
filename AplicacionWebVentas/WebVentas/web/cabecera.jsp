<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header><h1>Web ventas</h1></header>
<nav>
    <c:if test="${login != 'ok'}">
        <a href="login.jsp">Login</a>
        <a href="registro.jsp">Nuevo cliente</a>
    </c:if>
<%-- TODO: Poner sólo cuando esté LOGIN --%>
    <a href="editar.jsp">Editar AJAX+REST</a>
    
    <c:if test="${login == 'ok'}">
        <a href="listado.jsp">Listado clientes</a>
        <a href="listado_sql.jsp">Lista JSTL+SQL</a>
        <a href="clientes.do">Listado JSTL+Beans</a>

        <form method="GET" action="clientes.do">
            <input type="text" id="nombre_busq" name="nombre_busq"/>
            <input type="submit" value="BUSCAR"/>
        </form>
    </c:if>
</nav>

<%-- <span><%= request.getCookies().length <= 1 ? "" 
        : request.getCookies()[1].getValue() %></span>
<Cookies con EL (Expression Language) --%>
<span>${cookie.nombre_busqueda.value}</span>
<span id="span_cookie_nom"></span>
<script src="js/cookies.js"></script>