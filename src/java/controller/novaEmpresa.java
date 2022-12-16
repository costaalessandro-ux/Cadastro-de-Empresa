package controller;

import dao.Banco;
import java.io.IOException;
import java.io.PrintWriter;
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
        
       try ( PrintWriter out = response.getWriter()) {
            
            String nomeEmpresa = request.getParameter("nome"); 
            Empresa empresa = new Empresa();
            empresa.setName(nomeEmpresa);
            
            Banco banco = new Banco();
            banco.adicionar(empresa);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet novaEmpresa</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</br>");
            out.println("Empresa: "+ nomeEmpresa +" ");
            out.println("</br>");
            out.println("Cadastrada com sucesso. ");
            out.println("</br>");
            out.println("<a href='/ListaEmpresas'>Lista de Empresas</a>");
            out.println("</body>");
            out.println("</html>");
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
