package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Banco;
import model.Empresa;

public class ListaEmpresas {

    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession sessao = request.getSession();
        if (sessao.getAttribute("usuarioLogado") == null) {
            return "redirect:Servlet?acao=loginForm";
        }
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        request.setAttribute("lista", lista);
        // aqui irá mandar para a servlet, é tipo um dispatecher;
        return "forward:/ListaEmpresa.jsp";

    }
}
