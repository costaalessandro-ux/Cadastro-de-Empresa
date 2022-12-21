
package controller;

import model.Banco;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Empresa;

@WebServlet(name = "alterarEmpresa", urlPatterns = {"/alterarEmpresa"})
public class alterarEmpresa extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
        
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
        
        response.sendRedirect("ListaEmpresas");
            
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
