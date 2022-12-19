<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String nomeEmpresa = (String)request.getAttribute("empresa");
    System.out.println(nomeEmpresa);
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h2>
            <!-- Utilizando JSTL + expression language -->
            <c:if test="${not empty empresa}">
            <strong> A empresa ${ empresa } foi cadastrada com sucesso </strong>
            </c:if>
        </h2>  
          <h2>
            <c:if test="${empty empresa}">
            <strong> Nenhuma empresa foi cadastrada </strong>
            </c:if>
        </h2>  
        </br>
        <a href='/ListaEmpresas'>Lista de Empresas</a>
    </body>
</html>
