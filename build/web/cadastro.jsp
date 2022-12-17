
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String nomeEmpresa = (String)request.getAttribute("empresa");
    System.out.println(nomeEmpresa);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h2>
        <strong> A empresa <%=nomeEmpresa%> foi cadastrada com sucesso </strong>
        </h2>        
        </br>
        <a href='/ListaEmpresas'>Lista de Empresas</a>
    </body>
</html>
