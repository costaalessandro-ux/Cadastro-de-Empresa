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

public class alterarEmpresa {
    
    public String executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
         String paramId = request.getParameter("id");
        String nomeEmpresa = request.getParameter("nome");
        String paramdataAbertura = request.getParameter("data");
        Integer id = Integer.valueOf(paramId);
        Date dataAbertura = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(paramdataAbertura);
        } catch (ParseException e) {
            throw new ServletException(e);
        }
        Banco banco = new Banco();
        Empresa empresa = banco.buscaEmpresaPeloId(id);
        empresa.setName(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);
        return "redirect:Servlet?acao=ListaEmpresas";
    }
}
