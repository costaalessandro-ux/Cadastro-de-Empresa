/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Banco;
import model.Empresa;

/**
 *
 * @author costa
 */
public class mostrarEmpresa {
    
    public void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try ( PrintWriter out = response.getWriter()) {
            String paramId = request.getParameter("id");
            Integer id = Integer.valueOf(paramId);

            Banco banco = new Banco();
            Empresa empresa = banco.buscaEmpresaPeloId(id);
            
            request.setAttribute("empresa", empresa);
            RequestDispatcher rd = request.getRequestDispatcher("/alterar.jsp");
            rd.forward(request, response);
        }
    }
    
}
