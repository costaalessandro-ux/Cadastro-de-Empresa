
package controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Banco;

public class removeEmpresa {
    
    public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException{
            String paramId = request.getParameter("id");
            Integer id = Integer.valueOf(paramId);
            
            Banco banco = new Banco();
            banco.removeEmpresa(id);
            response.sendRedirect("Servlet?acao=ListaEmpresas");
    } 
}
