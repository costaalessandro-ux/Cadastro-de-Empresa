
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class novaEmpresaForm {
    
    public String executa(HttpServletRequest request, HttpServletResponse response){
        
        return "forward:ListaEmpresa.jsp";
    }
}
