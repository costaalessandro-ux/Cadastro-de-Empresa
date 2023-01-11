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
        <link rel="stylesheet" href="./assets/style/lista.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>java Stabdard TagLib</title>
    </head>
    <header>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Lista de Empresas</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/Servlet?acao=novaEmpresaForm">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/Servlet?acao=ListaEmpresas">Lista de Empresas</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/Servlet?acao=Logout">Logout</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" >${usuarioLogado.login }</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <body>
        <!-- Utilizando JSTL -->     
        <!-- Utilizando JSTL + expression language -->
        <table class="table table-dark table-striped-columns">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">First</th>
                    <th scope="col">Last</th>
                    <th rowspan="1" scope="col">Handle</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${lista}" var="empresa">
                    <tr>
                        <th scope="row">${ empresa.id }</th>
                        <td>${ empresa.name }</td>
                        <td><fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/></td>
                        <td >
                            <a href="/Servlet?acao=removeEmpresa&id=${ empresa.id }">remove</a>
                            <a href="/Servlet?acao=mostrarEmpresa&id=${ empresa.id }">alterar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
    <footer class="bg-dark text-light">
        <div class="text-center" style="background-color: #333; padding: 20px;">
            &copy 2018 Copyright:
        </div>
    </footer>
</html>
