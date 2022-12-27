package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Banco;
import model.Empresa;

public class ListaEmpresas {

    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        request.setAttribute("lista", lista);
        // aqui irá mandar para a servlet, é tipo um dispatecher;
        return "forward:/ListaEmpresa.jsp";

    }
}
