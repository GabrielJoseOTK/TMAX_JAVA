package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5740109949109320353L;

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws IOException {
		
	 	 PrintWriter out = arg1.getWriter();
	 	 out.println("<html>");
	 	out.println("<body>");
	 	out.println("Bom dia.");
	 	out.println("</body>");
	 	out.println("</html>");
	}
}
