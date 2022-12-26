package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
            //tem relação com o tempo que o usuário esta logado;
            HttpSession sessao = request.getSession();
            sessao.setAttribute("usuarioLogado", usuario);
            return "redirect:/Servlet?acao=ListaEmpresas";
        } else {
            return "redirect:/Servlet?acao=loginForm";
        }
    }
}
