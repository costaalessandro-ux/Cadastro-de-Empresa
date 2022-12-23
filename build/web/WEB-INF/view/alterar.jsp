<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="./assets/style/style.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
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
