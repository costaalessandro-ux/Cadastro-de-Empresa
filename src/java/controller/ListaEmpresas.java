package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Banco;
import model.Empresa;

public class ListaEmpresas {
    
    public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Banco banco = new Banco();
            List<Empresa> lista = banco.getEmpresas();
            RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresa.jsp");
            request.setAttribute("lista", lista);
            rd.forward(request, response);
    }
    
    
}
