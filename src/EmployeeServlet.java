

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html ; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String number = request.getParameter("number");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String hiredate = request.getParameter("hiredate");
		String sal = request.getParameter("sal");
		String comm = request.getParameter("comm");
		String deptno = request.getParameter("deptno");
		
		out.println("<html>"
				  + "<head>"
				  + "<title>Employee Update</title>"
				  + "</head>"
				  + "<body>"
				  + "<div style=\"text-align:center\">"
				  + "<table align=\"center\" border=\"1\">"
				  + "<tr>"
				  + 	"<th>�s�@�@��</th>"
				  + 	"<th>�m�@�@�W</th>"
				  + 	"<th>�ʡ@�@�O</th>"
				  + 	"<th>¾�@�@��</th>"
				  + 	"<th>�J¾���</th>"
				  + 	"<th>�~�@�@��</th>"
				  + 	"<th>���@�@��</th>"
				  + 	"<th>���@�@��</th>"
				  + "</tr>"
				  + "<tr>"
				  + 	"<td align=\"center\">" + number   + "</td>"
				  + 	"<td align=\"center\">" + name     + "</td>"
				  + 	"<td align=\"center\">" + gender   + "</td>"
				  + 	"<td align=\"center\">" + job      + "</td>"
				  + 	"<td align=\"center\">" + hiredate + "</td>"
				  + 	"<td align=\"center\">" + sal      + "</td>"
				  + 	"<td align=\"center\">" + comm     + "</td>"
				  + 	"<td align=\"center\">" + deptno   + "</td>"
				  + "</tr>"
				  + "</table>"
				  + "</div>"
				  + "</body>"
				  + "</html>");
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
