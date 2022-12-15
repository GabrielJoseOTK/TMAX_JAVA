package br.com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ListaEmpresas
 */

@WebServlet(urlPatterns = "/Rem")
public class Rem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException { 
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		System.out.println(id);
		
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		response.sendRedirect("listaEmpresas");
	
	}
	

}