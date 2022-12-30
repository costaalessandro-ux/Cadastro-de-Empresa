
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginForm {
    
     public String executa(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        return "forward:../../index.html";
    }
}
