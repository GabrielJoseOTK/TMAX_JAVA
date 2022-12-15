package br.com.alura.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet(urlPatterns = "/Novaempresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	//em vez de service, para obrigar post escreva doPost//6
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	 	//recebe o que é enviado, nesse caso a url parameter//
		String nomeempresa = request.getParameter("fname");
		String paramDataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
			
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa =  new Empresa();
		empresa.setNome(nomeempresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		request.setAttribute("empresa", empresa.getNome());
		//para impedir repetição é usado uma resposta que envia um novo endereço//
		response.sendRedirect("listaEmpresas");
		
//		//envia, nesse caso um texto html//
//		PrintWriter out = response.getWriter();
//	 	 out.println("<html>");
//	 	out.println("<body>");
//	 	out.println(nomeempresa);
//	 	out.println("Boa Tarde.");
//	 	out.println("</body>");
//	 	out.println("</html>");
	 	
	 	
	 	
//	 	// chama o JSP//
//	 	RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//	 	request.setAttribute("empresa", empresa.getNome());
//	 	
//	 	
//	 	rd.forward(request, response);
	
	
	}

}
