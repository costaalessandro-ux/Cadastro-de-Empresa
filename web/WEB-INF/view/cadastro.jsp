<!DOCTYPE html>
<html>
    <head>
        <title>Cadastro de Empresas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./assets/style/cadastro.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
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
        <form class="form-control" action="/Servlet" method="post">
            <input type="hidden" name="acao" id="acao" value="novaEmpresa">
            <input class="form-control form-control-lg" type="text" name="nome" id="nome" placeholder="company name" aria-label=".form-control-lg example" required></br>
            <input class="form-control form-control-lg" type="text" name="data" id="data" placeholder="date" aria-label=".form-control-lg example" required></br>
            <button class="btn btn-primary btn-lg " type="submit">to send</button>
            <button class="btn btn-danger btn-lg" type="reset">clean</button>
        </form>
        </br>
    </body>
</html>