<%@page import="java.util.List"%>
<%@page import="model.Empresa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
    List<Empresa> lista = (List<Empresa>)request.getAttribute("lista");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>java Stabdard TagLib</title>
    </head>
    <body>
        <!-- Utilizando JSTL -->
        <h1>Lista de Empresas </h1>
        <ul>
            <c:forEach items="${lista}" var="empresa">
                <li>${ empresa.name } - <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/> </li>
            </c:forEach>
        </ul>
        </br>
        <a href='/index.html'>Voltar</a>
    </body>
</html>
