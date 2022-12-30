
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class novaEmpresaForm {
      public String executa(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        return "forward:cadastro.jsp";
    }
}
