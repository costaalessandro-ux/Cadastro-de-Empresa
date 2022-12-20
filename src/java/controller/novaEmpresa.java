package controller;

import dao.Banco;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Empresa;

@WebServlet(name = "novaEmpresa", urlPatterns = {"/novaEmpresa"})
public class novaEmpresa extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
        response.sendRedirect("ListaEmpresas");
    
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
