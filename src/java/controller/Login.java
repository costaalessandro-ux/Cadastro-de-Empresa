package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Banco;
import model.Usuario;

public class Login {

    public String executa(HttpServletRequest request, HttpServletResponse response) {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        Banco banco = new Banco();
        Usuario usuario = banco.existeUsuario(login, senha);

        if (usuario != null) {
            System.out.print("usuario existe!");
            return "redirect:Servlet?acao=ListaEmpresas";
        } else {
            return "redirect:Servlet?acao=loginForm";
        }
    }
}
