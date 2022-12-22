
package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Banco;
import model.Empresa;

public class novaEmpresa {
    
    public void executar(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        
        String nomeEmpresa = request.getParameter("nome");
        String paramdataAbertura = request.getParameter("data");

        Date dataAbertura = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(paramdataAbertura);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Empresa empresa = new Empresa();
        empresa.setName(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);
        Banco banco = new Banco();
        banco.adicionar(empresa);
        
        /*
        Este código foi utilizado para dispachar para a outra servlet,
        mas não será usado no momento! Iremos usar response.sendrRedirect.
        
        request.setAttribute("empresa", empresa.getName());
        RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresas");
        rd.forward(request, response);
        */
        
        request.setAttribute("empresa", empresa.getName());
        response.sendRedirect("/Servlet?acao=ListaEmpresas");
    }
    
}
