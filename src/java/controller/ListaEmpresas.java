package controller;

import dao.Banco;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Empresa;

@WebServlet(name = "ListaEmpresas", urlPatterns = {"/ListaEmpresas"})
public class ListaEmpresas extends HttpServlet {
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresa.jsp");
        request.setAttribute("lista", lista);
        rd.forward(request, response);
        
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
