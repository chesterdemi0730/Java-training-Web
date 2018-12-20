

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String servletname = this.getServletName();
		System.out.println("In this servlet: " + servletname);
		
		response.setContentType("text/html ; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String numA = request.getParameter("numa");
		String numB = request.getParameter("numb");
		int sum = Integer.valueOf(numA) + Integer.valueOf(numB);
		
		out.println("<html>"
				  + "<head>"
				  + "<title>The Sum of the Number</title>"
				  + "</head>"
				  + "<body>"
				  + "<h1>Sum: " + sum + "<h1>"
				  + "<br />"
				  + "<a href=./Arithmetic.html>Try Again</a>"
				  + "</body>"
				  + "</html>");
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
