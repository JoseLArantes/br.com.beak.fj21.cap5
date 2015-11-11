package br.com.beak.fj21.cap5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OlaMundo extends HttpServlet{
	
	@Override
	protected void service (HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Titulo da Pagina</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Primeira mensagem usando servlet.</h2>");
		out.println("</body>");
		out.println("</html>");
	}
}
