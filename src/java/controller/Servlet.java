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

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String paramAcao = request.getParameter("acao");
        if (paramAcao.equals("ListaEmpresas")) {
            ListaEmpresas acao = new ListaEmpresas();
            acao.executa(request, response);
        } else if (paramAcao.equals("novaEmpresa")) {
            novaEmpresa acao = new novaEmpresa();
            acao.executar(request,response);
            System.out.println("Deu certo");
        } else if (paramAcao.equals("mostrarEmpresa")) {
            mostrarEmpresa acao = new mostrarEmpresa();
            acao.executar(request, response);
        }else if (paramAcao.equals("alterarEmpresa")) {
            alterarEmpresa acao = new alterarEmpresa();
            acao.executar(request, response);
        } else if (paramAcao.equals("removeEmpresa")) {
            removeEmpresa acao = new removeEmpresa();
            acao.executa(request, response);
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
