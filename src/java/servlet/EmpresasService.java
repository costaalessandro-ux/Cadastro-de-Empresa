package servlet;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Banco;
import model.Empresa;

@WebServlet(urlPatterns = "/empresas")
public class EmpresasService extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        List<Empresa> empresas = new Banco().getEmpresas();
        
        /*
        //utiliza json
        Gson gson = new Gson();
        String json = gson.toJson(empresas);
        response.setContentType("apllication/json");
        response.getWriter().print(json);
        */
        
        
        //utiliza xml
        XStream xstream = new XStream();
        xstream.alias("empresa", Empresa.class);
        String xml = xstream.toXML(empresas);
        response.setContentType("apllication/xml");
        response.getWriter().print(xml);
        
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
