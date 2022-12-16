package controller;

import dao.Banco;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Lista de Empresas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Lista de Empresas</h1>");
            out.println("<ul>");
            for(Empresa empresa : lista){
                out.println("<li>" +empresa.getName() + "</li>");
            }
            out.println("</ul>");
            out.println("</br>");
            out.println("<a href='/index.html'>Voltar</a>");
            out.println("</body>");
            out.println("</html>");
        }
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
