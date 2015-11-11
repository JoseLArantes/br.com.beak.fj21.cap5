package br.com.beak.fj21.cap5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/contador")
public class ContadorServlet extends HttpServlet{
	private int contador=0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
		contador++;
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Contador é "+contador);
		out.println("</body>");
		out.println("</html>");
	}
	
	
	
	
}
