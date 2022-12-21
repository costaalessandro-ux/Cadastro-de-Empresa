<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/alterarEmpresa" method="post">
            <input type="hidden" name="id" id="id" value="${empresa.id}">
            Nome:<input type="text" name="nome" id="nome" value="${empresa.name}"></br>
            Data de Abertura:<input type="text" name="data" id="data" value="<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/> ">
            <input type="submit" value="Enviar"></br>
        </form>
    </body>
</html>
