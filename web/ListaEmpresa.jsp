<%@page import="java.util.List"%>
<%@page import="model.Empresa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    List<Empresa> lista = (List<Empresa>)request.getAttribute("lista");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Lista de Empresas Cadastradas</h1>
        <ul>
            <%
            for(Empresa empresa : lista){
            %>
            <li><%= empresa.getName() %></li>
            <%
            }
            %>
        </ul>
        </br>
        <a href='/index.html'>Voltar</a>
    </body>
</html>
