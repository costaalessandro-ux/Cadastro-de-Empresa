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
                <a class="navbar-brand" href="#">Altera Empresas</a>
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
        <form action="/Servlet" method="post">
            <input type="hidden" name="acao" id="acao" value="alterarEmpresa">
            <input type="hidden" name="id" id="id" value="${empresa.id}">
            <input class="form-control form-control-lg" type="text" name="nome" id="nome" placeholder="${empresa.name}" aria-label=".form-control-lg example" required></br>
            <input class="form-control form-control-lg" type="text" name="data" id="data" placeholder="<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/>" aria-label=".form-control-lg example" required></br>
            <button class="btn btn-primary btn-lg " type="submit">to send</button>
            <button class="btn btn-danger btn-lg" type="reset">clean</button>
        </form>
    </body>
    <footer class="bg-dark text-light">
    <div class="text-center" style="background-color: #333; padding: 20px;">
        &copy 2018 Copyright:
    </div>
</footer>
</html>
