<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="./assets/style/style.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <header>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Cadastro de Empresas</a>
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
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <body>
        <form action="/Servlet" method="post">
            <input type="hidden" name="acao" id="acao" value="alterarEmpresa">
            <input type="hidden" name="id" id="id" value="${empresa.id}">
            Nome:<input type="text" name="nome" id="nome" value="${empresa.name}"></br>
            Data de Abertura:<input type="text" name="data" id="data" value="<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/> ">
            <input type="submit" name="acao=alterarEmpresa" value="Enviar"></br>
        </form>
    </body>
</html>
