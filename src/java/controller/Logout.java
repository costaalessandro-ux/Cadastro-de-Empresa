
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout { 
    
    public String executa(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
       HttpSession sessao = request.getSession();
       sessao.invalidate();
       return "redirect:Servlet?acao=loginForm";
       
    }
    
}
