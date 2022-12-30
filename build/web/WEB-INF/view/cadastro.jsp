<!DOCTYPE html>
<html>
    <head>
        <title>Gerenciador de Empresas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./assets/style/style.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    </head>
    <header>
    <a href='/Servlet?acao=Logout'>Sair</a>
    </header>
    <body>
        <div>
            <h1>Cadastro de Empresas</h1>
        </div>
        <form action="/Servlet" method="post">
            <input type="hidden" name="acao" id="acao" value="novaEmpresa">
            Nome:<input type="text" name="nome" id="nome" required></br>
            Data de Abertura:<input type="text" name="data" id="data" required>
            <input type="submit" value="Enviar"></br>
        </form>
        </br>
        <a href="/Servlet?acao=ListaEmpresas">Lista de Empresas</a>
    </body>
</html>