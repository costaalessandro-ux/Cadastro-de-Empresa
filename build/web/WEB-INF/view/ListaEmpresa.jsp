<%@page import="java.util.List"%>
<%@page import="model.Empresa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    List<Empresa> lista = (List<Empresa>) request.getAttribute("lista");
    String nomeEmpresa = (String) request.getAttribute("empresa");
    System.out.println(nomeEmpresa);
%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="./assets/style/style.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>java Stabdard TagLib</title>
    </head>
    <body>
        <!-- Utilizando JSTL -->
        <c:import url="logout-parcial.jsp" />      
        <br>
        <br>
        <br>
        Usuario Logado: ${usuarioLogado.login }
        <br>
        <br>
        <br>
        <!-- Utilizando JSTL + expression language -->
        <h1>Lista de Empresas </h1>
        <ul>
            <c:forEach items="${lista}" var="empresa">
                <li>
                    ${ empresa.name } - <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/> 
                    <a href="/Servlet?acao=removeEmpresa&id=${ empresa.id }">remove</a>
                    <a href="/Servlet?acao=mostrarEmpresa&id=${ empresa.id }">alterar</a>
                </li>
            </c:forEach>
        </ul>
        </br>
        <a href='/index.html'>Voltar</a>
    </body>
</html>
