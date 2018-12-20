

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Arithmetic")
public class Arithmetic extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String servletname = this.getServletName();
		System.out.println("In this servlet: " + servletname);
		
		// Store the input parameter values into Strings
		
		String eval = request.getParameter("matheval");
		ServletContext sc = getServletConfig().getServletContext();
		RequestDispatcher rd = null;
		
		int evaluate = 0;
		
		int add = 0;
		int subtract = 1;
		int multiply = 2;
		int divide = 3;
		
		if (eval.equals("add"))
			evaluate = add;
		
		if (eval.equals("subtract"))
			evaluate = subtract;
		
		if (eval.equals("multiply"))
			evaluate = multiply;
		
		if (eval.equals("divide"))
			evaluate = divide;
		
		switch(evaluate) {
		
		case(0): rd = sc.getRequestDispatcher("/AddServlet");
					 rd.forward(request, response);
					 break;
		
		case(1): rd = sc.getRequestDispatcher("/SubtractServlet");
					 rd.forward(request, response);
					 break;
		
		case(2): rd = sc.getRequestDispatcher("/MultiplyServlet");
					 rd.forward(request, response);
					 break;
					
		case(3): rd = sc.getRequestDispatcher("/DivideServlet");
					 rd.forward(request, response);
					 break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
