package controller;

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
import model.Banco;
import model.Empresa;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String paramAcao = request.getParameter("acao");
        if (paramAcao.equals("ListaEmpresa")) {
            Banco banco = new Banco();
            List<Empresa> lista = banco.getEmpresas();
            RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresa.jsp");
            request.setAttribute("lista", lista);
            rd.forward(request, response);

        } else if (paramAcao.equals("ListaEmpresa")) {

        } else if (paramAcao.equals("ListaEmpresa")) {

        } else if (paramAcao.equals("ListaEmpresa")) {

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
