package servlet;

import controller.ListaEmpresas;
import controller.Login;
import controller.Logout;
import controller.alterarEmpresa;
import controller.loginForm;
import controller.mostrarEmpresa;
import controller.novaEmpresa;
import controller.removeEmpresa;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String paramAcao = request.getParameter("acao");
        
        /*
        HttpSession sessao = request.getSession();
        boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
        boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("loginForm"));

        if (ehUmaAcaoProtegida && usuarioNaoEstaLogado) {
            response.sendRedirect("/Servlet?acao=loginForm");
            return;
        }
        */

        String nome = null;

        if (paramAcao.equals("Login")) {
            Login acao = new Login();
            nome = acao.executa(request, response);
        } else if (paramAcao.equals("loginForm")) {
            loginForm acao = new loginForm();
            nome = acao.executa(request, response);
        } else if (paramAcao.equals("Logout")) {
            Logout acao = new Logout();
            nome = acao.executa(request, response);
        }

        if (paramAcao.equals("ListaEmpresas")) {
            ListaEmpresas acao = new ListaEmpresas();
            nome = acao.executa(request, response);
        } else if (paramAcao.equals("novaEmpresa")) {
            novaEmpresa acao = new novaEmpresa();
            nome = acao.executar(request, response);
        } else if (paramAcao.equals("mostrarEmpresa")) {
            mostrarEmpresa acao = new mostrarEmpresa();
            nome = acao.executar(request, response);
        } else if (paramAcao.equals("alterarEmpresa")) {
            alterarEmpresa acao = new alterarEmpresa();
            nome = acao.executar(request, response);
        } else if (paramAcao.equals("removeEmpresa")) {
            removeEmpresa acao = new removeEmpresa();
            nome = acao.executa(request, response);
        }
        // aqui foi criada uma array para separar o nomes;
        // e tambem é uma condição;
        String[] tipoEndereco = nome.split(":");
        if (tipoEndereco[0].equals("forward")) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEndereco[1]);
            rd.forward(request, response);
        } else {
            response.sendRedirect(tipoEndereco[1]);
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
